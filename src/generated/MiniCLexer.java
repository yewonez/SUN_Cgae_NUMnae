// Generated from C:/Users/deer9/Desktop/junior_second/compiler/5-2week/BytecodeGenerator2019-master/src\MiniC.g4 by ANTLR 4.7.2
 
package generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, VOID=20, INT=21, WHILE=22, IF=23, ELSE=24, RETURN=25, 
		OR=26, AND=27, LE=28, GE=29, EQ=30, NE=31, IDENT=32, LITERAL=33, DecimalConstant=34, 
		OctalConstant=35, HexadecimalConstant=36, WS=37;
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
			"T__17", "T__18", "VOID", "INT", "WHILE", "IF", "ELSE", "RETURN", "OR", 
			"AND", "LE", "GE", "EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", 
			"OctalConstant", "HexadecimalConstant", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "','", "'{'", "'}'", "'-'", "'+'", 
			"'--'", "'++'", "'*'", "'/'", "'%'", "'<'", "'>'", "'!'", "'['", "']'", 
			"'void'", "'int'", "'while'", "'if'", "'else'", "'return'", "'or'", "'and'", 
			"'<='", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "VOID", "INT", "WHILE", 
			"IF", "ELSE", "RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", 
			"LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
			"WS"
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


	public MiniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\7!\u00a9\n!\f!\16!\u00ac\13!"+
		"\3\"\3\"\3\"\5\"\u00b1\n\"\3#\3#\3#\7#\u00b6\n#\f#\16#\u00b9\13#\5#\u00bb"+
		"\n#\3$\3$\7$\u00bf\n$\f$\16$\u00c2\13$\3%\3%\3%\6%\u00c7\n%\r%\16%\u00c8"+
		"\3&\6&\u00cc\n&\r&\16&\u00cd\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\n\5\2C"+
		"\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\629\4\2ZZzz\5\2\62;CHch\5\2"+
		"\13\f\17\17\"\"\2\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7"+
		"Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23"+
		"]\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2"+
		"\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2\2+z\3\2"+
		"\2\2-~\3\2\2\2/\u0084\3\2\2\2\61\u0087\3\2\2\2\63\u008c\3\2\2\2\65\u0093"+
		"\3\2\2\2\67\u0096\3\2\2\29\u009a\3\2\2\2;\u009d\3\2\2\2=\u00a0\3\2\2\2"+
		"?\u00a3\3\2\2\2A\u00a6\3\2\2\2C\u00b0\3\2\2\2E\u00ba\3\2\2\2G\u00bc\3"+
		"\2\2\2I\u00c3\3\2\2\2K\u00cb\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7?\2\2P\6\3"+
		"\2\2\2QR\7*\2\2R\b\3\2\2\2ST\7+\2\2T\n\3\2\2\2UV\7.\2\2V\f\3\2\2\2WX\7"+
		"}\2\2X\16\3\2\2\2YZ\7\177\2\2Z\20\3\2\2\2[\\\7/\2\2\\\22\3\2\2\2]^\7-"+
		"\2\2^\24\3\2\2\2_`\7/\2\2`a\7/\2\2a\26\3\2\2\2bc\7-\2\2cd\7-\2\2d\30\3"+
		"\2\2\2ef\7,\2\2f\32\3\2\2\2gh\7\61\2\2h\34\3\2\2\2ij\7\'\2\2j\36\3\2\2"+
		"\2kl\7>\2\2l \3\2\2\2mn\7@\2\2n\"\3\2\2\2op\7#\2\2p$\3\2\2\2qr\7]\2\2"+
		"r&\3\2\2\2st\7_\2\2t(\3\2\2\2uv\7x\2\2vw\7q\2\2wx\7k\2\2xy\7f\2\2y*\3"+
		"\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2},\3\2\2\2~\177\7y\2\2\177\u0080\7j\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083.\3\2"+
		"\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\60\3\2\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b"+
		"\62\3\2\2\2\u008c\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7t\2\2\u0091\u0092\7p\2\2\u0092\64\3\2\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\66\3\2\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7f\2\2\u00998\3\2\2\2\u009a\u009b\7>\2\2\u009b"+
		"\u009c\7?\2\2\u009c:\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f\7?\2\2\u009f"+
		"<\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7?\2\2\u00a2>\3\2\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4\u00a5\7?\2\2\u00a5@\3\2\2\2\u00a6\u00aa\t\2\2\2\u00a7\u00a9"+
		"\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00abB\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5E#\2\u00ae"+
		"\u00b1\5G$\2\u00af\u00b1\5I%\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1D\3\2\2\2\u00b2\u00bb\7\62\2\2\u00b3\u00b7\t"+
		"\4\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bbF\3\2\2\2\u00bc\u00c0"+
		"\7\62\2\2\u00bd\u00bf\t\6\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1H\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c6\t\7\2\2\u00c5\u00c7\t\b\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9J\3\2\2\2\u00ca\u00cc\t\t\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\b&\2\2\u00d0L\3\2\2\2\13\2\u00a8\u00aa\u00b0\u00b7\u00ba\u00c0"+
		"\u00c8\u00cd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}