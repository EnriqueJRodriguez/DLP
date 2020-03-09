// Generated from C:/Users/UO257565/Desktop/DLP/UO257565_Pmm/src/parser\Pmm.g4 by ANTLR 4.8
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TRASH=38, 
		ONELINECOMMENTARY=39, MULTIPLELINESCOMMENT=40, ID=41, INT_CONSTANT=42, 
		REAL_CONSTANT=43, CHAR_CONSTANT=44;
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
			null, "'def'", "'main()'", "':'", "'{'", "'}'", "';'", "'struct'", "'['", 
			"']'", "','", "'('", "')'", "'='", "'print'", "'input'", "'return'", 
			"'if'", "'else'", "'while'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", 
			"'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'int'", "'double'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TRASH", "ONELINECOMMENTARY", "MULTIPLELINESCOMMENT", "ID", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT"
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
		public Token def;
		public Token main;
		public Function_bodyContext function_body;
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> definitions = new ArrayList<Definition>();
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
					case T__0:
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
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(28);
			((ProgramContext)_localctx).def = match(T__0);
			setState(29);
			((ProgramContext)_localctx).main = match(T__1);
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
			setState(32);
			((ProgramContext)_localctx).function_body = function_body();
			setState(33);
			match(T__4);
			setState(34);
			match(EOF);
			definitions.add(new FunctionDefinition(((ProgramContext)_localctx).def.getLine(),((ProgramContext)_localctx).def.getCharPositionInLine()+1,((ProgramContext)_localctx).function_body.ast,
			                                                                        new FunctionType(((ProgramContext)_localctx).def.getLine(),((ProgramContext)_localctx).def.getCharPositionInLine()+1,
			                                                                        new VoidType(((ProgramContext)_localctx).main.getLine(),((ProgramContext)_localctx).main.getCharPositionInLine()+1),
			                                    									new ArrayList<VariableDefinition>()),"main"));
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(39);
				((Variable_definitionContext)_localctx).def = match(T__2);
				setState(40);
				((Variable_definitionContext)_localctx).st1 = simple_type();
				setState(41);
				match(T__5);
				 for(String id : ((Variable_definitionContext)_localctx).identifiers.ast) {
				                                                                                                            _localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                                                            id,((Variable_definitionContext)_localctx).st1.ast));
				                                                                                                        }
				                                                                                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(45);
				((Variable_definitionContext)_localctx).def = match(T__2);
				setState(46);
				((Variable_definitionContext)_localctx).st = match(T__6);
				List<VariableDefinition> variables = new ArrayList<VariableDefinition>();
				                                                                                                     List<FieldDefinition> fields = new ArrayList<FieldDefinition>();
				setState(48);
				match(T__3);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					((Variable_definitionContext)_localctx).vds = variable_definition();
					for(VariableDefinition vd : ((Variable_definitionContext)_localctx).vds.ast) {
					                                                                                                        	  variables.add(vd);
					                                                                                                        	  fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(),
					                                                                                                        	                                 vd.getName(), vd.getType()));
					                                                                                                        	}
					                                                                                                        
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(56);
				match(T__4);
				setState(57);
				match(T__5);
				 for(String id : ((Variable_definitionContext)_localctx).identifiers.ast) {
				                                                                                                    		_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).def.getLine(), ((Variable_definitionContext)_localctx).def.getCharPositionInLine() + 1,
				                                                                                                    		         id,new Struct(((Variable_definitionContext)_localctx).st.getLine(), ((Variable_definitionContext)_localctx).st.getCharPositionInLine() + 1, fields)));
				                                                                                                        }
				                                                                                                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				((Variable_definitionContext)_localctx).identifiers = identifiers();
				setState(61);
				((Variable_definitionContext)_localctx).def = match(T__2);
				List<Integer> sizes = new ArrayList<Integer>(); 
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					match(T__7);
					setState(64);
					((Variable_definitionContext)_localctx).ic = match(INT_CONSTANT);
					setState(65);
					match(T__8);
					sizes.add(LexerHelper.lexemeToInt((((Variable_definitionContext)_localctx).ic!=null?((Variable_definitionContext)_localctx).ic.getText():null)));
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 );
				Type t; 
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
				case T__35:
				case T__36:
					{
					setState(72);
					((Variable_definitionContext)_localctx).simple_type = simple_type();
					t=((Variable_definitionContext)_localctx).simple_type.ast;
					}
					break;
				case T__6:
					{
					setState(75);
					((Variable_definitionContext)_localctx).st = match(T__6);
					setState(76);
					match(T__3);
					List<FieldDefinition> fields = new ArrayList<FieldDefinition>();
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(78);
						((Variable_definitionContext)_localctx).vds = variable_definition();
						for(VariableDefinition vd : ((Variable_definitionContext)_localctx).vds.ast) {
						                                                                                                        	fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(),
						                                                                                                        	            vd.getName(), vd.getType()));
						                                                                                                            }
						                                                                                                        
						}
						}
						setState(83); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ID );
					setState(85);
					match(T__4);
					t=new Struct(((Variable_definitionContext)_localctx).st.getLine(), ((Variable_definitionContext)_localctx).st.getCharPositionInLine() + 1, fields);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				match(T__5);

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
			setState(95);
			((IdentifiersContext)_localctx).id1 = match(ID);
			_localctx.ast.add((((IdentifiersContext)_localctx).id1!=null?((IdentifiersContext)_localctx).id1.getText():null));
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(97);
				match(T__9);
				setState(98);
				((IdentifiersContext)_localctx).id2 = match(ID);
				_localctx.ast.add((((IdentifiersContext)_localctx).id2!=null?((IdentifiersContext)_localctx).id2.getText():null));
				}
				}
				setState(104);
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
			setState(105);
			((Function_definitionContext)_localctx).def = match(T__0);
			setState(106);
			((Function_definitionContext)_localctx).name = match(ID);
			setState(107);
			match(T__10);
			List<VariableDefinition> variables = new ArrayList<VariableDefinition>();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(109);
				((Function_definitionContext)_localctx).id1 = match(ID);
				setState(110);
				match(T__2);
				setState(111);
				((Function_definitionContext)_localctx).st1 = simple_type();
				variables.add(new VariableDefinition(((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine() + 1,(((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null),((Function_definitionContext)_localctx).st1.ast));
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(113);
					match(T__9);
					setState(114);
					((Function_definitionContext)_localctx).id2 = match(ID);
					setState(115);
					match(T__2);
					setState(116);
					((Function_definitionContext)_localctx).st2 = simple_type();
					variables.add(new VariableDefinition(((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine() + 1, (((Function_definitionContext)_localctx).id2!=null?((Function_definitionContext)_localctx).id2.getText():null),((Function_definitionContext)_localctx).st2.ast));
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(126);
			match(T__11);
			setState(127);
			match(T__2);
			Type t = new VoidType(((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine() + 1);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(129);
				((Function_definitionContext)_localctx).st3 = simple_type();
				 t = ((Function_definitionContext)_localctx).st3.ast;
				}
			}

			List<Statement> statements = new ArrayList<Statement>();
			setState(135);
			match(T__3);
			setState(136);
			((Function_definitionContext)_localctx).function_body = function_body();
			statements = ((Function_definitionContext)_localctx).function_body.ast;
			setState(138);
			match(T__4);
			((Function_definitionContext)_localctx).ast =  new FunctionDefinition(((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine()+1,
			                                                                statements, new FunctionType( ((Function_definitionContext)_localctx).def.getLine(), ((Function_definitionContext)_localctx).def.getCharPositionInLine()+1,t, variables),(((Function_definitionContext)_localctx).name!=null?((Function_definitionContext)_localctx).name.getText():null)); 
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
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					((Function_bodyContext)_localctx).variable_definition = variable_definition();
					for(VariableDefinition vd : ((Function_bodyContext)_localctx).variable_definition.ast) {
					                                                                           		_localctx.ast.add(vd);
					                                                                           		}
					                                                                           
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(149);
				((Function_bodyContext)_localctx).statement = statement();
				_localctx.ast.add(((Function_bodyContext)_localctx).statement.ast);
				}
				}
				setState(156);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((StatementContext)_localctx).e1 = expression(0);
				setState(158);
				match(T__12);
				setState(159);
				((StatementContext)_localctx).e2 = expression(0);
				setState(160);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__13);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(165);
				((StatementContext)_localctx).e1 = expression(0);
				parameters.add(((StatementContext)_localctx).e1.ast);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(167);
					match(T__9);
					setState(168);
					((StatementContext)_localctx).e2 = expression(0);
					parameters.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__5);
				((StatementContext)_localctx).ast =  new Write( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), parameters);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__14);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(181);
				((StatementContext)_localctx).e1 = expression(0);
				parameters.add(((StatementContext)_localctx).e1.ast);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(183);
					match(T__9);
					setState(184);
					((StatementContext)_localctx).e2 = expression(0);
					parameters.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__5);
				((StatementContext)_localctx).ast =  new Read( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), parameters);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(T__15);
				setState(196);
				((StatementContext)_localctx).e1 = expression(0);
				setState(197);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new ReturnStatement( ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(T__16);
				setState(201);
				((StatementContext)_localctx).e1 = expression(0);
				setState(202);
				match(T__2);
				List<Statement> stms1 = new ArrayList<Statement>();
				                                         List<Statement> stms2 = new ArrayList<Statement>();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(204);
					match(T__3);
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(205);
						((StatementContext)_localctx).st1 = statement();
						stms1.add(((StatementContext)_localctx).st1.ast);
						}
						}
						setState(210); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
					setState(212);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(214);
					((StatementContext)_localctx).st2 = statement();
					stms1.add(((StatementContext)_localctx).st2.ast);
					}
					break;
				case 3:
					{
					setState(217);
					match(T__3);
					setState(218);
					((StatementContext)_localctx).st5 = statement();
					stms1.add(((StatementContext)_localctx).st5.ast);
					setState(220);
					match(T__4);
					}
					break;
				}
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(224);
					match(T__17);
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(225);
						match(T__3);
						setState(229); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(226);
							((StatementContext)_localctx).st3 = statement();
							stms2.add(((StatementContext)_localctx).st3.ast);
							}
							}
							setState(231); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
						setState(233);
						match(T__4);
						}
						break;
					case T__10:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__18:
					case T__20:
					case T__21:
					case ID:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
						{
						setState(235);
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
					setState(240);
					match(T__3);
					setState(241);
					((StatementContext)_localctx).st6 = statement();
					stms2.add(((StatementContext)_localctx).st6.ast);
					setState(243);
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
				setState(249);
				match(T__18);
				setState(250);
				((StatementContext)_localctx).e1 = expression(0);
				List<Statement> stms = new ArrayList<Statement>();
				setState(252);
				match(T__2);
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(253);
					match(T__3);
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(254);
						((StatementContext)_localctx).st1 = statement();
						stms.add(((StatementContext)_localctx).st1.ast);
						}
						}
						setState(259); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
					setState(261);
					match(T__4);
					}
					break;
				case T__10:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__20:
				case T__21:
				case ID:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
					{
					setState(263);
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
				setState(270);
				((StatementContext)_localctx).ID = match(ID);
				setState(271);
				match(T__10);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(273);
					((StatementContext)_localctx).e1 = expression(0);
					parameters.add(((StatementContext)_localctx).e1.ast);
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(275);
						match(T__9);
						setState(276);
						((StatementContext)_localctx).e2 = expression(0);
						parameters.add(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(286);
				match(T__11);
				setState(287);
				match(T__5);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(292);
				match(T__10);
				setState(293);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(294);
				match(T__11);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(297);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(298);
				match(T__10);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(300);
					((ExpressionContext)_localctx).e1 = expression(0);
					parameters.add(((ExpressionContext)_localctx).e1.ast);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(302);
						match(T__9);
						setState(303);
						((ExpressionContext)_localctx).e2 = expression(0);
						parameters.add(((ExpressionContext)_localctx).e2.ast);
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(313);
				match(T__11);
				 ((ExpressionContext)_localctx).ast =  new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				                                                                        parameters, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				                                        
				}
				break;
			case 3:
				{
				setState(315);
				match(T__10);
				setState(316);
				((ExpressionContext)_localctx).simple_type = simple_type();
				setState(317);
				match(T__11);
				setState(318);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).simple_type.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).simple_type.ast);
				}
				break;
			case 4:
				{
				setState(321);
				match(T__20);
				setState(322);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(325);
				match(T__21);
				setState(326);
				((ExpressionContext)_localctx).e1 = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNegation(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 6:
				{
				setState(329);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(331);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(333);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(335);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(340);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
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
						setState(344);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(345);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__25) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
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
						setState(349);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(350);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(351);
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
						setState(354);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(355);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
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
						setState(359);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(360);
						match(T__7);
						setState(361);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(362);
						match(T__8);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(366);
						match(T__19);
						setState(367);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(373);
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
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__34);
				((Simple_typeContext)_localctx).ast =  Int.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(T__35);
				((Simple_typeContext)_localctx).ast =  Real.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(T__36);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0181\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"\67\n\3\r\3\16\38\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3F\n\3"+
		"\r\3\16\3G\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3T\n\3\r\3\16\3U"+
		"\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4\3\4\7\4g\n"+
		"\4\f\4\16\4j\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5z\n\5\f\5\16\5}\13\5\5\5\177\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096"+
		"\13\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7"+
		"\u00c1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\6\7\u00d3\n\7\r\7\16\7\u00d4\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00e1\n\7\3\7\3\7\3\7\3\7\3\7\6\7\u00e8\n\7\r\7\16\7\u00e9"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00f1\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f8\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0104\n\7\r\7\16\7\u0105\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u010d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u011a\n\7\f\7\16\7\u011d\13\7\5\7\u011f\n\7\3\7\3\7\3\7\5\7"+
		"\u0124\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0135\n\b\f\b\16\b\u0138\13\b\5\b\u013a\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0154\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u0174\n\b\f\b\16\b\u0177\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u017f\n\t"+
		"\3\t\2\3\16\n\2\4\6\b\n\f\16\20\2\6\3\2\31\33\4\2\27\27\34\34\3\2\35\""+
		"\3\2#$\2\u01ab\2\22\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bk\3\2\2\2\n\u0094\3"+
		"\2\2\2\f\u0123\3\2\2\2\16\u0153\3\2\2\2\20\u017e\3\2\2\2\22\33\b\2\1\2"+
		"\23\24\5\4\3\2\24\25\b\2\1\2\25\32\3\2\2\2\26\27\5\b\5\2\27\30\b\2\1\2"+
		"\30\32\3\2\2\2\31\23\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2"+
		"\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\3\2\2\37 \7\4\2\2 "+
		"!\7\5\2\2!\"\7\6\2\2\"#\5\n\6\2#$\7\7\2\2$%\7\2\2\3%&\b\2\1\2&\'\b\2\1"+
		"\2\'\3\3\2\2\2()\5\6\4\2)*\7\5\2\2*+\5\20\t\2+,\7\b\2\2,-\b\3\1\2-`\3"+
		"\2\2\2./\5\6\4\2/\60\7\5\2\2\60\61\7\t\2\2\61\62\b\3\1\2\62\66\7\6\2\2"+
		"\63\64\5\4\3\2\64\65\b\3\1\2\65\67\3\2\2\2\66\63\3\2\2\2\678\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\7\2\2;<\7\b\2\2<=\b\3\1\2=`\3\2\2"+
		"\2>?\5\6\4\2?@\7\5\2\2@E\b\3\1\2AB\7\n\2\2BC\7,\2\2CD\7\13\2\2DF\b\3\1"+
		"\2EA\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IZ\b\3\1\2JK\5\20"+
		"\t\2KL\b\3\1\2L[\3\2\2\2MN\7\t\2\2NO\7\6\2\2OS\b\3\1\2PQ\5\4\3\2QR\b\3"+
		"\1\2RT\3\2\2\2SP\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\7"+
		"\2\2XY\b\3\1\2Y[\3\2\2\2ZJ\3\2\2\2ZM\3\2\2\2[\\\3\2\2\2\\]\7\b\2\2]^\b"+
		"\3\1\2^`\3\2\2\2_(\3\2\2\2_.\3\2\2\2_>\3\2\2\2`\5\3\2\2\2ab\7+\2\2bh\b"+
		"\4\1\2cd\7\f\2\2de\7+\2\2eg\b\4\1\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\7\3\2\2\2jh\3\2\2\2kl\7\3\2\2lm\7+\2\2mn\7\r\2\2n~\b\5\1\2op\7"+
		"+\2\2pq\7\5\2\2qr\5\20\t\2r{\b\5\1\2st\7\f\2\2tu\7+\2\2uv\7\5\2\2vw\5"+
		"\20\t\2wx\b\5\1\2xz\3\2\2\2ys\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2~o\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\7\16\2\2\u0081\u0082\7\5\2\2\u0082\u0086\b\5\1\2\u0083\u0084\5\20\t\2"+
		"\u0084\u0085\b\5\1\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\5\1\2\u0089\u008a\7\6\2\2\u008a"+
		"\u008b\5\n\6\2\u008b\u008c\b\5\1\2\u008c\u008d\7\7\2\2\u008d\u008e\b\5"+
		"\1\2\u008e\t\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\b\6\1\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\f"+
		"\7\2\u0098\u0099\b\6\1\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\13\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7\17\2\2\u00a1"+
		"\u00a2\5\16\b\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\b\7\1\2\u00a4\u0124\3"+
		"\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7\b\7\1\2\u00a7\u00a8\5\16\b\2\u00a8"+
		"\u00af\b\7\1\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\b"+
		"\7\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\b\7\1\2\u00b4\u0124\3\2\2\2\u00b5"+
		"\u00b6\7\21\2\2\u00b6\u00b7\b\7\1\2\u00b7\u00b8\5\16\b\2\u00b8\u00bf\b"+
		"\7\1\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\b\7\1\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7\b\2\2\u00c3\u00c4\b\7\1\2\u00c4\u0124\3\2\2\2\u00c5\u00c6\7\22"+
		"\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\b\7\1\2\u00c9"+
		"\u0124\3\2\2\2\u00ca\u00cb\7\23\2\2\u00cb\u00cc\5\16\b\2\u00cc\u00cd\7"+
		"\5\2\2\u00cd\u00e0\b\7\1\2\u00ce\u00d2\7\6\2\2\u00cf\u00d0\5\f\7\2\u00d0"+
		"\u00d1\b\7\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\7\7\2\2\u00d7\u00e1\3\2\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\b\7"+
		"\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\5\f\7\2\u00dd"+
		"\u00de\b\7\1\2\u00de\u00df\7\7\2\2\u00df\u00e1\3\2\2\2\u00e0\u00ce\3\2"+
		"\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00f7\3\2\2\2\u00e2"+
		"\u00f0\7\24\2\2\u00e3\u00e7\7\6\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\b"+
		"\7\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\7"+
		"\2\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00ef\b\7\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f8\3\2"+
		"\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\5\f\7\2\u00f4\u00f5\b\7\1\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00f2\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\7\1\2\u00fa"+
		"\u0124\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\5\16\b\2\u00fd\u00fe\b"+
		"\7\1\2\u00fe\u010c\7\5\2\2\u00ff\u0103\7\6\2\2\u0100\u0101\5\f\7\2\u0101"+
		"\u0102\b\7\1\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7\7\2\2\u0108\u010d\3\2\2\2\u0109\u010a\5\f\7\2\u010a\u010b\b\7"+
		"\1\2\u010b\u010d\3\2\2\2\u010c\u00ff\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b\7\1\2\u010f\u0124\3\2\2\2\u0110\u0111\7+"+
		"\2\2\u0111\u0112\7\r\2\2\u0112\u011e\b\7\1\2\u0113\u0114\5\16\b\2\u0114"+
		"\u011b\b\7\1\2\u0115\u0116\7\f\2\2\u0116\u0117\5\16\b\2\u0117\u0118\b"+
		"\7\1\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0113\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\16\2\2\u0121\u0122\7\b\2\2\u0122\u0124\b\7\1\2\u0123\u009f\3"+
		"\2\2\2\u0123\u00a5\3\2\2\2\u0123\u00b5\3\2\2\2\u0123\u00c5\3\2\2\2\u0123"+
		"\u00ca\3\2\2\2\u0123\u00fb\3\2\2\2\u0123\u0110\3\2\2\2\u0124\r\3\2\2\2"+
		"\u0125\u0126\b\b\1\2\u0126\u0127\7\r\2\2\u0127\u0128\5\16\b\2\u0128\u0129"+
		"\7\16\2\2\u0129\u012a\b\b\1\2\u012a\u0154\3\2\2\2\u012b\u012c\7+\2\2\u012c"+
		"\u012d\7\r\2\2\u012d\u0139\b\b\1\2\u012e\u012f\5\16\b\2\u012f\u0136\b"+
		"\b\1\2\u0130\u0131\7\f\2\2\u0131\u0132\5\16\b\2\u0132\u0133\b\b\1\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u012e\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\16"+
		"\2\2\u013c\u0154\b\b\1\2\u013d\u013e\7\r\2\2\u013e\u013f\5\20\t\2\u013f"+
		"\u0140\7\16\2\2\u0140\u0141\5\16\b\r\u0141\u0142\b\b\1\2\u0142\u0154\3"+
		"\2\2\2\u0143\u0144\7\27\2\2\u0144\u0145\5\16\b\f\u0145\u0146\b\b\1\2\u0146"+
		"\u0154\3\2\2\2\u0147\u0148\7\30\2\2\u0148\u0149\5\16\b\13\u0149\u014a"+
		"\b\b\1\2\u014a\u0154\3\2\2\2\u014b\u014c\7,\2\2\u014c\u0154\b\b\1\2\u014d"+
		"\u014e\7-\2\2\u014e\u0154\b\b\1\2\u014f\u0150\7.\2\2\u0150\u0154\b\b\1"+
		"\2\u0151\u0152\7+\2\2\u0152\u0154\b\b\1\2\u0153\u0125\3\2\2\2\u0153\u012b"+
		"\3\2\2\2\u0153\u013d\3\2\2\2\u0153\u0143\3\2\2\2\u0153\u0147\3\2\2\2\u0153"+
		"\u014b\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0175\3\2\2\2\u0155\u0156\f\n\2\2\u0156\u0157\t\2\2\2\u0157"+
		"\u0158\5\16\b\13\u0158\u0159\b\b\1\2\u0159\u0174\3\2\2\2\u015a\u015b\f"+
		"\t\2\2\u015b\u015c\t\3\2\2\u015c\u015d\5\16\b\n\u015d\u015e\b\b\1\2\u015e"+
		"\u0174\3\2\2\2\u015f\u0160\f\b\2\2\u0160\u0161\t\4\2\2\u0161\u0162\5\16"+
		"\b\t\u0162\u0163\b\b\1\2\u0163\u0174\3\2\2\2\u0164\u0165\f\7\2\2\u0165"+
		"\u0166\t\5\2\2\u0166\u0167\5\16\b\b\u0167\u0168\b\b\1\2\u0168\u0174\3"+
		"\2\2\2\u0169\u016a\f\17\2\2\u016a\u016b\7\n\2\2\u016b\u016c\5\16\b\2\u016c"+
		"\u016d\7\13\2\2\u016d\u016e\b\b\1\2\u016e\u0174\3\2\2\2\u016f\u0170\f"+
		"\16\2\2\u0170\u0171\7\26\2\2\u0171\u0172\7+\2\2\u0172\u0174\b\b\1\2\u0173"+
		"\u0155\3\2\2\2\u0173\u015a\3\2\2\2\u0173\u015f\3\2\2\2\u0173\u0164\3\2"+
		"\2\2\u0173\u0169\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\17\3\2\2\2\u0177\u0175\3\2\2"+
		"\2\u0178\u0179\7%\2\2\u0179\u017f\b\t\1\2\u017a\u017b\7&\2\2\u017b\u017f"+
		"\b\t\1\2\u017c\u017d\7\'\2\2\u017d\u017f\b\t\1\2\u017e\u0178\3\2\2\2\u017e"+
		"\u017a\3\2\2\2\u017e\u017c\3\2\2\2\u017f\21\3\2\2\2!\31\338GUZ_h{~\u0086"+
		"\u0094\u009c\u00af\u00bf\u00d4\u00e0\u00e9\u00f0\u00f7\u0105\u010c\u011b"+
		"\u011e\u0123\u0136\u0139\u0153\u0173\u0175\u017e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}