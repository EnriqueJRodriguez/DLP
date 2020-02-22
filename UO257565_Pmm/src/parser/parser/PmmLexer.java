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
		TRASH=1, ONELINECOMMENTARY=2, MULTIPLELINESCOMMENT=3, ID=4, INT_CONSTANT=5, 
		REAL_CONSTANT=6, DECIMAL=7, CHAR_CONSTANT=8, EXPONENT=9, DIGIT=10, LETTER=11, 
		QUOTE=12, ESCAPE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "ONELINECOMMENTARY", "MULTIPLELINESCOMMENT", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "DECIMAL", "CHAR_CONSTANT", "EXPONENT", "DIGIT", "LETTER", 
			"QUOTE", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'''", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "ONELINECOMMENTARY", "MULTIPLELINESCOMMENT", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "DECIMAL", "CHAR_CONSTANT", "EXPONENT", "DIGIT", "LETTER", 
			"QUOTE", "ESCAPE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\7\5"+
		"E\n\5\f\5\16\5H\13\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\5\6R\n\6\3\7"+
		"\3\7\5\7V\n\7\3\7\5\7Y\n\7\3\b\5\b\\\n\b\3\b\3\b\6\b`\n\b\r\b\16\ba\3"+
		"\b\3\b\3\b\6\bg\n\b\r\b\16\bh\5\bk\n\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\tv\n\t\r\t\16\tw\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3"+
		"\n\3\n\5\n\u0085\n\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\4%\64\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\3\2\13\5\2\13\f\17\17\"\"\3\3\f\f\3\2\63;\3"+
		"\2))\4\2ppvv\4\2GGgg\4\2--//\3\2\62;\4\2C\\c|\2\u00a6\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\3\35\3\2\2\2\5!\3\2\2\2\7-\3\2\2\2\t?\3\2\2\2\13Q\3\2\2\2\rU"+
		"\3\2\2\2\17l\3\2\2\2\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u008b\3\2\2"+
		"\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\36\t\2\2\2\36"+
		"\37\3\2\2\2\37 \b\2\2\2 \4\3\2\2\2!%\7%\2\2\"$\13\2\2\2#\"\3\2\2\2$\'"+
		"\3\2\2\2%&\3\2\2\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2(*\t\3\2\2)(\3\2\2\2"+
		"*+\3\2\2\2+,\b\3\2\2,\6\3\2\2\2-.\7$\2\2./\7$\2\2/\60\7$\2\2\60\64\3\2"+
		"\2\2\61\63\13\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\65\3\2\2\2\64\62\3"+
		"\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7$\2\289\7$\2\29:\7$\2\2:;\3\2"+
		"\2\2;<\b\4\2\2<\b\3\2\2\2=@\5\27\f\2>@\7a\2\2?=\3\2\2\2?>\3\2\2\2@F\3"+
		"\2\2\2AE\5\27\f\2BE\5\25\13\2CE\7a\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E"+
		"H\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\n\3\2\2\2HF\3\2\2\2IM\t\4\2\2JL\5\25\13"+
		"\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2\2\2OM\3\2\2\2PR\7\62"+
		"\2\2QI\3\2\2\2QP\3\2\2\2R\f\3\2\2\2SV\5\13\6\2TV\5\17\b\2US\3\2\2\2UT"+
		"\3\2\2\2VX\3\2\2\2WY\5\23\n\2XW\3\2\2\2XY\3\2\2\2Y\16\3\2\2\2Z\\\5\13"+
		"\6\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\60\2\2^`\5\25\13\2_^\3\2\2\2"+
		"`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bm\3\2\2\2cd\5\13\6\2dj\7\60\2\2eg\5\25"+
		"\13\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2l[\3\2\2\2lc\3\2\2\2m\20\3\2\2\2no\5\31\r\2op\n\5\2\2"+
		"pq\5\31\r\2q\u0081\3\2\2\2rs\5\31\r\2su\5\33\16\2tv\5\25\13\2ut\3\2\2"+
		"\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\31\r\2z\u0081\3\2\2\2{"+
		"|\5\31\r\2|}\5\33\16\2}~\t\6\2\2~\177\5\31\r\2\177\u0081\3\2\2\2\u0080"+
		"n\3\2\2\2\u0080r\3\2\2\2\u0080{\3\2\2\2\u0081\22\3\2\2\2\u0082\u0084\t"+
		"\7\2\2\u0083\u0085\t\b\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0088\5\25\13\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008c\t\t\2\2\u008c\26\3\2\2\2\u008d\u008e\t\n\2\2\u008e\30\3\2\2\2\u008f"+
		"\u0090\7)\2\2\u0090\32\3\2\2\2\u0091\u0092\7^\2\2\u0092\34\3\2\2\2\26"+
		"\2%)\64?DFMQUX[ahjlw\u0080\u0084\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}