package jplag.solidity;

public class SolidityToken extends jplag.Token implements SolidityTokenConstants{
	private int line, column, length;
	
	public SolidityToken(int type, String file, int line, int column, int length) {
		super(type, file, line, column, length);
	}
	
    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public int getLength() {
        return length;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public static String type2string(int type) {
    	switch(type) {
    		case SolidityTokenConstants.FILE_END:
    			return "********";
    	
    		case IMPORT:
    			return "IMPORT";
    		case CONTRACT_BEGIN:
    			return "CONTRACT{";
    		case CONTRACT_END:
    			return "}CONTRACT";
    		case METHOD_BEGIN:
    			return "METHOD{";
    		case METHOD_END:
    			return "}METHOD ";
    		case ASSIGN:
    			return "ASSIGN";
    		case WHILE_BEGIN:
    			return "WHILE{";
    		case WHILE_END:
    			return "}WHILE";
    		case FOR_BEGIN:
    			return "FOR{";
    		case FOR_END:
    			return "}FOR";
    		case IF_BEGIN:
    			return "IF{";
    		case IF_END:
    			return "}IF";
    		case CONTINUE:
    			return "CONTINUE";
    		case BREAK:
    			return "BREAK";
    		case RETURN:
    			return "RETURN";
    		case THROW:
    			return "THROW";
    		case EMIT:
    			return "EMIT";
    		case DEC_BEGIN:
    			return "DEC{";
    		case DEC_END:
    			return "}DEC";
    		case DO_BEGIN:
    			return "DO{";
    		case DO_END:
    			return "}DO";
    		case ASSEMBLY:
    			return "ASSEMBLY";
    		case EXPRESSION:
    			return "EXPRESSION";

    		default:
    			return "<UNBEKANNT>";
    				
    	}
    }
    
    public static int numberOfTokens() {
    	return NUM_OF_TOKENS;
    }

}
