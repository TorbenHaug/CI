// $ANTLR 3.4 Z:\\win7\\CI\\CI4\\transformWalker.g 2015-01-14 09:48:58

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformWalker extends TreeParser {
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


    public transformWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public transformWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
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

        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:9:6: ( ^( RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) )
            // Z:\\win7\\CI\\CI4\\transformWalker.g:9:8: ^( RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RAETSEL1=(CommonTree)match(input,RAETSEL,FOLLOW_RAETSEL_in_prog40); 
            RAETSEL1_tree = (CommonTree)adaptor.dupNode(RAETSEL1);


            root_1 = (CommonTree)adaptor.becomeRoot(RAETSEL1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog42);
            aufgabe2=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog44);
            aufgabe3=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog46);
            aufgabe4=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog48);
            aufgabe5=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_prog50);
            aufgabe6=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe6.getTree());


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
        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:11:9: ( ^( EQUALS ( ^( PLUS wort wort ) ) wort ) | ^( EQUALS ^( MINUS w1= wort w2= wort ) w3= wort ) -> ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1) )
            int alt1=2;
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

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:11: ^( EQUALS ( ^( PLUS wort wort ) ) wort )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS8=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_aufgabe62); 
                    EQUALS8_tree = (CommonTree)adaptor.dupNode(EQUALS8);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:20: ( ^( PLUS wort wort ) )
                    // Z:\\win7\\CI\\CI4\\transformWalker.g:11:21: ^( PLUS wort wort )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS9=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_aufgabe66); 
                    PLUS9_tree = (CommonTree)adaptor.dupNode(PLUS9);


                    root_2 = (CommonTree)adaptor.becomeRoot(PLUS9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe68);
                    wort10=wort();

                    state._fsp--;

                    adaptor.addChild(root_2, wort10.getTree());


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
                    // Z:\\win7\\CI\\CI4\\transformWalker.g:12:4: ^( EQUALS ^( MINUS w1= wort w2= wort ) w3= wort )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS13=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_aufgabe81);  
                    stream_EQUALS.add(EQUALS13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aufgabe84);  
                    stream_MINUS.add(MINUS14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe88);
                    w1=wort();

                    state._fsp--;

                    stream_wort.add(w1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe92);
                    w2=wort();

                    state._fsp--;

                    stream_wort.add(w2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


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
                    // elements: EQUALS, w1, w3, w2
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
                        // Z:\\win7\\CI\\CI4\\transformWalker.g:12:50: ^( EQUALS ^( PLUS[null, \"+\"] $w3 $w2) $w1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        // Z:\\win7\\CI\\CI4\\transformWalker.g:12:59: ^( PLUS[null, \"+\"] $w3 $w2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, null, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_w3.nextTree());

                        adaptor.addChild(root_2, stream_w2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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

        try {
            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:7: ( ^( WORT ( LETTER )+ ) )
            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:9: ^( WORT ( LETTER )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORT15=(CommonTree)match(input,WORT,FOLLOW_WORT_in_wort129); 
            WORT15_tree = (CommonTree)adaptor.dupNode(WORT15);


            root_1 = (CommonTree)adaptor.becomeRoot(WORT15_tree, root_1);


            match(input, Token.DOWN, null); 
            // Z:\\win7\\CI\\CI4\\transformWalker.g:15:16: ( LETTER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LETTER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Z:\\win7\\CI\\CI4\\transformWalker.g:15:16: LETTER
            	    {
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
                        throw eee;
                }
                cnt2++;
            } while (true);


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