// Generated from C:/Users/EnriqueJRodriguez/git/DLP/UO257565_Pmm/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, TRASH=37, ONELINECOMMENTARY=38, 
		MULTIPLELINESCOMMENT=39, ID=40, INT_CONSTANT=41, REAL_CONSTANT=42, CHAR_CONSTANT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "TRASH", "ONELINECOMMENTARY", "MULTIPLELINESCOMMENT", 
			"ID", "INT_CONSTANT", "REAL_CONSTANT", "DECIMAL", "CHAR_CONSTANT", "EXPONENT", 
			"DIGIT", "LETTER", "QUOTE", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'struct'", "'{'", "'}'", "'['", "']'", "','", "'def'", 
			"'('", "')'", "'='", "'print'", "'input'", "'return'", "'if'", "'else'", 
			"'while'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'int'", "'double'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRASH", "ONELINECOMMENTARY", "MULTIPLELINESCOMMENT", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3\'\3\'\7\'\u00e0\n\'\f\'\16\'\u00e3\13\'\3\'\5\'\u00e6\n\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\7(\u00ef\n(\f(\16(\u00f2\13(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\5)\u00fc\n)\3)\3)\3)\7)\u0101\n)\f)\16)\u0104\13)\3*\3*\7*\u0108"+
		"\n*\f*\16*\u010b\13*\3*\5*\u010e\n*\3+\3+\5+\u0112\n+\3+\5+\u0115\n+\3"+
		",\5,\u0118\n,\3,\3,\6,\u011c\n,\r,\16,\u011d\3,\3,\3,\6,\u0123\n,\r,\16"+
		",\u0124\5,\u0127\n,\5,\u0129\n,\3-\3-\3-\3-\3-\3-\3-\6-\u0132\n-\r-\16"+
		"-\u0133\3-\3-\3-\3-\3-\3-\3-\5-\u013d\n-\3.\3.\5.\u0141\n.\3.\6.\u0144"+
		"\n.\r.\16.\u0145\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\4\u00e1\u00f0\2\63"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[\2]\2_\2a\2c\2\3\2\13\5\2\13\f\17\17"+
		"\"\"\3\3\f\f\3\2\63;\3\2))\4\2ppvv\4\2GGgg\4\2--//\3\2\62;\4\2C\\c|\2"+
		"\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tp\3\2\2"+
		"\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25~\3\2"+
		"\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u008a\3\2\2"+
		"\2\37\u0090\3\2\2\2!\u0097\3\2\2\2#\u009a\3\2\2\2%\u009f\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b8"+
		"\3\2\2\2;\u00ba\3\2\2\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c3\3\2\2\2C"+
		"\u00c6\3\2\2\2E\u00c9\3\2\2\2G\u00cd\3\2\2\2I\u00d4\3\2\2\2K\u00d9\3\2"+
		"\2\2M\u00dd\3\2\2\2O\u00e9\3\2\2\2Q\u00fb\3\2\2\2S\u010d\3\2\2\2U\u0111"+
		"\3\2\2\2W\u0128\3\2\2\2Y\u013c\3\2\2\2[\u013e\3\2\2\2]\u0147\3\2\2\2_"+
		"\u0149\3\2\2\2a\u014b\3\2\2\2c\u014d\3\2\2\2ef\7<\2\2f\4\3\2\2\2gh\7="+
		"\2\2h\6\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mn\7e\2\2no\7v\2\2"+
		"o\b\3\2\2\2pq\7}\2\2q\n\3\2\2\2rs\7\177\2\2s\f\3\2\2\2tu\7]\2\2u\16\3"+
		"\2\2\2vw\7_\2\2w\20\3\2\2\2xy\7.\2\2y\22\3\2\2\2z{\7f\2\2{|\7g\2\2|}\7"+
		"h\2\2}\24\3\2\2\2~\177\7*\2\2\177\26\3\2\2\2\u0080\u0081\7+\2\2\u0081"+
		"\30\3\2\2\2\u0082\u0083\7?\2\2\u0083\32\3\2\2\2\u0084\u0085\7r\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2"+
		"\u0089\34\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7"+
		"r\2\2\u008d\u008e\7w\2\2\u008e\u008f\7v\2\2\u008f\36\3\2\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7p\2\2\u0096 \3\2\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\"\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e$\3\2\2\2\u009f\u00a0\7y\2\2\u00a0"+
		"\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4&\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7/\2\2"+
		"\u00a8*\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4"+
		"\66\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b78\3\2\2\2\u00b8"+
		"\u00b9\7>\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7?\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf>\3\2\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1\u00c2\7?\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c5"+
		"\7(\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7~\2\2\u00c7\u00c8\7~\2\2\u00c8D\3"+
		"\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"F\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d1\7d\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3H\3\2\2\2\u00d4"+
		"\u00d5\7e\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8J\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b"+
		"&\2\2\u00dcL\3\2\2\2\u00dd\u00e1\7%\2\2\u00de\u00e0\13\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\t\3\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\'\2\2\u00e8N\3\2\2\2\u00e9\u00ea"+
		"\7$\2\2\u00ea\u00eb\7$\2\2\u00eb\u00ec\7$\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00ef\13\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7$\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u00f8\b(\2\2\u00f8P\3\2\2\2\u00f9\u00fc\5_\60\2\u00fa\u00fc\7"+
		"a\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u0102\3\2\2\2\u00fd"+
		"\u0101\5_\60\2\u00fe\u0101\5]/\2\u00ff\u0101\7a\2\2\u0100\u00fd\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103R\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0109\t\4\2\2\u0106\u0108\5]/\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010e\7\62\2\2\u010d\u0105\3\2\2\2\u010d\u010c\3\2\2\2"+
		"\u010eT\3\2\2\2\u010f\u0112\5S*\2\u0110\u0112\5W,\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5[.\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115V\3\2\2\2\u0116\u0118\5S*\2\u0117\u0116"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\60\2\2"+
		"\u011a\u011c\5]/\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0129\3\2\2\2\u011f\u0120\5S*\2\u0120"+
		"\u0126\7\60\2\2\u0121\u0123\5]/\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0117\3\2"+
		"\2\2\u0128\u011f\3\2\2\2\u0129X\3\2\2\2\u012a\u012b\5a\61\2\u012b\u012c"+
		"\n\5\2\2\u012c\u012d\5a\61\2\u012d\u013d\3\2\2\2\u012e\u012f\5a\61\2\u012f"+
		"\u0131\5c\62\2\u0130\u0132\5]/\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\5a\61\2\u0136\u013d\3\2\2\2\u0137\u0138\5a\61\2\u0138\u0139\5c\62\2\u0139"+
		"\u013a\t\6\2\2\u013a\u013b\5a\61\2\u013b\u013d\3\2\2\2\u013c\u012a\3\2"+
		"\2\2\u013c\u012e\3\2\2\2\u013c\u0137\3\2\2\2\u013dZ\3\2\2\2\u013e\u0140"+
		"\t\7\2\2\u013f\u0141\t\b\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0144\5]/\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2"+
		"\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\\\3\2\2\2\u0147\u0148"+
		"\t\t\2\2\u0148^\3\2\2\2\u0149\u014a\t\n\2\2\u014a`\3\2\2\2\u014b\u014c"+
		"\7)\2\2\u014cb\3\2\2\2\u014d\u014e\7^\2\2\u014ed\3\2\2\2\26\2\u00e1\u00e5"+
		"\u00f0\u00fb\u0100\u0102\u0109\u010d\u0111\u0114\u0117\u011d\u0124\u0126"+
		"\u0128\u0133\u013c\u0140\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}