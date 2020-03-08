// Generated from C:/Users/EnriqueJRodriguez/git/DLP/UO257565_Pmm/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
 import ast.*;
				  import ast.definitions.*;
				  import ast.expressions.*;
				  import ast.statements.*;
				  import ast.types.*;
				  import java.util.List;
				  import java.util.ArrayList;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_variable_definition = 1, RULE_identifiers = 2, 
		RULE_function_definition = 3, RULE_function_body = 4, RULE_statement = 5, 
		RULE_expression = 6, RULE_simple_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variable_definition", "identifiers", "function_definition", 
			"function_body", "statement", "expression", "simple_type"
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

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public Variable_definitionContext vd;
		public Function_definitionContext fd;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> definitions = new ArrayList<Definition>();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==ID) {
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(17);
					((ProgramContext)_localctx).vd = variable_definition();
					for(VariableDefinition v : ((ProgramContext)_localctx).vd.ast) {definitions.add(v);}
					}
					break;
				case T__8:
					{
					setState(20);
					((ProgramContext)_localctx).fd = function_definition();
					definitions.add(((ProgramContext)_localctx).fd.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(definitions.get(0).getLine(), definitions.get(0).getColumn(),definitions);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public IdentifiersContext identifiers;
		public Token def;
		public Simple_typeContext st1;
		public Token st;
		public Variable_definitionContext vds;
		public Token ic;
		public Simple_typeContext simple_type;
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_definition);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(32);
				((Variable_definitionContext)_localctx).def = match(T__0);
				setState(33);
				((Variable_definitionContext)_localctx).st1 = simple_type();
				setState(34);
				match(T__1);
				 for(String id : ((Variable_definitionContext)_localctx).identifiers.ast) {
				                                                                                                            _localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                                                            id,((Variable_definitionContext)_localctx).st1.ast));
				                                                                                                        }
				                                                                                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(38);
				((Variable_definitionContext)_localctx).def = match(T__0);
				setState(39);
				((Variable_definitionContext)_localctx).st = match(T__2);
				List<VariableDefinition> variables = new ArrayList<VariableDefinition>();
				                                                                                                     List<FieldDefinition> fields = new ArrayList<FieldDefinition>();
				setState(41);
				match(T__3);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					((Variable_definitionContext)_localctx).vds = variable_definition();
					for(VariableDefinition vd : ((Variable_definitionContext)_localctx).vds.ast) {
					                                                                                                        	  variables.add(vd);
					                                                                                                        	  fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(),
					                                                                                                        	                                 vd.getName(), vd.getType()));
					                                                                                                        	}
					                                                                                                        
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(49);
				match(T__4);
				setState(50);
				match(T__1);
				 for(String id : ((Variable_definitionContext)_localctx).identifiers.ast) {
				                                                                                                    		_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                    		         id,new Struct(((Variable_definitionContext)_localctx).st.getLine(), ((Variable_definitionContext)_localctx).st.getCharPositionInLine() + 1, fields)));
				                                                                                                        }
				                                                                                                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(54);
				((Variable_definitionContext)_localctx).def = match(T__0);
				List<Integer> sizes = new ArrayList<Integer>(); 
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					match(T__5);
					setState(57);
					((Variable_definitionContext)_localctx).ic = match(INT_CONSTANT);
					setState(58);
					match(T__6);
					sizes.add(LexerHelper.lexemeToInt((((Variable_definitionContext)_localctx).ic!=null?((Variable_definitionContext)_localctx).ic.getText():null)));
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				Type t; 
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
				case T__34:
				case T__35:
					{
					setState(65);
					((Variable_definitionContext)_localctx).simple_type = simple_type();
					t=((Variable_definitionContext)_localctx).simple_type.ast;
					}
					break;
				case T__2:
					{
					setState(68);
					((Variable_definitionContext)_localctx).st = match(T__2);
					setState(69);
					match(T__3);
					List<FieldDefinition> fields = new ArrayList<FieldDefinition>();
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(71);
						((Variable_definitionContext)_localctx).vds = variable_definition();
						for(VariableDefinition vd : ((Variable_definitionContext)_localctx).vds.ast) {
						                                                                                                        	fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(),
						                                                                                                        	            vd.getName(), vd.getType()));
						                                                                                                            }
						                                                                                                        
						}
						}
						setState(76); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ID );
					setState(78);
					match(T__4);
					t=new Struct(((Variable_definitionContext)_localctx).st.getLine(), ((Variable_definitionContext)_localctx).st.getCharPositionInLine() + 1, fields);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83);
				match(T__1);

				                                                                                                    	int dimension = sizes.size()-1;
				                                                                                                    	ArrayType array = new ArrayType(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1, sizes.get(0), null);
				                                                                                                    	ArrayType d = array;
				                                                                                                    	while(dimension>1) {
				                                                                                                    	    ArrayType array2 = new ArrayType(((Variable_definitionContext)_localctx).def.getLine(),((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                    	                        sizes.get(sizes.size()-dimension), null);
				                                                                                                    		array.setType(array2);
				                                                                                                    		array = array2;
				                                                                                                    		dimension--;
				                                                                                                    	}
				                                                                                                    	if(dimension == 0) {
				                                                                                                    		array.setType(t);
				                                                                                                    	} else {
				                                                                                                    		array.setType(new ArrayType(((Variable_definitionContext)_localctx).def.getLine(),((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                    		                        sizes.get(sizes.size()-dimension), t));
				                                                                                                    	}
				                                                                                                    	for(String id : ((Variable_definitionContext)_localctx).identifiers.ast) {
				                                                                                                    		_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,id,d));
				                                                                                                    	}
				                                                                                                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((IdentifiersContext)_localctx).id1 = match(ID);
			_localctx.ast.add((((IdentifiersContext)_localctx).id1!=null?((IdentifiersContext)_localctx).id1.getText():null));
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(90);
				match(T__7);
				setState(91);
				((IdentifiersContext)_localctx).id2 = match(ID);
				_localctx.ast.add((((IdentifiersContext)_localctx).id2!=null?((IdentifiersContext)_localctx).id2.getText():null));
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token def;
		public Token name;
		public Token id1;
		public Simple_typeContext st1;
		public Token id2;
		public Simple_typeContext st2;
		public Simple_typeContext st3;
		public Function_bodyContext function_body;
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<Simple_typeContext> simple_type() {
			return getRuleContexts(Simple_typeContext.class);
		}
		public Simple_typeContext simple_type(int i) {
			return getRuleContext(Simple_typeContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((Function_definitionContext)_localctx).def = match(T__8);
			setState(99);
			((Function_definitionContext)_localctx).name = match(ID);
			setState(100);
			match(T__9);
			List<VariableDefinition> variables = new ArrayList<VariableDefinition>();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(102);
				((Function_definitionContext)_localctx).id1 = match(ID);
				setState(103);
				match(T__0);
				setState(104);
				((Function_definitionContext)_localctx).st1 = simple_type();
				variables.add(new VariableDefinition(((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine() + 1,(((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null),((Function_definitionContext)_localctx).st1.ast));
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(106);
					match(T__7);
					setState(107);
					((Function_definitionContext)_localctx).id2 = match(ID);
					setState(108);
					match(T__0);
					setState(109);
					((Function_definitionContext)_localctx).st2 = simple_type();
					variables.add(new VariableDefinition(((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine() + 1, (((Function_definitionContext)_localctx).id2!=null?((Function_definitionContext)_localctx).id2.getText():null),((Function_definitionContext)_localctx).st2.ast));
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
			match(T__10);
			setState(120);
			match(T__0);
			Type t = new VoidType(((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine() + 1);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(122);
				((Function_definitionContext)_localctx).st3 = simple_type();
				 t = ((Function_definitionContext)_localctx).st3.ast;
				}
			}

			setState(127);
			match(T__3);
			setState(128);
			((Function_definitionContext)_localctx).function_body = function_body();
			setState(129);
			match(T__4);
			((Function_definitionContext)_localctx).ast =  new FunctionDefinition(((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine()+1,
			                                                                ((Function_definitionContext)_localctx).function_body.ast, new FunctionType( ((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine()+1,t, variables),(((Function_definitionContext)_localctx).name!=null?((Function_definitionContext)_localctx).name.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					((Function_bodyContext)_localctx).variable_definition = variable_definition();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			for(VariableDefinition vd : ((Function_bodyContext)_localctx).variable_definition.ast) {
			                                                                           		_localctx.ast.add(vd);
			                                                                           		}
			                                                                           
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(139);
				((Function_bodyContext)_localctx).statement = statement();
				_localctx.ast.add(((Function_bodyContext)_localctx).statement.ast);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public StatementContext st1;
		public StatementContext st2;
		public StatementContext st5;
		public StatementContext st3;
		public StatementContext st4;
		public StatementContext st6;
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((StatementContext)_localctx).e1 = expression(0);
				setState(148);
				match(T__11);
				setState(149);
				((StatementContext)_localctx).e2 = expression(0);
				setState(150);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__12);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(155);
				((StatementContext)_localctx).e1 = expression(0);
				parameters.add(((StatementContext)_localctx).e1.ast);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(157);
					match(T__7);
					setState(158);
					((StatementContext)_localctx).e2 = expression(0);
					parameters.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__1);
				((StatementContext)_localctx).ast =  new Write( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), parameters);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__13);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(171);
				((StatementContext)_localctx).e1 = expression(0);
				parameters.add(((StatementContext)_localctx).e1.ast);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(173);
					match(T__7);
					setState(174);
					((StatementContext)_localctx).e2 = expression(0);
					parameters.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(T__1);
				((StatementContext)_localctx).ast =  new Read( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), parameters);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(T__14);
				setState(186);
				((StatementContext)_localctx).e1 = expression(0);
				setState(187);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new ReturnStatement( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(T__15);
				setState(191);
				((StatementContext)_localctx).e1 = expression(0);
				setState(192);
				match(T__0);
				List<Statement> stms1 = new ArrayList<Statement>();
				                                         List<Statement> stms2 = new ArrayList<Statement>();
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(194);
					match(T__3);
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(195);
						((StatementContext)_localctx).st1 = statement();
						stms1.add(((StatementContext)_localctx).st1.ast);
						}
						}
						setState(200); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
					setState(202);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(204);
					((StatementContext)_localctx).st2 = statement();
					stms1.add(((StatementContext)_localctx).st2.ast);
					}
					break;
				case 3:
					{
					setState(207);
					match(T__3);
					setState(208);
					((StatementContext)_localctx).st5 = statement();
					stms1.add(((StatementContext)_localctx).st5.ast);
					setState(210);
					match(T__4);
					}
					break;
				}
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(214);
					match(T__16);
					setState(228);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(215);
						match(T__3);
						setState(219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(216);
							((StatementContext)_localctx).st3 = statement();
							stms2.add(((StatementContext)_localctx).st3.ast);
							}
							}
							setState(221); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
						setState(223);
						match(T__4);
						}
						break;
					case T__9:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__17:
					case T__19:
					case T__20:
					case ID:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
						{
						setState(225);
						((StatementContext)_localctx).st4 = statement();
						stms2.add(((StatementContext)_localctx).st4.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(230);
					match(T__3);
					setState(231);
					((StatementContext)_localctx).st6 = statement();
					stms2.add(((StatementContext)_localctx).st6.ast);
					setState(233);
					match(T__4);
					}
					break;
				}
				((StatementContext)_localctx).ast =  new IfStatement(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), stms1, stms2, ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(T__17);
				setState(240);
				((StatementContext)_localctx).e1 = expression(0);
				List<Statement> stms = new ArrayList<Statement>();
				setState(242);
				match(T__0);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(243);
					match(T__3);
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(244);
						((StatementContext)_localctx).st1 = statement();
						stms.add(((StatementContext)_localctx).st1.ast);
						}
						}
						setState(249); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
					setState(251);
					match(T__4);
					}
					break;
				case T__9:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__17:
				case T__19:
				case T__20:
				case ID:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
					{
					setState(253);
					((StatementContext)_localctx).st2 = statement();
					stms.add(((StatementContext)_localctx).st2.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), stms, ((StatementContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				((StatementContext)_localctx).ID = match(ID);
				setState(261);
				match(T__9);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(263);
					((StatementContext)_localctx).e1 = expression(0);
					parameters.add(((StatementContext)_localctx).e1.ast);
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(265);
						match(T__7);
						setState(266);
						((StatementContext)_localctx).e2 = expression(0);
						parameters.add(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(276);
				match(T__10);
				setState(277);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine() + 1,
				                                                                        parameters,new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine() + 1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public ExpressionContext e2;
		public Simple_typeContext simple_type;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(282);
				match(T__9);
				setState(283);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(284);
				match(T__10);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(287);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(288);
				match(T__9);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(290);
					((ExpressionContext)_localctx).e1 = expression(0);
					parameters.add(((ExpressionContext)_localctx).e1.ast);
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(292);
						match(T__7);
						setState(293);
						((ExpressionContext)_localctx).e2 = expression(0);
						parameters.add(((ExpressionContext)_localctx).e2.ast);
						}
						}
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(303);
				match(T__10);
				 ((ExpressionContext)_localctx).ast =  new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				                                                                        parameters, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				                                        
				}
				break;
			case 3:
				{
				setState(305);
				match(T__9);
				setState(306);
				((ExpressionContext)_localctx).simple_type = simple_type();
				setState(307);
				match(T__10);
				setState(308);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).simple_type.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).simple_type.ast);
				}
				break;
			case 4:
				{
				setState(311);
				match(T__19);
				setState(312);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(315);
				match(T__20);
				setState(316);
				((ExpressionContext)_localctx).e1 = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNegation(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 6:
				{
				setState(319);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(321);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(323);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(325);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(330);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(335);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(340);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						((ExpressionContext)_localctx).e2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						((ExpressionContext)_localctx).e2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(350);
						match(T__5);
						setState(351);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(352);
						match(T__6);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(356);
						match(T__18);
						setState(357);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_type);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(T__33);
				((Simple_typeContext)_localctx).ast =  Int.getInstance();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__34);
				((Simple_typeContext)_localctx).ast =  Real.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__35);
				((Simple_typeContext)_localctx).ast =  Char.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3?\n\3\r\3\16\3@\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N\3\3\3\3\3\3\5\3T\n\3\3\3"+
		"\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13"+
		"\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f"+
		"\6\16\6\u0094\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00c9\n\7\r\7\16\7\u00ca"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d7\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\6\7\u00de\n\7\r\7\16\7\u00df\3\7\3\7\3\7\3\7\3\7\5\7\u00e7\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00ee\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\6\7\u00fa\n\7\r\7\16\7\u00fb\3\7\3\7\3\7\3\7\3\7\5\7\u0103\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0110\n\7\f\7\16\7\u0113"+
		"\13\7\5\7\u0115\n\7\3\7\3\7\3\7\5\7\u011a\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u012b\n\b\f\b\16\b\u012e\13\b"+
		"\5\b\u0130\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014a\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u016a\n\b\f\b\16\b\u016d\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0175\n\t\3\t\2\3\16\n\2\4\6\b\n\f\16\20\2"+
		"\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u01a1\2\22\3\2\2\2\4X\3"+
		"\2\2\2\6Z\3\2\2\2\bd\3\2\2\2\n\u0089\3\2\2\2\f\u0119\3\2\2\2\16\u0149"+
		"\3\2\2\2\20\u0174\3\2\2\2\22\33\b\2\1\2\23\24\5\4\3\2\24\25\b\2\1\2\25"+
		"\32\3\2\2\2\26\27\5\b\5\2\27\30\b\2\1\2\30\32\3\2\2\2\31\23\3\2\2\2\31"+
		"\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35"+
		"\33\3\2\2\2\36\37\7\2\2\3\37 \b\2\1\2 \3\3\2\2\2!\"\5\6\4\2\"#\7\3\2\2"+
		"#$\5\20\t\2$%\7\4\2\2%&\b\3\1\2&Y\3\2\2\2\'(\5\6\4\2()\7\3\2\2)*\7\5\2"+
		"\2*+\b\3\1\2+/\7\6\2\2,-\5\4\3\2-.\b\3\1\2.\60\3\2\2\2/,\3\2\2\2\60\61"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\7\2\2\64\65\7"+
		"\4\2\2\65\66\b\3\1\2\66Y\3\2\2\2\678\5\6\4\289\7\3\2\29>\b\3\1\2:;\7\b"+
		"\2\2;<\7+\2\2<=\7\t\2\2=?\b\3\1\2>:\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BS\b\3\1\2CD\5\20\t\2DE\b\3\1\2ET\3\2\2\2FG\7\5\2\2GH\7"+
		"\6\2\2HL\b\3\1\2IJ\5\4\3\2JK\b\3\1\2KM\3\2\2\2LI\3\2\2\2MN\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\7\2\2QR\b\3\1\2RT\3\2\2\2SC\3\2\2\2SF\3"+
		"\2\2\2TU\3\2\2\2UV\7\4\2\2VW\b\3\1\2WY\3\2\2\2X!\3\2\2\2X\'\3\2\2\2X\67"+
		"\3\2\2\2Y\5\3\2\2\2Z[\7*\2\2[a\b\4\1\2\\]\7\n\2\2]^\7*\2\2^`\b\4\1\2_"+
		"\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\7\13\2"+
		"\2ef\7*\2\2fg\7\f\2\2gw\b\5\1\2hi\7*\2\2ij\7\3\2\2jk\5\20\t\2kt\b\5\1"+
		"\2lm\7\n\2\2mn\7*\2\2no\7\3\2\2op\5\20\t\2pq\b\5\1\2qs\3\2\2\2rl\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wh\3\2\2\2wx\3\2\2"+
		"\2xy\3\2\2\2yz\7\r\2\2z{\7\3\2\2{\177\b\5\1\2|}\5\20\t\2}~\b\5\1\2~\u0080"+
		"\3\2\2\2\177|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\6\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\7\2\2\u0084\u0085\b\5\1\2\u0085"+
		"\t\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u0092\b\6\1\2\u008d\u008e\5\f\7\2\u008e\u008f\b\6\1\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\13\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\5\16\b\2\u0096\u0097\7\16\2\2\u0097\u0098\5\16\b\2\u0098\u0099\7\4\2"+
		"\2\u0099\u009a\b\7\1\2\u009a\u011a\3\2\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009d\b\7\1\2\u009d\u009e\5\16\b\2\u009e\u00a5\b\7\1\2\u009f\u00a0\7"+
		"\n\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2\b\7\1\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9"+
		"\u00aa\b\7\1\2\u00aa\u011a\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ad\b"+
		"\7\1\2\u00ad\u00ae\5\16\b\2\u00ae\u00b5\b\7\1\2\u00af\u00b0\7\n\2\2\u00b0"+
		"\u00b1\5\16\b\2\u00b1\u00b2\b\7\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\b\7"+
		"\1\2\u00ba\u011a\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\5\16\b\2\u00bd"+
		"\u00be\7\4\2\2\u00be\u00bf\b\7\1\2\u00bf\u011a\3\2\2\2\u00c0\u00c1\7\22"+
		"\2\2\u00c1\u00c2\5\16\b\2\u00c2\u00c3\7\3\2\2\u00c3\u00d6\b\7\1\2\u00c4"+
		"\u00c8\7\6\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\b\7\1\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00d7\3\2"+
		"\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\b\7\1\2\u00d0\u00d7\3\2\2\2\u00d1"+
		"\u00d2\7\6\2\2\u00d2\u00d3\5\f\7\2\u00d3\u00d4\b\7\1\2\u00d4\u00d5\7\7"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d7\u00ed\3\2\2\2\u00d8\u00e6\7\23\2\2\u00d9\u00dd\7"+
		"\6\2\2\u00da\u00db\5\f\7\2\u00db\u00dc\b\7\1\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\7\2\2\u00e2\u00e7\3\2\2\2\u00e3"+
		"\u00e4\5\f\7\2\u00e4\u00e5\b\7\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00d9\3\2"+
		"\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ee\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9"+
		"\u00ea\5\f\7\2\u00ea\u00eb\b\7\1\2\u00eb\u00ec\7\7\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00d8\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\b\7\1\2\u00f0\u011a\3\2\2\2\u00f1\u00f2\7\24"+
		"\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\b\7\1\2\u00f4\u0102\7\3\2\2\u00f5"+
		"\u00f9\7\6\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\b\7\1\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\7\2\2\u00fe\u0103\3\2"+
		"\2\2\u00ff\u0100\5\f\7\2\u0100\u0101\b\7\1\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f5\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\7"+
		"\1\2\u0105\u011a\3\2\2\2\u0106\u0107\7*\2\2\u0107\u0108\7\f\2\2\u0108"+
		"\u0114\b\7\1\2\u0109\u010a\5\16\b\2\u010a\u0111\b\7\1\2\u010b\u010c\7"+
		"\n\2\2\u010c\u010d\5\16\b\2\u010d\u010e\b\7\1\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010b\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0109\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\r\2\2\u0117\u0118\7\4"+
		"\2\2\u0118\u011a\b\7\1\2\u0119\u0095\3\2\2\2\u0119\u009b\3\2\2\2\u0119"+
		"\u00ab\3\2\2\2\u0119\u00bb\3\2\2\2\u0119\u00c0\3\2\2\2\u0119\u00f1\3\2"+
		"\2\2\u0119\u0106\3\2\2\2\u011a\r\3\2\2\2\u011b\u011c\b\b\1\2\u011c\u011d"+
		"\7\f\2\2\u011d\u011e\5\16\b\2\u011e\u011f\7\r\2\2\u011f\u0120\b\b\1\2"+
		"\u0120\u014a\3\2\2\2\u0121\u0122\7*\2\2\u0122\u0123\7\f\2\2\u0123\u012f"+
		"\b\b\1\2\u0124\u0125\5\16\b\2\u0125\u012c\b\b\1\2\u0126\u0127\7\n\2\2"+
		"\u0127\u0128\5\16\b\2\u0128\u0129\b\b\1\2\u0129\u012b\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\r\2\2\u0132\u014a\b\b\1\2\u0133"+
		"\u0134\7\f\2\2\u0134\u0135\5\20\t\2\u0135\u0136\7\r\2\2\u0136\u0137\5"+
		"\16\b\r\u0137\u0138\b\b\1\2\u0138\u014a\3\2\2\2\u0139\u013a\7\26\2\2\u013a"+
		"\u013b\5\16\b\f\u013b\u013c\b\b\1\2\u013c\u014a\3\2\2\2\u013d\u013e\7"+
		"\27\2\2\u013e\u013f\5\16\b\13\u013f\u0140\b\b\1\2\u0140\u014a\3\2\2\2"+
		"\u0141\u0142\7+\2\2\u0142\u014a\b\b\1\2\u0143\u0144\7,\2\2\u0144\u014a"+
		"\b\b\1\2\u0145\u0146\7-\2\2\u0146\u014a\b\b\1\2\u0147\u0148\7*\2\2\u0148"+
		"\u014a\b\b\1\2\u0149\u011b\3\2\2\2\u0149\u0121\3\2\2\2\u0149\u0133\3\2"+
		"\2\2\u0149\u0139\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0141\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u016b\3\2"+
		"\2\2\u014b\u014c\f\n\2\2\u014c\u014d\t\2\2\2\u014d\u014e\5\16\b\13\u014e"+
		"\u014f\b\b\1\2\u014f\u016a\3\2\2\2\u0150\u0151\f\t\2\2\u0151\u0152\t\3"+
		"\2\2\u0152\u0153\5\16\b\n\u0153\u0154\b\b\1\2\u0154\u016a\3\2\2\2\u0155"+
		"\u0156\f\b\2\2\u0156\u0157\t\4\2\2\u0157\u0158\5\16\b\t\u0158\u0159\b"+
		"\b\1\2\u0159\u016a\3\2\2\2\u015a\u015b\f\7\2\2\u015b\u015c\t\5\2\2\u015c"+
		"\u015d\5\16\b\b\u015d\u015e\b\b\1\2\u015e\u016a\3\2\2\2\u015f\u0160\f"+
		"\17\2\2\u0160\u0161\7\b\2\2\u0161\u0162\5\16\b\2\u0162\u0163\7\t\2\2\u0163"+
		"\u0164\b\b\1\2\u0164\u016a\3\2\2\2\u0165\u0166\f\16\2\2\u0166\u0167\7"+
		"\25\2\2\u0167\u0168\7*\2\2\u0168\u016a\b\b\1\2\u0169\u014b\3\2\2\2\u0169"+
		"\u0150\3\2\2\2\u0169\u0155\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015f\3\2"+
		"\2\2\u0169\u0165\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\17\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7$\2\2"+
		"\u016f\u0175\b\t\1\2\u0170\u0171\7%\2\2\u0171\u0175\b\t\1\2\u0172\u0173"+
		"\7&\2\2\u0173\u0175\b\t\1\2\u0174\u016e\3\2\2\2\u0174\u0170\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\21\3\2\2\2!\31\33\61@NSXatw\177\u0089\u0092\u00a5"+
		"\u00b5\u00ca\u00d6\u00df\u00e6\u00ed\u00fb\u0102\u0111\u0114\u0119\u012c"+
		"\u012f\u0149\u0169\u016b\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}