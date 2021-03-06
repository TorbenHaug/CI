// $ANTLR 3.4 Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g 2014-11-20 16:45:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "EQUAL_SIGN", "IGNOREDSIGNES", "INPUT_STRING", "PLUS_MINUS_SIGN", "SYMBOLPUZZLE"
    };

    public static final int EOF=-1;
    public static final int CHAR=4;
    public static final int EQUAL_SIGN=5;
    public static final int IGNOREDSIGNES=6;
    public static final int INPUT_STRING=7;
    public static final int PLUS_MINUS_SIGN=8;
    public static final int SYMBOLPUZZLE=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "char_string", "start", "term", "equality_line", "expression_line", 
    "operation_line"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public buchstabenGrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public buchstabenGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public buchstabenGrammarParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return buchstabenGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g"; }


    	// Generiert einen Teil des Baumes
    	private CommonTree getSubtree(String op, Tree left, Tree middle, Tree right) {
    		CommonTree result = (CommonTree) adaptor.create(EQUAL_SIGN, "=");
    		
    		if (op.equals("+")) {
    			CommonTree term = (CommonTree) adaptor.create(PLUS_MINUS_SIGN, "+");
    			adaptor.addChild(term, left);
    			adaptor.addChild(term, middle);
    			
    			adaptor.addChild(result, term);
    			adaptor.addChild(result, right);
    		} else {
    			CommonTree term = (CommonTree) adaptor.create(PLUS_MINUS_SIGN, "+");
    			adaptor.addChild(term, right);
    			adaptor.addChild(term, middle);
    			
    			adaptor.addChild(result, term);
    			adaptor.addChild(result, left);
    		}
    		
    		return result;
    	}


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:37:1: start : el1= expression_line ol= operation_line el2= expression_line equality_line el3= expression_line ->;
    public final buchstabenGrammarParser.start_return start() throws RecognitionException {
        buchstabenGrammarParser.start_return retval = new buchstabenGrammarParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        buchstabenGrammarParser.expression_line_return el1 =null;

        buchstabenGrammarParser.operation_line_return ol =null;

        buchstabenGrammarParser.expression_line_return el2 =null;

        buchstabenGrammarParser.expression_line_return el3 =null;

        buchstabenGrammarParser.equality_line_return equality_line1 =null;


        RewriteRuleSubtreeStream stream_equality_line=new RewriteRuleSubtreeStream(adaptor,"rule equality_line");
        RewriteRuleSubtreeStream stream_expression_line=new RewriteRuleSubtreeStream(adaptor,"rule expression_line");
        RewriteRuleSubtreeStream stream_operation_line=new RewriteRuleSubtreeStream(adaptor,"rule operation_line");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:37:7: (el1= expression_line ol= operation_line el2= expression_line equality_line el3= expression_line ->)
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:37:9: el1= expression_line ol= operation_line el2= expression_line equality_line el3= expression_line
            {
            dbg.location(37,13);
            pushFollow(FOLLOW_expression_line_in_start49);
            el1=expression_line();

            state._fsp--;

            stream_expression_line.add(el1.getTree());
            dbg.location(38,5);
            pushFollow(FOLLOW_operation_line_in_start56);
            ol=operation_line();

            state._fsp--;

            stream_operation_line.add(ol.getTree());
            dbg.location(39,6);
            pushFollow(FOLLOW_expression_line_in_start63);
            el2=expression_line();

            state._fsp--;

            stream_expression_line.add(el2.getTree());
            dbg.location(40,2);
            pushFollow(FOLLOW_equality_line_in_start66);
            equality_line1=equality_line();

            state._fsp--;

            stream_equality_line.add(equality_line1.getTree());
            dbg.location(41,6);
            pushFollow(FOLLOW_expression_line_in_start73);
            el3=expression_line();

            state._fsp--;

            stream_expression_line.add(el3.getTree());
            dbg.location(41,24);

            	CommonTree result = (CommonTree) adaptor.create(SYMBOLPUZZLE, "SYMBOLPUZZLE");
            	
            	CommonTree vertical_top = getSubtree(el1.op, el1.left, el1.middle, el1.right);
            	CommonTree vertical_middle = getSubtree(el2.op, el2.left, el2.middle, el2.right);
            	CommonTree vertical_bottom = getSubtree(el3.op, el3.left, el3.middle, el3.right);
            	CommonTree horizontal_left = getSubtree(ol.left, el1.left, el2.left, el3.left);
            	CommonTree horizontal_middle = getSubtree(ol.middle, el1.middle, el2.middle, el3.middle);
            	CommonTree horizontal_right = getSubtree(ol.right, el1.right, el2.right, el3.right);
            	
            	adaptor.addChild(result, vertical_top);
            	adaptor.addChild(result, vertical_middle);
            	adaptor.addChild(result, vertical_bottom);
            	adaptor.addChild(result, horizontal_left);
            	adaptor.addChild(result, horizontal_middle);
            	adaptor.addChild(result, horizontal_right);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:3: ->
            {
                dbg.location(57,6);
                adaptor.addChild(root_0, result);

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class expression_line_return extends ParserRuleReturnScope {
        public String op;
        public Tree left;
        public Tree middle;
        public Tree right;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_line"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:60:1: expression_line returns [String op, Tree left, Tree middle, Tree right] : t= term EQUAL_SIGN r= char_string ;
    public final buchstabenGrammarParser.expression_line_return expression_line() throws RecognitionException {
        buchstabenGrammarParser.expression_line_return retval = new buchstabenGrammarParser.expression_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL_SIGN2=null;
        buchstabenGrammarParser.term_return t =null;

        buchstabenGrammarParser.char_string_return r =null;


        CommonTree EQUAL_SIGN2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:60:71: (t= term EQUAL_SIGN r= char_string )
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:61:2: t= term EQUAL_SIGN r= char_string
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(61,3);
            pushFollow(FOLLOW_term_in_expression_line93);
            t=term();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());
            dbg.location(61,9);
            EQUAL_SIGN2=(Token)match(input,EQUAL_SIGN,FOLLOW_EQUAL_SIGN_in_expression_line95); 
            EQUAL_SIGN2_tree = 
            (CommonTree)adaptor.create(EQUAL_SIGN2)
            ;
            adaptor.addChild(root_0, EQUAL_SIGN2_tree);

            dbg.location(61,21);
            pushFollow(FOLLOW_char_string_in_expression_line99);
            r=char_string();

            state._fsp--;

            adaptor.addChild(root_0, r.getTree());
            dbg.location(61,34);

            		retval.op = (t!=null?t.op:null);
            		retval.left = (t!=null?t.left:null);
            		retval.middle = (t!=null?t.middle:null);
            		retval.right = (r!=null?((CommonTree)r.tree):null);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(66, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression_line"


    public static class term_return extends ParserRuleReturnScope {
        public Tree left;
        public String op;
        public Tree middle;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:68:1: term returns [Tree left,String op, Tree middle] : l= char_string o= PLUS_MINUS_SIGN m= char_string ;
    public final buchstabenGrammarParser.term_return term() throws RecognitionException {
        buchstabenGrammarParser.term_return retval = new buchstabenGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        buchstabenGrammarParser.char_string_return l =null;

        buchstabenGrammarParser.char_string_return m =null;


        CommonTree o_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:68:47: (l= char_string o= PLUS_MINUS_SIGN m= char_string )
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:69:2: l= char_string o= PLUS_MINUS_SIGN m= char_string
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(69,3);
            pushFollow(FOLLOW_char_string_in_term115);
            l=char_string();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());
            dbg.location(69,17);
            o=(Token)match(input,PLUS_MINUS_SIGN,FOLLOW_PLUS_MINUS_SIGN_in_term119); 
            o_tree = 
            (CommonTree)adaptor.create(o)
            ;
            adaptor.addChild(root_0, o_tree);

            dbg.location(69,35);
            pushFollow(FOLLOW_char_string_in_term123);
            m=char_string();

            state._fsp--;

            adaptor.addChild(root_0, m.getTree());
            dbg.location(69,48);

            		retval.left = (l!=null?((CommonTree)l.tree):null);
            		retval.op = (o!=null?o.getText():null);
            		retval.middle = (m!=null?((CommonTree)m.tree):null);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(73, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class operation_line_return extends ParserRuleReturnScope {
        public String left;
        public String middle;
        public String right;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation_line"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:75:1: operation_line returns [String left, String middle, String right] : l= PLUS_MINUS_SIGN m= PLUS_MINUS_SIGN r= PLUS_MINUS_SIGN ;
    public final buchstabenGrammarParser.operation_line_return operation_line() throws RecognitionException {
        buchstabenGrammarParser.operation_line_return retval = new buchstabenGrammarParser.operation_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token l=null;
        Token m=null;
        Token r=null;

        CommonTree l_tree=null;
        CommonTree m_tree=null;
        CommonTree r_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operation_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:75:65: (l= PLUS_MINUS_SIGN m= PLUS_MINUS_SIGN r= PLUS_MINUS_SIGN )
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:76:2: l= PLUS_MINUS_SIGN m= PLUS_MINUS_SIGN r= PLUS_MINUS_SIGN
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(76,3);
            l=(Token)match(input,PLUS_MINUS_SIGN,FOLLOW_PLUS_MINUS_SIGN_in_operation_line139); 
            l_tree = 
            (CommonTree)adaptor.create(l)
            ;
            adaptor.addChild(root_0, l_tree);

            dbg.location(76,21);
            m=(Token)match(input,PLUS_MINUS_SIGN,FOLLOW_PLUS_MINUS_SIGN_in_operation_line143); 
            m_tree = 
            (CommonTree)adaptor.create(m)
            ;
            adaptor.addChild(root_0, m_tree);

            dbg.location(76,39);
            r=(Token)match(input,PLUS_MINUS_SIGN,FOLLOW_PLUS_MINUS_SIGN_in_operation_line147); 
            r_tree = 
            (CommonTree)adaptor.create(r)
            ;
            adaptor.addChild(root_0, r_tree);

            dbg.location(76,56);

            		retval.left = (l!=null?l.getText():null);
            		retval.middle = (m!=null?m.getText():null);
            		retval.right = (r!=null?r.getText():null);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(80, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operation_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operation_line"


    public static class equality_line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_line"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:82:1: equality_line : EQUAL_SIGN EQUAL_SIGN EQUAL_SIGN ;
    public final buchstabenGrammarParser.equality_line_return equality_line() throws RecognitionException {
        buchstabenGrammarParser.equality_line_return retval = new buchstabenGrammarParser.equality_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL_SIGN3=null;
        Token EQUAL_SIGN4=null;
        Token EQUAL_SIGN5=null;

        CommonTree EQUAL_SIGN3_tree=null;
        CommonTree EQUAL_SIGN4_tree=null;
        CommonTree EQUAL_SIGN5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equality_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:82:15: ( EQUAL_SIGN EQUAL_SIGN EQUAL_SIGN )
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:82:17: EQUAL_SIGN EQUAL_SIGN EQUAL_SIGN
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(82,17);
            EQUAL_SIGN3=(Token)match(input,EQUAL_SIGN,FOLLOW_EQUAL_SIGN_in_equality_line157); 
            EQUAL_SIGN3_tree = 
            (CommonTree)adaptor.create(EQUAL_SIGN3)
            ;
            adaptor.addChild(root_0, EQUAL_SIGN3_tree);

            dbg.location(82,28);
            EQUAL_SIGN4=(Token)match(input,EQUAL_SIGN,FOLLOW_EQUAL_SIGN_in_equality_line159); 
            EQUAL_SIGN4_tree = 
            (CommonTree)adaptor.create(EQUAL_SIGN4)
            ;
            adaptor.addChild(root_0, EQUAL_SIGN4_tree);

            dbg.location(82,39);
            EQUAL_SIGN5=(Token)match(input,EQUAL_SIGN,FOLLOW_EQUAL_SIGN_in_equality_line161); 
            EQUAL_SIGN5_tree = 
            (CommonTree)adaptor.create(EQUAL_SIGN5)
            ;
            adaptor.addChild(root_0, EQUAL_SIGN5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(82, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equality_line"


    public static class char_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_string"
    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:1: char_string : ( CHAR )+ -> ^( INPUT_STRING ( CHAR )+ ) ;
    public final buchstabenGrammarParser.char_string_return char_string() throws RecognitionException {
        buchstabenGrammarParser.char_string_return retval = new buchstabenGrammarParser.char_string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHAR6=null;

        CommonTree CHAR6_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");

        try { dbg.enterRule(getGrammarFileName(), "char_string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:13: ( ( CHAR )+ -> ^( INPUT_STRING ( CHAR )+ ) )
            dbg.enterAlt(1);

            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:15: ( CHAR )+
            {
            dbg.location(84,15);
            // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:15: ( CHAR )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHAR) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:15: CHAR
            	    {
            	    dbg.location(84,15);
            	    CHAR6=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_string169);  
            	    stream_CHAR.add(CHAR6);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: CHAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:21: -> ^( INPUT_STRING ( CHAR )+ )
            {
                dbg.location(84,24);
                // Z:\\win7\\Studium\\CI\\CI3\\Buchstaben\\buchstabenGrammar.g:84:24: ^( INPUT_STRING ( CHAR )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(84,26);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INPUT_STRING, "INPUT_STRING")
                , root_1);

                dbg.location(84,39);
                if ( !(stream_CHAR.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_CHAR.hasNext() ) {
                    dbg.location(84,39);
                    adaptor.addChild(root_1, 
                    stream_CHAR.nextNode()
                    );

                }
                stream_CHAR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(84, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "char_string");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "char_string"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_line_in_start49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_operation_line_in_start56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_expression_line_in_start63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equality_line_in_start66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_expression_line_in_start73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression_line93 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_SIGN_in_expression_line95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_char_string_in_expression_line99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_string_in_term115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_MINUS_SIGN_in_term119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_char_string_in_term123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_MINUS_SIGN_in_operation_line139 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_MINUS_SIGN_in_operation_line143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_MINUS_SIGN_in_operation_line147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_SIGN_in_equality_line157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_SIGN_in_equality_line159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_SIGN_in_equality_line161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_string169 = new BitSet(new long[]{0x0000000000000012L});

}