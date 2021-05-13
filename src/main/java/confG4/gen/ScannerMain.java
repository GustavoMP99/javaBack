// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC - I Semestre 2021/Compi/backendJava/backendJava/src/main/java/confG4\ScannerMain.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScannerMain extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, RETURN=3, CLASS=4, NEW=5, STRING=6, INT=7, BOOLEAN=8, LENGTH=9, 
		WHILE=10, TRUE=11, FALSE=12, OR=13, PRINT=14, AND=15, CHAR=16, EQUAL=17, 
		LEFTP=18, RIGTHP=19, LEFTPB=20, RIGTHPB=21, LEFTPC=22, RIGTHPC=23, SEMICOLON=24, 
		POINT=25, ALERT=26, IDENTICAL=27, COMA=28, MINUS=29, MAX=30, DIF=31, MINUSEQUAL=32, 
		MAXEQUAL=33, UNDERSCORE=34, EXTRA=35, SUM=36, SUBTRACT=37, MULT=38, DIV=39, 
		WS=40, COMMENT=41, INTLITERAL=42, STRINGLITERAL=43, REALLITERAL=44, ID=45, 
		LETTER=46, DIGIT=47, PRINTABLE=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "RETURN", "CLASS", "NEW", "STRING", "INT", "BOOLEAN", "LENGTH", 
			"WHILE", "TRUE", "FALSE", "OR", "PRINT", "AND", "CHAR", "EQUAL", "LEFTP", 
			"RIGTHP", "LEFTPB", "RIGTHPB", "LEFTPC", "RIGTHPC", "SEMICOLON", "POINT", 
			"ALERT", "IDENTICAL", "COMA", "MINUS", "MAX", "DIF", "MINUSEQUAL", "MAXEQUAL", 
			"UNDERSCORE", "EXTRA", "SUM", "SUBTRACT", "MULT", "DIV", "WS", "COMMENT", 
			"INTLITERAL", "STRINGLITERAL", "REALLITERAL", "ID", "LETTER", "DIGIT", 
			"PRINTABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'class'", "'new'", "'string'", "'int'", 
			"'boolean'", "'length'", "'while'", "'true'", "'false'", "'or'", "'print'", 
			"'and'", "'char'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"'.'", "'!'", "'=='", "','", "'<'", "'>'", "'!='", "'<='", "'>='", "'_'", 
			"'\"'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "RETURN", "CLASS", "NEW", "STRING", "INT", "BOOLEAN", 
			"LENGTH", "WHILE", "TRUE", "FALSE", "OR", "PRINT", "AND", "CHAR", "EQUAL", 
			"LEFTP", "RIGTHP", "LEFTPB", "RIGTHPB", "LEFTPC", "RIGTHPC", "SEMICOLON", 
			"POINT", "ALERT", "IDENTICAL", "COMA", "MINUS", "MAX", "DIF", "MINUSEQUAL", 
			"MAXEQUAL", "UNDERSCORE", "EXTRA", "SUM", "SUBTRACT", "MULT", "DIV", 
			"WS", "COMMENT", "INTLITERAL", "STRINGLITERAL", "REALLITERAL", "ID", 
			"LETTER", "DIGIT", "PRINTABLE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ScannerMain(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScannerMain.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\6)\u00ed\n)\r)\16)\u00ee\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u010d\n*\f*\16*\u0110\13*"+
		"\3+\3+\7+\u0114\n+\f+\16+\u0117\13+\3,\3,\7,\u011b\n,\f,\16,\u011e\13"+
		",\3,\3,\3-\3-\7-\u0124\n-\f-\16-\u0127\13-\3-\3-\7-\u012b\n-\f-\16-\u012e"+
		"\13-\3-\3-\3-\7-\u0133\n-\f-\16-\u0136\13-\5-\u0138\n-\3.\3.\3.\3.\3."+
		"\7.\u013f\n.\f.\16.\u0142\13.\5.\u0144\n.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u0168\n\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2"+
		"\5\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u0194\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5f\3\2"+
		"\2\2\7k\3\2\2\2\tr\3\2\2\2\13x\3\2\2\2\r|\3\2\2\2\17\u0083\3\2\2\2\21"+
		"\u0087\3\2\2\2\23\u008f\3\2\2\2\25\u0096\3\2\2\2\27\u009c\3\2\2\2\31\u00a1"+
		"\3\2\2\2\33\u00a7\3\2\2\2\35\u00aa\3\2\2\2\37\u00b0\3\2\2\2!\u00b4\3\2"+
		"\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1"+
		"\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2"+
		"\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d9\3\2\2\2C\u00dc\3\2\2\2E\u00df\3\2\2\2G"+
		"\u00e1\3\2\2\2I\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00e9\3\2"+
		"\2\2Q\u00ec\3\2\2\2S\u00f2\3\2\2\2U\u0111\3\2\2\2W\u0118\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u0143\3\2\2\2]\u0145\3\2\2\2_\u0147\3\2\2\2a\u0167\3\2\2\2c"+
		"d\7k\2\2de\7h\2\2e\4\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\6\3"+
		"\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\b\3\2\2"+
		"\2rs\7e\2\2st\7n\2\2tu\7c\2\2uv\7u\2\2vw\7u\2\2w\n\3\2\2\2xy\7p\2\2yz"+
		"\7g\2\2z{\7y\2\2{\f\3\2\2\2|}\7u\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7"+
		"k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7i\2\2\u0082\16\3\2\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\20\3\2\2\2\u0087\u0088"+
		"\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092\u0093\7i\2\2"+
		"\u0093\u0094\7v\2\2\u0094\u0095\7j\2\2\u0095\24\3\2\2\2\u0096\u0097\7"+
		"y\2\2\u0097\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7g\2\2\u009b\26\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7w\2\2\u009f\u00a0\7g\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\34\3\2\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7"+
		"p\2\2\u00b2\u00b3\7f\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6"+
		"\7j\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\"\3\2\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc&\3\2\2\2\u00bd\u00be\7"+
		"+\2\2\u00be(\3\2\2\2\u00bf\u00c0\7}\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7\177"+
		"\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7]\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7_\2"+
		"\2\u00c6\60\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7"+
		"\60\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\66\3\2\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\u00cf\7?\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1:\3"+
		"\2\2\2\u00d2\u00d3\7>\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5>\3\2"+
		"\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7?\2\2\u00d8@\3\2\2\2\u00d9\u00da"+
		"\7>\2\2\u00da\u00db\7?\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\u00de"+
		"\7?\2\2\u00deD\3\2\2\2\u00df\u00e0\7a\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7"+
		"$\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7/"+
		"\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8N\3\2\2\2\u00e9\u00ea\7\61"+
		"\2\2\u00eaP\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b)\2\2\u00f1R\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7\61\2\2"+
		"\u00f4\u010e\3\2\2\2\u00f5\u010d\5]/\2\u00f6\u010d\5_\60\2\u00f7\u010d"+
		"\t\2\2\2\u00f8\u00f9\7B\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7&\2\2\u00fb"+
		"\u00fc\7\'\2\2\u00fc\u00fd\7`\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7,\2"+
		"\2\u00ff\u0100\7#\2\2\u0100\u0101\7a\2\2\u0101\u0102\7/\2\2\u0102\u0103"+
		"\7-\2\2\u0103\u0104\7?\2\2\u0104\u0105\7\60\2\2\u0105\u0106\7.\2\2\u0106"+
		"\u0107\7@\2\2\u0107\u0108\7>\2\2\u0108\u0109\7A\2\2\u0109\u010a\7\61\2"+
		"\2\u010a\u010b\7b\2\2\u010b\u010d\7$\2\2\u010c\u00f5\3\2\2\2\u010c\u00f6"+
		"\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00f8\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fT\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u0115\5_\60\2\u0112\u0114\5_\60\2\u0113\u0112\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116V\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011c\5G$\2\u0119\u011b\5a\61\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5G$\2\u0120X\3\2\2\2\u0121\u0125"+
		"\5_\60\2\u0122\u0124\5_\60\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u012c\5\63\32\2\u0129\u012b\5_\60\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0138\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\5\63\32\2\u0130\u0134\5_\60\2\u0131"+
		"\u0133\5_\60\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0121\3\2\2\2\u0137\u012f\3\2\2\2\u0138Z\3\2\2\2\u0139\u0144\5E#\2\u013a"+
		"\u0140\5]/\2\u013b\u013f\5E#\2\u013c\u013f\5]/\2\u013d\u013f\5_\60\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013a\3\2\2\2\u0144\\\3\2\2\2"+
		"\u0145\u0146\t\3\2\2\u0146^\3\2\2\2\u0147\u0148\t\4\2\2\u0148`\3\2\2\2"+
		"\u0149\u0168\5]/\2\u014a\u0168\5_\60\2\u014b\u0168\7\"\2\2\u014c\u0168"+
		"\5\65\33\2\u014d\u0168\5G$\2\u014e\u0168\4%)\2\u014f\u0168\5%\23\2\u0150"+
		"\u0168\5\'\24\2\u0151\u0168\5M\'\2\u0152\u0168\5I%\2\u0153\u0168\59\35"+
		"\2\u0154\u0168\5K&\2\u0155\u0168\5\63\32\2\u0156\u0168\5O(\2\u0157\u0168"+
		"\7<\2\2\u0158\u0168\5\61\31\2\u0159\u0168\5;\36\2\u015a\u0168\5#\22\2"+
		"\u015b\u0168\5=\37\2\u015c\u0168\4AB\2\u015d\u0168\5-\27\2\u015e\u0168"+
		"\7^\2\2\u015f\u0168\5/\30\2\u0160\u0168\7`\2\2\u0161\u0168\5E#\2\u0162"+
		"\u0168\7b\2\2\u0163\u0168\5)\25\2\u0164\u0168\7~\2\2\u0165\u0168\5+\26"+
		"\2\u0166\u0168\7\u0080\2\2\u0167\u0149\3\2\2\2\u0167\u014a\3\2\2\2\u0167"+
		"\u014b\3\2\2\2\u0167\u014c\3\2\2\2\u0167\u014d\3\2\2\2\u0167\u014e\3\2"+
		"\2\2\u0167\u014f\3\2\2\2\u0167\u0150\3\2\2\2\u0167\u0151\3\2\2\2\u0167"+
		"\u0152\3\2\2\2\u0167\u0153\3\2\2\2\u0167\u0154\3\2\2\2\u0167\u0155\3\2"+
		"\2\2\u0167\u0156\3\2\2\2\u0167\u0157\3\2\2\2\u0167\u0158\3\2\2\2\u0167"+
		"\u0159\3\2\2\2\u0167\u015a\3\2\2\2\u0167\u015b\3\2\2\2\u0167\u015c\3\2"+
		"\2\2\u0167\u015d\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0167"+
		"\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2"+
		"\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"b\3\2\2\2\20\2\u00ee\u010c\u010e\u0115\u011c\u0125\u012c\u0134\u0137\u013e"+
		"\u0140\u0143\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}