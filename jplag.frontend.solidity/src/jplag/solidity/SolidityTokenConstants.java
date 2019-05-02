package jplag.solidity;

public interface SolidityTokenConstants extends jplag.TokenConstants{
	final static int FILE_END = 0;
	
	final static int IMPORT = 1;
	final static int CONTRACT_BEGIN = 2;
	final static int CONTRACT_END = 3;
	final static int METHOD_BEGIN = 4;
	final static int METHOD_END = 5;
	final static int ASSIGN = 6;
	final static int WHILE_BEGIN = 7;
	final static int WHILE_END = 8;
	final static int FOR_BEGIN = 9;
	final static int FOR_END = 10;
	final static int IF_BEGIN = 11;
	final static int IF_END = 12;
	final static int CONTINUE = 13;
	final static int BREAK = 14;
	final static int RETURN =15;
	final static int THROW = 16;
	final static int EMIT = 17;
	final static int DEC_BEGIN = 18;
	final static int DEC_END = 19;
	final static int DO_BEGIN =20;
	final static int DO_END = 21;
	final static int ASSEMBLY = 22;
	final static int EXPRESSION = 23;
	
	final static int NUM_OF_TOKENS = 24;
	
}
