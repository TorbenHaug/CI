// $ANTLR 3.4 C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g 2014-11-13 08:23:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGINSYMBOL", "BOOLEANCONST", "CMDENDSYMBOL", "COMMENT", "CONSTANTSYMBOL", "DECLARATION", "DIGIT", "DOSYMBOL", "ELSESYMBOL", "ENDSYMBOL", "FISYMBOL", "ID", "IFSYMBOL", "INTEGERCONST", "KLAMMERAUFSYMBOL", "KLAMMERZUSYMBOL", "LISTCUTSYMBOL", "MALGETEILTSYMBOL", "ODSYMBOL", "PLUSMINUSSYMBOL", "PRINTLNSYMBOL", "PROGRAMMCODE", "PROGRAMSYMBOL", "READSYMBOL", "REALCONST", "REALCUTSYMBOL", "START", "STRINGCONST", "THENSYMBOL", "UNSIGNEDINTEGERCONST", "VERGLEICHSSYMBOL", "WHILESYMBOL", "WS", "ZUWEISUNGSSYMBOL"
    };

    public static final int EOF=-1;
    public static final int BEGINSYMBOL=4;
    public static final int BOOLEANCONST=5;
    public static final int CMDENDSYMBOL=6;
    public static final int COMMENT=7;
    public static final int CONSTANTSYMBOL=8;
    public static final int DECLARATION=9;
    public static final int DIGIT=10;
    public static final int DOSYMBOL=11;
    public static final int ELSESYMBOL=12;
    public static final int ENDSYMBOL=13;
    public static final int FISYMBOL=14;
    public static final int ID=15;
    public static final int IFSYMBOL=16;
    public static final int INTEGERCONST=17;
    public static final int KLAMMERAUFSYMBOL=18;
    public static final int KLAMMERZUSYMBOL=19;
    public static final int LISTCUTSYMBOL=20;
    public static final int MALGETEILTSYMBOL=21;
    public static final int ODSYMBOL=22;
    public static final int PLUSMINUSSYMBOL=23;
    public static final int PRINTLNSYMBOL=24;
    public static final int PROGRAMMCODE=25;
    public static final int PROGRAMSYMBOL=26;
    public static final int READSYMBOL=27;
    public static final int REALCONST=28;
    public static final int REALCUTSYMBOL=29;
    public static final int START=30;
    public static final int STRINGCONST=31;
    public static final int THENSYMBOL=32;
    public static final int UNSIGNEDINTEGERCONST=33;
    public static final int VERGLEICHSSYMBOL=34;
    public static final int WHILESYMBOL=35;
    public static final int WS=36;
    public static final int ZUWEISUNGSSYMBOL=37;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "zuweisungswert", "condition", "read", "term", "start", 
    "anweisung", "declaration", "number", "println", "programmcode", "product", 
    "arithausdr", "schleife", "zuweisung", "declarations", "vergleich"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public miniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public miniPParser(TokenStream input, int port, RecognizerSharedState state) {
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

public miniPParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return miniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:13:1: start : PROGRAMSYMBOL declaration BEGINSYMBOL programmcode ENDSYMBOL -> ^( START declaration programmcode ) ;
    public final miniPParser.start_return start() throws RecognitionException {
        miniPParser.start_return retval = new miniPParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PROGRAMSYMBOL1=null;
        Token BEGINSYMBOL3=null;
        Token ENDSYMBOL5=null;
        miniPParser.declaration_return declaration2 =null;

        miniPParser.programmcode_return programmcode4 =null;


        CommonTree PROGRAMSYMBOL1_tree=null;
        CommonTree BEGINSYMBOL3_tree=null;
        CommonTree ENDSYMBOL5_tree=null;
        RewriteRuleTokenStream stream_PROGRAMSYMBOL=new RewriteRuleTokenStream(adaptor,"token PROGRAMSYMBOL");
        RewriteRuleTokenStream stream_ENDSYMBOL=new RewriteRuleTokenStream(adaptor,"token ENDSYMBOL");
        RewriteRuleTokenStream stream_BEGINSYMBOL=new RewriteRuleTokenStream(adaptor,"token BEGINSYMBOL");
        RewriteRuleSubtreeStream stream_programmcode=new RewriteRuleSubtreeStream(adaptor,"rule programmcode");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:13:6: ( PROGRAMSYMBOL declaration BEGINSYMBOL programmcode ENDSYMBOL -> ^( START declaration programmcode ) )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:14:10: PROGRAMSYMBOL declaration BEGINSYMBOL programmcode ENDSYMBOL
            {
            dbg.location(14,10);
            PROGRAMSYMBOL1=(Token)match(input,PROGRAMSYMBOL,FOLLOW_PROGRAMSYMBOL_in_start52);  
            stream_PROGRAMSYMBOL.add(PROGRAMSYMBOL1);

            dbg.location(15,13);
            pushFollow(FOLLOW_declaration_in_start67);
            declaration2=declaration();

            state._fsp--;

            stream_declaration.add(declaration2.getTree());
            dbg.location(16,10);
            BEGINSYMBOL3=(Token)match(input,BEGINSYMBOL,FOLLOW_BEGINSYMBOL_in_start78);  
            stream_BEGINSYMBOL.add(BEGINSYMBOL3);

            dbg.location(17,13);
            pushFollow(FOLLOW_programmcode_in_start93);
            programmcode4=programmcode();

            state._fsp--;

            stream_programmcode.add(programmcode4.getTree());
            dbg.location(18,10);
            ENDSYMBOL5=(Token)match(input,ENDSYMBOL,FOLLOW_ENDSYMBOL_in_start104);  
            stream_ENDSYMBOL.add(ENDSYMBOL5);


            // AST REWRITE
            // elements: declaration, programmcode
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 18:20: -> ^( START declaration programmcode )
            {
                dbg.location(18,23);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:18:23: ^( START declaration programmcode )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(18,25);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(START, "START")
                , root_1);

                dbg.location(18,31);
                adaptor.addChild(root_1, stream_declaration.nextTree());
                dbg.location(18,43);
                adaptor.addChild(root_1, stream_programmcode.nextTree());

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
        dbg.location(18, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:1: declaration : ( declarations )* -> ^( DECLARATION ( declarations )* ) ;
    public final miniPParser.declaration_return declaration() throws RecognitionException {
        miniPParser.declaration_return retval = new miniPParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        miniPParser.declarations_return declarations6 =null;


        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:13: ( ( declarations )* -> ^( DECLARATION ( declarations )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:15: ( declarations )*
            {
            dbg.location(20,15);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:15: ( declarations )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONSTANTSYMBOL) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:15: declarations
            	    {
            	    dbg.location(20,15);
            	    pushFollow(FOLLOW_declarations_in_declaration122);
            	    declarations6=declarations();

            	    state._fsp--;

            	    stream_declarations.add(declarations6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:29: -> ^( DECLARATION ( declarations )* )
            {
                dbg.location(20,32);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:32: ^( DECLARATION ( declarations )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(20,34);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                dbg.location(20,46);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:20:46: ( declarations )*
                while ( stream_declarations.hasNext() ) {
                    dbg.location(20,46);
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

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
        dbg.location(20, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"


    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:1: declarations : ( CONSTANTSYMBOL ID ( LISTCUTSYMBOL ID )* CMDENDSYMBOL ) -> ^( CONSTANTSYMBOL ( ID )* ) ;
    public final miniPParser.declarations_return declarations() throws RecognitionException {
        miniPParser.declarations_return retval = new miniPParser.declarations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONSTANTSYMBOL7=null;
        Token ID8=null;
        Token LISTCUTSYMBOL9=null;
        Token ID10=null;
        Token CMDENDSYMBOL11=null;

        CommonTree CONSTANTSYMBOL7_tree=null;
        CommonTree ID8_tree=null;
        CommonTree LISTCUTSYMBOL9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree CMDENDSYMBOL11_tree=null;
        RewriteRuleTokenStream stream_CONSTANTSYMBOL=new RewriteRuleTokenStream(adaptor,"token CONSTANTSYMBOL");
        RewriteRuleTokenStream stream_CMDENDSYMBOL=new RewriteRuleTokenStream(adaptor,"token CMDENDSYMBOL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LISTCUTSYMBOL=new RewriteRuleTokenStream(adaptor,"token LISTCUTSYMBOL");

        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:15: ( ( CONSTANTSYMBOL ID ( LISTCUTSYMBOL ID )* CMDENDSYMBOL ) -> ^( CONSTANTSYMBOL ( ID )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:17: ( CONSTANTSYMBOL ID ( LISTCUTSYMBOL ID )* CMDENDSYMBOL )
            {
            dbg.location(21,17);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:17: ( CONSTANTSYMBOL ID ( LISTCUTSYMBOL ID )* CMDENDSYMBOL )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:18: CONSTANTSYMBOL ID ( LISTCUTSYMBOL ID )* CMDENDSYMBOL
            {
            dbg.location(21,18);
            CONSTANTSYMBOL7=(Token)match(input,CONSTANTSYMBOL,FOLLOW_CONSTANTSYMBOL_in_declarations141);  
            stream_CONSTANTSYMBOL.add(CONSTANTSYMBOL7);

            dbg.location(21,33);
            ID8=(Token)match(input,ID,FOLLOW_ID_in_declarations143);  
            stream_ID.add(ID8);

            dbg.location(21,36);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:36: ( LISTCUTSYMBOL ID )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==LISTCUTSYMBOL) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:37: LISTCUTSYMBOL ID
            	    {
            	    dbg.location(21,37);
            	    LISTCUTSYMBOL9=(Token)match(input,LISTCUTSYMBOL,FOLLOW_LISTCUTSYMBOL_in_declarations146);  
            	    stream_LISTCUTSYMBOL.add(LISTCUTSYMBOL9);

            	    dbg.location(21,51);
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_declarations148);  
            	    stream_ID.add(ID10);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(21,56);
            CMDENDSYMBOL11=(Token)match(input,CMDENDSYMBOL,FOLLOW_CMDENDSYMBOL_in_declarations152);  
            stream_CMDENDSYMBOL.add(CMDENDSYMBOL11);


            }


            // AST REWRITE
            // elements: ID, CONSTANTSYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 21:70: -> ^( CONSTANTSYMBOL ( ID )* )
            {
                dbg.location(21,73);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:73: ^( CONSTANTSYMBOL ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(21,75);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_CONSTANTSYMBOL.nextNode()
                , root_1);

                dbg.location(21,90);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:21:90: ( ID )*
                while ( stream_ID.hasNext() ) {
                    dbg.location(21,90);
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

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
        dbg.location(21, 93);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarations"


    public static class programmcode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programmcode"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:1: programmcode : ( anweisung )* -> ^( PROGRAMMCODE ( anweisung )* ) ;
    public final miniPParser.programmcode_return programmcode() throws RecognitionException {
        miniPParser.programmcode_return retval = new miniPParser.programmcode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        miniPParser.anweisung_return anweisung12 =null;


        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        try { dbg.enterRule(getGrammarFileName(), "programmcode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:15: ( ( anweisung )* -> ^( PROGRAMMCODE ( anweisung )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:17: ( anweisung )*
            {
            dbg.location(24,17);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:17: ( anweisung )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= ID && LA3_0 <= IFSYMBOL)||LA3_0==PRINTLNSYMBOL||LA3_0==READSYMBOL||LA3_0==WHILESYMBOL) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:17: anweisung
            	    {
            	    dbg.location(24,17);
            	    pushFollow(FOLLOW_anweisung_in_programmcode172);
            	    anweisung12=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            // AST REWRITE
            // elements: anweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:28: -> ^( PROGRAMMCODE ( anweisung )* )
            {
                dbg.location(24,31);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:31: ^( PROGRAMMCODE ( anweisung )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(24,33);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PROGRAMMCODE, "PROGRAMMCODE")
                , root_1);

                dbg.location(24,46);
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:24:46: ( anweisung )*
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(24,46);
                    adaptor.addChild(root_1, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

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
        dbg.location(24, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "programmcode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "programmcode"


    public static class anweisung_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anweisung"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:1: anweisung : ( zuweisung | condition | schleife | println | read );
    public final miniPParser.anweisung_return anweisung() throws RecognitionException {
        miniPParser.anweisung_return retval = new miniPParser.anweisung_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        miniPParser.zuweisung_return zuweisung13 =null;

        miniPParser.condition_return condition14 =null;

        miniPParser.schleife_return schleife15 =null;

        miniPParser.println_return println16 =null;

        miniPParser.read_return read17 =null;



        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:12: ( zuweisung | condition | schleife | println | read )
            int alt4=5;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case IFSYMBOL:
                {
                alt4=2;
                }
                break;
            case WHILESYMBOL:
                {
                alt4=3;
                }
                break;
            case PRINTLNSYMBOL:
                {
                alt4=4;
                }
                break;
            case READSYMBOL:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:14: zuweisung
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,14);
                    pushFollow(FOLLOW_zuweisung_in_anweisung190);
                    zuweisung13=zuweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, zuweisung13.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:26: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,26);
                    pushFollow(FOLLOW_condition_in_anweisung194);
                    condition14=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition14.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:38: schleife
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,38);
                    pushFollow(FOLLOW_schleife_in_anweisung198);
                    schleife15=schleife();

                    state._fsp--;

                    adaptor.addChild(root_0, schleife15.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:49: println
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,49);
                    pushFollow(FOLLOW_println_in_anweisung202);
                    println16=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println16.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:25:59: read
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,59);
                    pushFollow(FOLLOW_read_in_anweisung206);
                    read17=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read17.getTree());

                    }
                    break;

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
        dbg.location(25, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anweisung"


    public static class zuweisung_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zuweisung"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:29:1: zuweisung : ID ZUWEISUNGSSYMBOL ^ zuweisungswert CMDENDSYMBOL !;
    public final miniPParser.zuweisung_return zuweisung() throws RecognitionException {
        miniPParser.zuweisung_return retval = new miniPParser.zuweisung_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID18=null;
        Token ZUWEISUNGSSYMBOL19=null;
        Token CMDENDSYMBOL21=null;
        miniPParser.zuweisungswert_return zuweisungswert20 =null;


        CommonTree ID18_tree=null;
        CommonTree ZUWEISUNGSSYMBOL19_tree=null;
        CommonTree CMDENDSYMBOL21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "zuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:29:12: ( ID ZUWEISUNGSSYMBOL ^ zuweisungswert CMDENDSYMBOL !)
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:29:14: ID ZUWEISUNGSSYMBOL ^ zuweisungswert CMDENDSYMBOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,14);
            ID18=(Token)match(input,ID,FOLLOW_ID_in_zuweisung217); 
            ID18_tree = 
            (CommonTree)adaptor.create(ID18)
            ;
            adaptor.addChild(root_0, ID18_tree);

            dbg.location(29,33);
            ZUWEISUNGSSYMBOL19=(Token)match(input,ZUWEISUNGSSYMBOL,FOLLOW_ZUWEISUNGSSYMBOL_in_zuweisung219); 
            ZUWEISUNGSSYMBOL19_tree = 
            (CommonTree)adaptor.create(ZUWEISUNGSSYMBOL19)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ZUWEISUNGSSYMBOL19_tree, root_0);

            dbg.location(29,35);
            pushFollow(FOLLOW_zuweisungswert_in_zuweisung222);
            zuweisungswert20=zuweisungswert();

            state._fsp--;

            adaptor.addChild(root_0, zuweisungswert20.getTree());
            dbg.location(29,62);
            CMDENDSYMBOL21=(Token)match(input,CMDENDSYMBOL,FOLLOW_CMDENDSYMBOL_in_zuweisung224); 

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
        dbg.location(29, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "zuweisung"


    public static class zuweisungswert_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zuweisungswert"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:1: zuweisungswert : ( STRINGCONST | BOOLEANCONST | vergleich | arithausdr );
    public final miniPParser.zuweisungswert_return zuweisungswert() throws RecognitionException {
        miniPParser.zuweisungswert_return retval = new miniPParser.zuweisungswert_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRINGCONST22=null;
        Token BOOLEANCONST23=null;
        miniPParser.vergleich_return vergleich24 =null;

        miniPParser.arithausdr_return arithausdr25 =null;


        CommonTree STRINGCONST22_tree=null;
        CommonTree BOOLEANCONST23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "zuweisungswert");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:17: ( STRINGCONST | BOOLEANCONST | vergleich | arithausdr )
            int alt5=4;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case STRINGCONST:
                {
                alt5=1;
                }
                break;
            case BOOLEANCONST:
                {
                alt5=2;
                }
                break;
            case INTEGERCONST:
            case REALCONST:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==VERGLEICHSSYMBOL) ) {
                    alt5=3;
                }
                else if ( (LA5_3==CMDENDSYMBOL||LA5_3==KLAMMERZUSYMBOL||LA5_3==MALGETEILTSYMBOL||LA5_3==PLUSMINUSSYMBOL) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==VERGLEICHSSYMBOL) ) {
                    alt5=3;
                }
                else if ( (LA5_4==CMDENDSYMBOL||LA5_4==KLAMMERZUSYMBOL||LA5_4==MALGETEILTSYMBOL||LA5_4==PLUSMINUSSYMBOL) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case KLAMMERAUFSYMBOL:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:19: STRINGCONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,19);
                    STRINGCONST22=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_zuweisungswert233); 
                    STRINGCONST22_tree = 
                    (CommonTree)adaptor.create(STRINGCONST22)
                    ;
                    adaptor.addChild(root_0, STRINGCONST22_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:33: BOOLEANCONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,33);
                    BOOLEANCONST23=(Token)match(input,BOOLEANCONST,FOLLOW_BOOLEANCONST_in_zuweisungswert237); 
                    BOOLEANCONST23_tree = 
                    (CommonTree)adaptor.create(BOOLEANCONST23)
                    ;
                    adaptor.addChild(root_0, BOOLEANCONST23_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:48: vergleich
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,48);
                    pushFollow(FOLLOW_vergleich_in_zuweisungswert241);
                    vergleich24=vergleich();

                    state._fsp--;

                    adaptor.addChild(root_0, vergleich24.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:30:60: arithausdr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,60);
                    pushFollow(FOLLOW_arithausdr_in_zuweisungswert245);
                    arithausdr25=arithausdr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithausdr25.getTree());

                    }
                    break;

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
        dbg.location(30, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zuweisungswert");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "zuweisungswert"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:33:1: condition : IFSYMBOL ^ vergleich THENSYMBOL ! programmcode ( ELSESYMBOL ! programmcode )? FISYMBOL !;
    public final miniPParser.condition_return condition() throws RecognitionException {
        miniPParser.condition_return retval = new miniPParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IFSYMBOL26=null;
        Token THENSYMBOL28=null;
        Token ELSESYMBOL30=null;
        Token FISYMBOL32=null;
        miniPParser.vergleich_return vergleich27 =null;

        miniPParser.programmcode_return programmcode29 =null;

        miniPParser.programmcode_return programmcode31 =null;


        CommonTree IFSYMBOL26_tree=null;
        CommonTree THENSYMBOL28_tree=null;
        CommonTree ELSESYMBOL30_tree=null;
        CommonTree FISYMBOL32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:33:12: ( IFSYMBOL ^ vergleich THENSYMBOL ! programmcode ( ELSESYMBOL ! programmcode )? FISYMBOL !)
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:33:14: IFSYMBOL ^ vergleich THENSYMBOL ! programmcode ( ELSESYMBOL ! programmcode )? FISYMBOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,22);
            IFSYMBOL26=(Token)match(input,IFSYMBOL,FOLLOW_IFSYMBOL_in_condition256); 
            IFSYMBOL26_tree = 
            (CommonTree)adaptor.create(IFSYMBOL26)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IFSYMBOL26_tree, root_0);

            dbg.location(33,24);
            pushFollow(FOLLOW_vergleich_in_condition259);
            vergleich27=vergleich();

            state._fsp--;

            adaptor.addChild(root_0, vergleich27.getTree());
            dbg.location(33,44);
            THENSYMBOL28=(Token)match(input,THENSYMBOL,FOLLOW_THENSYMBOL_in_condition261); 
            dbg.location(33,46);
            pushFollow(FOLLOW_programmcode_in_condition264);
            programmcode29=programmcode();

            state._fsp--;

            adaptor.addChild(root_0, programmcode29.getTree());
            dbg.location(33,59);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:33:59: ( ELSESYMBOL ! programmcode )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSESYMBOL) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:33:60: ELSESYMBOL ! programmcode
                    {
                    dbg.location(33,70);
                    ELSESYMBOL30=(Token)match(input,ELSESYMBOL,FOLLOW_ELSESYMBOL_in_condition267); 
                    dbg.location(33,72);
                    pushFollow(FOLLOW_programmcode_in_condition270);
                    programmcode31=programmcode();

                    state._fsp--;

                    adaptor.addChild(root_0, programmcode31.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(33,95);
            FISYMBOL32=(Token)match(input,FISYMBOL,FOLLOW_FISYMBOL_in_condition274); 

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
        dbg.location(33, 95);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"


    public static class vergleich_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:1: vergleich : ( number | ID ) VERGLEICHSSYMBOL ^ ( number | ID ) ;
    public final miniPParser.vergleich_return vergleich() throws RecognitionException {
        miniPParser.vergleich_return retval = new miniPParser.vergleich_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID34=null;
        Token VERGLEICHSSYMBOL35=null;
        Token ID37=null;
        miniPParser.number_return number33 =null;

        miniPParser.number_return number36 =null;


        CommonTree ID34_tree=null;
        CommonTree VERGLEICHSSYMBOL35_tree=null;
        CommonTree ID37_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:12: ( ( number | ID ) VERGLEICHSSYMBOL ^ ( number | ID ) )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:15: ( number | ID ) VERGLEICHSSYMBOL ^ ( number | ID )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(36,15);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:15: ( number | ID )
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==INTEGERCONST||LA7_0==REALCONST) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:16: number
                    {
                    dbg.location(36,16);
                    pushFollow(FOLLOW_number_in_vergleich287);
                    number33=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number33.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:25: ID
                    {
                    dbg.location(36,25);
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_vergleich291); 
                    ID34_tree = 
                    (CommonTree)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(36,45);
            VERGLEICHSSYMBOL35=(Token)match(input,VERGLEICHSSYMBOL,FOLLOW_VERGLEICHSSYMBOL_in_vergleich294); 
            VERGLEICHSSYMBOL35_tree = 
            (CommonTree)adaptor.create(VERGLEICHSSYMBOL35)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VERGLEICHSSYMBOL35_tree, root_0);

            dbg.location(36,47);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:47: ( number | ID )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==INTEGERCONST||LA8_0==REALCONST) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:48: number
                    {
                    dbg.location(36,48);
                    pushFollow(FOLLOW_number_in_vergleich298);
                    number36=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number36.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:36:57: ID
                    {
                    dbg.location(36,57);
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_vergleich302); 
                    ID37_tree = 
                    (CommonTree)adaptor.create(ID37)
                    ;
                    adaptor.addChild(root_0, ID37_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(36, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vergleich"


    public static class schleife_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schleife"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:39:1: schleife : WHILESYMBOL ^ vergleich DOSYMBOL ! programmcode ODSYMBOL !;
    public final miniPParser.schleife_return schleife() throws RecognitionException {
        miniPParser.schleife_return retval = new miniPParser.schleife_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILESYMBOL38=null;
        Token DOSYMBOL40=null;
        Token ODSYMBOL42=null;
        miniPParser.vergleich_return vergleich39 =null;

        miniPParser.programmcode_return programmcode41 =null;


        CommonTree WHILESYMBOL38_tree=null;
        CommonTree DOSYMBOL40_tree=null;
        CommonTree ODSYMBOL42_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "schleife");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:39:10: ( WHILESYMBOL ^ vergleich DOSYMBOL ! programmcode ODSYMBOL !)
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:39:12: WHILESYMBOL ^ vergleich DOSYMBOL ! programmcode ODSYMBOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(39,23);
            WHILESYMBOL38=(Token)match(input,WHILESYMBOL,FOLLOW_WHILESYMBOL_in_schleife312); 
            WHILESYMBOL38_tree = 
            (CommonTree)adaptor.create(WHILESYMBOL38)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILESYMBOL38_tree, root_0);

            dbg.location(39,25);
            pushFollow(FOLLOW_vergleich_in_schleife315);
            vergleich39=vergleich();

            state._fsp--;

            adaptor.addChild(root_0, vergleich39.getTree());
            dbg.location(39,43);
            DOSYMBOL40=(Token)match(input,DOSYMBOL,FOLLOW_DOSYMBOL_in_schleife317); 
            dbg.location(39,45);
            pushFollow(FOLLOW_programmcode_in_schleife320);
            programmcode41=programmcode();

            state._fsp--;

            adaptor.addChild(root_0, programmcode41.getTree());
            dbg.location(39,66);
            ODSYMBOL42=(Token)match(input,ODSYMBOL,FOLLOW_ODSYMBOL_in_schleife322); 

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
        dbg.location(39, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "schleife");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "schleife"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:41:1: number : ( REALCONST | INTEGERCONST );
    public final miniPParser.number_return number() throws RecognitionException {
        miniPParser.number_return retval = new miniPParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set43=null;

        CommonTree set43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:41:10: ( REALCONST | INTEGERCONST )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(41,10);
            set43=(Token)input.LT(1);

            if ( input.LA(1)==INTEGERCONST||input.LA(1)==REALCONST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set43)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(41, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"


    public static class println_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "println"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:44:1: println : PRINTLNSYMBOL ^ KLAMMERAUFSYMBOL ! zuweisungswert KLAMMERZUSYMBOL ! CMDENDSYMBOL !;
    public final miniPParser.println_return println() throws RecognitionException {
        miniPParser.println_return retval = new miniPParser.println_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINTLNSYMBOL44=null;
        Token KLAMMERAUFSYMBOL45=null;
        Token KLAMMERZUSYMBOL47=null;
        Token CMDENDSYMBOL48=null;
        miniPParser.zuweisungswert_return zuweisungswert46 =null;


        CommonTree PRINTLNSYMBOL44_tree=null;
        CommonTree KLAMMERAUFSYMBOL45_tree=null;
        CommonTree KLAMMERZUSYMBOL47_tree=null;
        CommonTree CMDENDSYMBOL48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:44:10: ( PRINTLNSYMBOL ^ KLAMMERAUFSYMBOL ! zuweisungswert KLAMMERZUSYMBOL ! CMDENDSYMBOL !)
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:44:12: PRINTLNSYMBOL ^ KLAMMERAUFSYMBOL ! zuweisungswert KLAMMERZUSYMBOL ! CMDENDSYMBOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(44,25);
            PRINTLNSYMBOL44=(Token)match(input,PRINTLNSYMBOL,FOLLOW_PRINTLNSYMBOL_in_println348); 
            PRINTLNSYMBOL44_tree = 
            (CommonTree)adaptor.create(PRINTLNSYMBOL44)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRINTLNSYMBOL44_tree, root_0);

            dbg.location(44,43);
            KLAMMERAUFSYMBOL45=(Token)match(input,KLAMMERAUFSYMBOL,FOLLOW_KLAMMERAUFSYMBOL_in_println351); 
            dbg.location(44,45);
            pushFollow(FOLLOW_zuweisungswert_in_println354);
            zuweisungswert46=zuweisungswert();

            state._fsp--;

            adaptor.addChild(root_0, zuweisungswert46.getTree());
            dbg.location(44,75);
            KLAMMERZUSYMBOL47=(Token)match(input,KLAMMERZUSYMBOL,FOLLOW_KLAMMERZUSYMBOL_in_println356); 
            dbg.location(44,89);
            CMDENDSYMBOL48=(Token)match(input,CMDENDSYMBOL,FOLLOW_CMDENDSYMBOL_in_println359); 

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
        dbg.location(44, 89);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "println"


    public static class read_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:47:1: read : READSYMBOL ^ KLAMMERAUFSYMBOL ! ID KLAMMERZUSYMBOL ! CMDENDSYMBOL !;
    public final miniPParser.read_return read() throws RecognitionException {
        miniPParser.read_return retval = new miniPParser.read_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token READSYMBOL49=null;
        Token KLAMMERAUFSYMBOL50=null;
        Token ID51=null;
        Token KLAMMERZUSYMBOL52=null;
        Token CMDENDSYMBOL53=null;

        CommonTree READSYMBOL49_tree=null;
        CommonTree KLAMMERAUFSYMBOL50_tree=null;
        CommonTree ID51_tree=null;
        CommonTree KLAMMERZUSYMBOL52_tree=null;
        CommonTree CMDENDSYMBOL53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:47:7: ( READSYMBOL ^ KLAMMERAUFSYMBOL ! ID KLAMMERZUSYMBOL ! CMDENDSYMBOL !)
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:47:9: READSYMBOL ^ KLAMMERAUFSYMBOL ! ID KLAMMERZUSYMBOL ! CMDENDSYMBOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(47,19);
            READSYMBOL49=(Token)match(input,READSYMBOL,FOLLOW_READSYMBOL_in_read371); 
            READSYMBOL49_tree = 
            (CommonTree)adaptor.create(READSYMBOL49)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(READSYMBOL49_tree, root_0);

            dbg.location(47,37);
            KLAMMERAUFSYMBOL50=(Token)match(input,KLAMMERAUFSYMBOL,FOLLOW_KLAMMERAUFSYMBOL_in_read374); 
            dbg.location(47,39);
            ID51=(Token)match(input,ID,FOLLOW_ID_in_read377); 
            ID51_tree = 
            (CommonTree)adaptor.create(ID51)
            ;
            adaptor.addChild(root_0, ID51_tree);

            dbg.location(47,57);
            KLAMMERZUSYMBOL52=(Token)match(input,KLAMMERZUSYMBOL,FOLLOW_KLAMMERZUSYMBOL_in_read379); 
            dbg.location(47,71);
            CMDENDSYMBOL53=(Token)match(input,CMDENDSYMBOL,FOLLOW_CMDENDSYMBOL_in_read382); 

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
        dbg.location(47, 71);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read"


    public static class arithausdr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithausdr"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:49:1: arithausdr : product ( PLUSMINUSSYMBOL ^ product )* ;
    public final miniPParser.arithausdr_return arithausdr() throws RecognitionException {
        miniPParser.arithausdr_return retval = new miniPParser.arithausdr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUSMINUSSYMBOL55=null;
        miniPParser.product_return product54 =null;

        miniPParser.product_return product56 =null;


        CommonTree PLUSMINUSSYMBOL55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arithausdr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:49:17: ( product ( PLUSMINUSSYMBOL ^ product )* )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:49:19: product ( PLUSMINUSSYMBOL ^ product )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(49,19);
            pushFollow(FOLLOW_product_in_arithausdr396);
            product54=product();

            state._fsp--;

            adaptor.addChild(root_0, product54.getTree());
            dbg.location(49,27);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:49:27: ( PLUSMINUSSYMBOL ^ product )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==PLUSMINUSSYMBOL) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:49:28: PLUSMINUSSYMBOL ^ product
            	    {
            	    dbg.location(49,43);
            	    PLUSMINUSSYMBOL55=(Token)match(input,PLUSMINUSSYMBOL,FOLLOW_PLUSMINUSSYMBOL_in_arithausdr399); 
            	    PLUSMINUSSYMBOL55_tree = 
            	    (CommonTree)adaptor.create(PLUSMINUSSYMBOL55)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUSMINUSSYMBOL55_tree, root_0);

            	    dbg.location(49,45);
            	    pushFollow(FOLLOW_product_in_arithausdr402);
            	    product56=product();

            	    state._fsp--;

            	    adaptor.addChild(root_0, product56.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


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
        dbg.location(49, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithausdr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithausdr"


    public static class product_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "product"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:50:1: product : term ( MALGETEILTSYMBOL ^ term )* ;
    public final miniPParser.product_return product() throws RecognitionException {
        miniPParser.product_return retval = new miniPParser.product_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MALGETEILTSYMBOL58=null;
        miniPParser.term_return term57 =null;

        miniPParser.term_return term59 =null;


        CommonTree MALGETEILTSYMBOL58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "product");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:50:17: ( term ( MALGETEILTSYMBOL ^ term )* )
            dbg.enterAlt(1);

            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:50:19: term ( MALGETEILTSYMBOL ^ term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(50,19);
            pushFollow(FOLLOW_term_in_product419);
            term57=term();

            state._fsp--;

            adaptor.addChild(root_0, term57.getTree());
            dbg.location(50,24);
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:50:24: ( MALGETEILTSYMBOL ^ term )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==MALGETEILTSYMBOL) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:50:25: MALGETEILTSYMBOL ^ term
            	    {
            	    dbg.location(50,41);
            	    MALGETEILTSYMBOL58=(Token)match(input,MALGETEILTSYMBOL,FOLLOW_MALGETEILTSYMBOL_in_product422); 
            	    MALGETEILTSYMBOL58_tree = 
            	    (CommonTree)adaptor.create(MALGETEILTSYMBOL58)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MALGETEILTSYMBOL58_tree, root_0);

            	    dbg.location(50,43);
            	    pushFollow(FOLLOW_term_in_product425);
            	    term59=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term59.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


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
        dbg.location(50, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "product");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "product"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:51:1: term : ( ID | number | KLAMMERAUFSYMBOL ! arithausdr KLAMMERZUSYMBOL !);
    public final miniPParser.term_return term() throws RecognitionException {
        miniPParser.term_return retval = new miniPParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID60=null;
        Token KLAMMERAUFSYMBOL62=null;
        Token KLAMMERZUSYMBOL64=null;
        miniPParser.number_return number61 =null;

        miniPParser.arithausdr_return arithausdr63 =null;


        CommonTree ID60_tree=null;
        CommonTree KLAMMERAUFSYMBOL62_tree=null;
        CommonTree KLAMMERZUSYMBOL64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:51:17: ( ID | number | KLAMMERAUFSYMBOL ! arithausdr KLAMMERZUSYMBOL !)
            int alt11=3;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt11=1;
                }
                break;
            case INTEGERCONST:
            case REALCONST:
                {
                alt11=2;
                }
                break;
            case KLAMMERAUFSYMBOL:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:51:19: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(51,19);
                    ID60=(Token)match(input,ID,FOLLOW_ID_in_term445); 
                    ID60_tree = 
                    (CommonTree)adaptor.create(ID60)
                    ;
                    adaptor.addChild(root_0, ID60_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:51:24: number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(51,24);
                    pushFollow(FOLLOW_number_in_term449);
                    number61=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number61.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:51:33: KLAMMERAUFSYMBOL ! arithausdr KLAMMERZUSYMBOL !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(51,49);
                    KLAMMERAUFSYMBOL62=(Token)match(input,KLAMMERAUFSYMBOL,FOLLOW_KLAMMERAUFSYMBOL_in_term453); 
                    dbg.location(51,51);
                    pushFollow(FOLLOW_arithausdr_in_term456);
                    arithausdr63=arithausdr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithausdr63.getTree());
                    dbg.location(51,77);
                    KLAMMERZUSYMBOL64=(Token)match(input,KLAMMERZUSYMBOL,FOLLOW_KLAMMERZUSYMBOL_in_term458); 

                    }
                    break;

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
        dbg.location(51, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMSYMBOL_in_start52 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_declaration_in_start67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BEGINSYMBOL_in_start78 = new BitSet(new long[]{0x000000080901A000L});
    public static final BitSet FOLLOW_programmcode_in_start93 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDSYMBOL_in_start104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_declaration122 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_CONSTANTSYMBOL_in_declarations141 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_declarations143 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_LISTCUTSYMBOL_in_declarations146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_declarations148 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_CMDENDSYMBOL_in_declarations152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anweisung_in_programmcode172 = new BitSet(new long[]{0x0000000809018002L});
    public static final BitSet FOLLOW_zuweisung_in_anweisung190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_anweisung194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schleife_in_anweisung198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_anweisung202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_anweisung206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_zuweisung217 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ZUWEISUNGSSYMBOL_in_zuweisung219 = new BitSet(new long[]{0x0000000090068020L});
    public static final BitSet FOLLOW_zuweisungswert_in_zuweisung222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CMDENDSYMBOL_in_zuweisung224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGCONST_in_zuweisungswert233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANCONST_in_zuweisungswert237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vergleich_in_zuweisungswert241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithausdr_in_zuweisungswert245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFSYMBOL_in_condition256 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_vergleich_in_condition259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_THENSYMBOL_in_condition261 = new BitSet(new long[]{0x000000080901D000L});
    public static final BitSet FOLLOW_programmcode_in_condition264 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ELSESYMBOL_in_condition267 = new BitSet(new long[]{0x000000080901C000L});
    public static final BitSet FOLLOW_programmcode_in_condition270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FISYMBOL_in_condition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_vergleich287 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_vergleich291 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_VERGLEICHSSYMBOL_in_vergleich294 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_number_in_vergleich298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_vergleich302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILESYMBOL_in_schleife312 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_vergleich_in_schleife315 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOSYMBOL_in_schleife317 = new BitSet(new long[]{0x0000000809418000L});
    public static final BitSet FOLLOW_programmcode_in_schleife320 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ODSYMBOL_in_schleife322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLNSYMBOL_in_println348 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KLAMMERAUFSYMBOL_in_println351 = new BitSet(new long[]{0x0000000090068020L});
    public static final BitSet FOLLOW_zuweisungswert_in_println354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KLAMMERZUSYMBOL_in_println356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CMDENDSYMBOL_in_println359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READSYMBOL_in_read371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KLAMMERAUFSYMBOL_in_read374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_read377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KLAMMERZUSYMBOL_in_read379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CMDENDSYMBOL_in_read382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_arithausdr396 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PLUSMINUSSYMBOL_in_arithausdr399 = new BitSet(new long[]{0x0000000010068000L});
    public static final BitSet FOLLOW_product_in_arithausdr402 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_term_in_product419 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_MALGETEILTSYMBOL_in_product422 = new BitSet(new long[]{0x0000000010068000L});
    public static final BitSet FOLLOW_term_in_product425 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ID_in_term445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KLAMMERAUFSYMBOL_in_term453 = new BitSet(new long[]{0x0000000010068000L});
    public static final BitSet FOLLOW_arithausdr_in_term456 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KLAMMERZUSYMBOL_in_term458 = new BitSet(new long[]{0x0000000000000002L});

}