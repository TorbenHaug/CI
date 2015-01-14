// $ANTLR 3.4 Z:\\win7\\CI\\CI4\\transformWalker.g 2015-01-14 09:53:59

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUFGABE", "EQUALS", "LETTER", "MINUS", "NEWLINE", "PLUS", "RAETSEL", "WORT", "WS"
    };

    public static final int EOF=-1;
    public static final int AUFGABE=4;
    public static final int EQUALS=5;
    public static final int LETTER=6;
    public static final int MINUS=7;
    public static final int NEWLINE=8;
    public static final int PLUS=9;
    public static final int RAETSEL=10;
    public static final int WORT=11;
    public static final int WS=12;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "aufgabe", "wort", "prog"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public transformWalker(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public transformWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public transformWalker(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return transformWalker.tokenNames; }
    public String getGrammarFileName() { return "Z:\\win7\\CI\\CI4\\transformWalker.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Z:\\win7\\CI\\CI4\\transformWalker.g:9:1: prog : ^( RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) ;
    public final transformWalker.prog_return prog() throws RecognitionException {
        transformWalker.prog_return retval = new transformWalker.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RAETSEL1=null;
        transformWalker.aufgabe_return aufgabe2 =null;

        transformWalker.aufgabe_return aufgabe3 =null;

        transformWalker.aufgabe_return aufgabe4 =null;

        transformWalker.aufgabe_return aufgabe5 =null;

        transformWalker.aufgabe_return aufgabe6 =null;

        transformWalker.aufgabe_return aufgabe7 =null;


        CommonTree RAETSEL1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:9:6: ( ^( RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\transformWalker.g:9:8: ^( RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(9,8);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(9,10);
            _last = (CommonTree)input.LT(1);
            RAETSEL1=(CommonTree)match(input,RAETSEL,FOLLOW_RAETSEL_in_prog40); 
            RAETSEL1_tree = (CommonTree)adaptor.dupNode(RAETSEL1);


            root_1 = (CommonTree)adaptor.becomeRoot(RAETSEL1_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(9,18);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog42);
            aufgabe2=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe2.getTree());

            dbg.location(9,26);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog44);
            aufgabe3=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe3.getTree());

            dbg.location(9,34);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog46);
            aufgabe4=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe4.getTree());

            dbg.location(9,42);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog48);
            aufgabe5=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe5.getTree());

            dbg.location(9,50);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog50);
            aufgabe6=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe6.getTree());

            dbg.location(9,58);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog52);
            aufgabe7=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe7.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(9, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class aufgabe_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aufgabe"
    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:1: aufgabe : ( ^( EQUALS ( ^( PLUS wort wort ) ) wort ) | ^( EQUALS ^( MINUS w1= wort w2= wort ) w3= wort ) -> ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1) );
    public final transformWalker.aufgabe_return aufgabe() throws RecognitionException {
        transformWalker.aufgabe_return retval = new transformWalker.aufgabe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS8=null;
        CommonTree PLUS9=null;
        CommonTree EQUALS13=null;
        CommonTree MINUS14=null;
        transformWalker.wort_return w1 =null;

        transformWalker.wort_return w2 =null;

        transformWalker.wort_return w3 =null;

        transformWalker.wort_return wort10 =null;

        transformWalker.wort_return wort11 =null;

        transformWalker.wort_return wort12 =null;


        CommonTree EQUALS8_tree=null;
        CommonTree PLUS9_tree=null;
        CommonTree EQUALS13_tree=null;
        CommonTree MINUS14_tree=null;
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_wort=new RewriteRuleSubtreeStream(adaptor,"rule wort");
        try { dbg.enterRule(getGrammarFileName(), "aufgabe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:11:9: ( ^( EQUALS ( ^( PLUS wort wort ) ) wort ) | ^( EQUALS ^( MINUS w1= wort w2= wort ) w3= wort ) -> ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQUALS) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==MINUS) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==PLUS) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:11: ^( EQUALS ( ^( PLUS wort wort ) ) wort )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(11,11);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(11,13);
                    _last = (CommonTree)input.LT(1);
                    EQUALS8=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_aufgabe62); 
                    EQUALS8_tree = (CommonTree)adaptor.dupNode(EQUALS8);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(11,20);
                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:20: ( ^( PLUS wort wort ) )
                    dbg.enterAlt(1);

                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:21: ^( PLUS wort wort )
                    {
                    dbg.location(11,21);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(11,23);
                    _last = (CommonTree)input.LT(1);
                    PLUS9=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_aufgabe66); 
                    PLUS9_tree = (CommonTree)adaptor.dupNode(PLUS9);


                    root_2 = (CommonTree)adaptor.becomeRoot(PLUS9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(11,28);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe68);
                    wort10=wort();

                    state._fsp--;

                    adaptor.addChild(root_2, wort10.getTree());

                    dbg.location(11,33);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe70);
                    wort11=wort();

                    state._fsp--;

                    adaptor.addChild(root_2, wort11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    }

                    dbg.location(11,40);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe74);
                    wort12=wort();

                    state._fsp--;

                    adaptor.addChild(root_1, wort12.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\win7\\CI\\CI4\\transformWalker.g:12:4: ^( EQUALS ^( MINUS w1= wort w2= wort ) w3= wort )
                    {
                    dbg.location(12,4);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(12,6);
                    _last = (CommonTree)input.LT(1);
                    EQUALS13=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_aufgabe81);  
                    stream_EQUALS.add(EQUALS13);


                    match(input, Token.DOWN, null); 
                    dbg.location(12,13);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(12,15);
                    _last = (CommonTree)input.LT(1);
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aufgabe84);  
                    stream_MINUS.add(MINUS14);


                    match(input, Token.DOWN, null); 
                    dbg.location(12,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe88);
                    w1=wort();

                    state._fsp--;

                    stream_wort.add(w1.getTree());
                    dbg.location(12,31);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe92);
                    w2=wort();

                    state._fsp--;

                    stream_wort.add(w2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(12,40);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe97);
                    w3=wort();

                    state._fsp--;

                    stream_wort.add(w3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: EQUALS, w3, w2, w1
                    // token labels: 
                    // rule labels: w1, w2, w3, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_w1=new RewriteRuleSubtreeStream(adaptor,"rule w1",w1!=null?w1.tree:null);
                    RewriteRuleSubtreeStream stream_w2=new RewriteRuleSubtreeStream(adaptor,"rule w2",w2!=null?w2.tree:null);
                    RewriteRuleSubtreeStream stream_w3=new RewriteRuleSubtreeStream(adaptor,"rule w3",w3!=null?w3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 12:47: -> ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1)
                    {
                        dbg.location(12,50);
                        // Z:\\win7\\CI\\CI4\\transformWalker.g:12:50: ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(12,52);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        dbg.location(12,59);
                        // Z:\\win7\\CI\\CI4\\transformWalker.g:12:59: ^( PLUS[null, \"+\"] $w3 $w2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(12,61);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, null, "+")
                        , root_2);

                        dbg.location(12,78);
                        adaptor.addChild(root_2, stream_w3.nextTree());
                        dbg.location(12,82);
                        adaptor.addChild(root_2, stream_w2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(12,87);
                        adaptor.addChild(root_1, stream_w1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aufgabe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "aufgabe"


    public static class wort_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wort"
    // Z:\\win7\\CI\\CI4\\transformWalker.g:15:1: wort : ^( WORT ( LETTER )+ ) ;
    public final transformWalker.wort_return wort() throws RecognitionException {
        transformWalker.wort_return retval = new transformWalker.wort_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WORT15=null;
        CommonTree LETTER16=null;

        CommonTree WORT15_tree=null;
        CommonTree LETTER16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:7: ( ^( WORT ( LETTER )+ ) )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:9: ^( WORT ( LETTER )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(15,9);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(15,11);
            _last = (CommonTree)input.LT(1);
            WORT15=(CommonTree)match(input,WORT,FOLLOW_WORT_in_wort129); 
            WORT15_tree = (CommonTree)adaptor.dupNode(WORT15);


            root_1 = (CommonTree)adaptor.becomeRoot(WORT15_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(15,16);
            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:16: ( LETTER )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==LETTER) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\win7\\CI\\CI4\\transformWalker.g:15:16: LETTER
            	    {
            	    dbg.location(15,16);
            	    _last = (CommonTree)input.LT(1);
            	    LETTER16=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_wort131); 
            	    LETTER16_tree = (CommonTree)adaptor.dupNode(LETTER16);


            	    adaptor.addChild(root_1, LETTER16_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wort"

    // Delegated rules


 

    public static final BitSet FOLLOW_RAETSEL_in_prog40 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aufgabe_in_prog42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog52 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_aufgabe62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_aufgabe66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_aufgabe68 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_wort_in_aufgabe70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_aufgabe74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_aufgabe81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_aufgabe84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_aufgabe88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_wort_in_aufgabe92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_aufgabe97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORT_in_wort129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_wort131 = new BitSet(new long[]{0x0000000000000048L});

}