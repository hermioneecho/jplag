package jplag.solidity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import jplag.InputState;
import jplag.ParserToken;
import jplag.Structure;
import jplag.solidity.grammar.SolidityLexer;
import jplag.solidity.grammar.SolidityParser;

public class Parser extends jplag.Parser implements SolidityTokenConstants {
	private Structure struct;
	private String currentFile;

	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("Only one or more files as parameter allowed.");
			System.exit(-1);
		}
		Parser parser = new Parser();
		parser.setProgram(new jplag.StrippedProgram());
		jplag.Structure struct = parser.parse(null, args);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
			int lineNr = 1;
			int token = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				if (token < struct.size()) {
					boolean first = true;
					while (struct.tokens[token] != null && struct.tokens[token].getLine() == lineNr) {
						if (!first)
							System.out.println();
						SolidityToken tok = (SolidityToken) struct.tokens[token];
						System.out.print(SolidityToken.type2string(tok.type) + " (" + tok.getLine() + "," + tok.getColumn() + ","
								+ tok.getLength() + ")\t");
						first = false;
						token++;
					}
					if (first)
						System.out.print("                \t");
				}
				System.out.println(line);
				lineNr++;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public jplag.Structure parse(File dir, String files[]) {
		struct = new Structure();
		errors = 0;
		for (int i = 0; i < files.length; i++) {
			getProgram().print(null, "Parsing file " + files[i] + "\n");
			if (!parseFile(dir, files[i]))
				errors++;
			System.gc();//Emeric
			struct.addToken(new SolidityToken(FILE_END, files[i], -1, -1, -1));
		}
		this.parseEnd();
		return struct;
	}

	public boolean parseFile(File dir, String file) {
		InputState inputState = null;
		try {
			FileInputStream fis = new FileInputStream(new File(dir, file));
			currentFile = file;
			// Create a scanner that reads from the input stream passed to us
			inputState = new InputState(fis);
			SolidityLexer lexer = new SolidityLexer(inputState);
			lexer.setFilename(file);
			lexer.setTokenObjectClass("jplag.ParserToken");

			// Create a parser that reads from the scanner
			SolidityParser parser = new SolidityParser(lexer);
			parser.setFilename(file);
			parser.parser = this;

			// start parsing at the compilationUnit rule
			parser.compilationUnit();

			// close file
			fis.close();
		} catch (Exception e) {
			getProgram().addError(
					"  Parsing Error in '" + file + "':\n" + "  Parse error at line "
							+ (inputState != null ? "" + inputState.getLine() : "UNKNOWN") + ", column "
							+ (inputState != null ? "" + inputState.tokColumn : "UNKNOWN") + ": " + e.getMessage() + "\n");
			return false;
		}

		return true;
	}

	public void add(int type, antlr.Token tok) {
	      struct.addToken(new SolidityToken(type, (currentFile == null ? "null" : currentFile), tok.getLine(), tok.getCharPositionInLine() + 1,
	                tok.getText().length()));
	}
}