// $ANTLR 3.4 Z:\\win7\\CI\\CI4\\buchstabenGrammar.g 2015-01-14 17:50:58

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "eqline", "start", "operator", "zahl"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
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
    public String getGrammarFileName() { return "Z:\\win7\\CI\\CI4\\buchstabenGrammar.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:14:1: start : z11= zahl op11= operator z12= zahl EQUALS z13= zahl NEWLINE opl1= operator opl2= operator opl3= operator NEWLINE z21= zahl op21= operator z22= zahl EQUALS z23= zahl NEWLINE eqline z31= zahl op31= operator z32= zahl EQUALS z33= zahl ( NEWLINE )? -> ^( RAETSEL ^( EQUALS[\"=\"] ^( $op11 $z11 $z12) $z13) ^( EQUALS[\"=\"] ^( $op21 $z21 $z22) $z23) ^( EQUALS[\"=\"] ^( $op31 $z31 $z32) $z33) ^( EQUALS[\"=\"] ^( $opl1 $z11 $z21) $z31) ^( EQUALS[\"=\"] ^( $opl2 $z12 $z22) $z32) ^( EQUALS[\"=\"] ^( $opl3 $z13 $z23) $z33) ) ;
    public final buchstabenGrammarParser.start_return start() throws RecognitionException {
        buchstabenGrammarParser.start_return retval = new buchstabenGrammarParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUALS1=null;
        Token NEWLINE2=null;
        Token NEWLINE3=null;
        Token EQUALS4=null;
        Token NEWLINE5=null;
        Token EQUALS7=null;
        Token NEWLINE8=null;
        buchstabenGrammarParser.zahl_return z11 =null;

        buchstabenGrammarParser.operator_return op11 =null;

        buchstabenGrammarParser.zahl_return z12 =null;

        buchstabenGrammarParser.zahl_return z13 =null;

        buchstabenGrammarParser.operator_return opl1 =null;

        buchstabenGrammarParser.operator_return opl2 =null;

        buchstabenGrammarParser.operator_return opl3 =null;

        buchstabenGrammarParser.zahl_return z21 =null;

        buchstabenGrammarParser.operator_return op21 =null;

        buchstabenGrammarParser.zahl_return z22 =null;

        buchstabenGrammarParser.zahl_return z23 =null;

        buchstabenGrammarParser.zahl_return z31 =null;

        buchstabenGrammarParser.operator_return op31 =null;

        buchstabenGrammarParser.zahl_return z32 =null;

        buchstabenGrammarParser.zahl_return z33 =null;

        buchstabenGrammarParser.eqline_return eqline6 =null;


        CommonTree EQUALS1_tree=null;
        CommonTree NEWLINE2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree EQUALS4_tree=null;
        CommonTree NEWLINE5_tree=null;
        CommonTree EQUALS7_tree=null;
        CommonTree NEWLINE8_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_zahl=new RewriteRuleSubtreeStream(adaptor,"rule zahl");
        RewriteRuleSubtreeStream stream_eqline=new RewriteRuleSubtreeStream(adaptor,"rule eqline");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:14:8: (z11= zahl op11= operator z12= zahl EQUALS z13= zahl NEWLINE opl1= operator opl2= operator opl3= operator NEWLINE z21= zahl op21= operator z22= zahl EQUALS z23= zahl NEWLINE eqline z31= zahl op31= operator z32= zahl EQUALS z33= zahl ( NEWLINE )? -> ^( RAETSEL ^( EQUALS[\"=\"] ^( $op11 $z11 $z12) $z13) ^( EQUALS[\"=\"] ^( $op21 $z21 $z22) $z23) ^( EQUALS[\"=\"] ^( $op31 $z31 $z32) $z33) ^( EQUALS[\"=\"] ^( $opl1 $z11 $z21) $z31) ^( EQUALS[\"=\"] ^( $opl2 $z12 $z22) $z32) ^( EQUALS[\"=\"] ^( $opl3 $z13 $z23) $z33) ) )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:14:10: z11= zahl op11= operator z12= zahl EQUALS z13= zahl NEWLINE opl1= operator opl2= operator opl3= operator NEWLINE z21= zahl op21= operator z22= zahl EQUALS z23= zahl NEWLINE eqline z31= zahl op31= operator z32= zahl EQUALS z33= zahl ( NEWLINE )?
            {
            dbg.location(14,13);
            pushFollow(FOLLOW_zahl_in_start47);
            z11=zahl();

            state._fsp--;

            stream_zahl.add(z11.getTree());
            dbg.location(14,23);
            pushFollow(FOLLOW_operator_in_start51);
            op11=operator();

            state._fsp--;

            stream_operator.add(op11.getTree());
            dbg.location(14,36);
            pushFollow(FOLLOW_zahl_in_start55);
            z12=zahl();

            state._fsp--;

            stream_zahl.add(z12.getTree());
            dbg.location(14,42);
            EQUALS1=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start57);  
            stream_EQUALS.add(EQUALS1);

            dbg.location(14,52);
            pushFollow(FOLLOW_zahl_in_start61);
            z13=zahl();

            state._fsp--;

            stream_zahl.add(z13.getTree());
            dbg.location(14,58);
            NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start63);  
            stream_NEWLINE.add(NEWLINE2);

            dbg.location(15,7);
            pushFollow(FOLLOW_operator_in_start70);
            opl1=operator();

            state._fsp--;

            stream_operator.add(opl1.getTree());
            dbg.location(15,21);
            pushFollow(FOLLOW_operator_in_start74);
            opl2=operator();

            state._fsp--;

            stream_operator.add(opl2.getTree());
            dbg.location(15,35);
            pushFollow(FOLLOW_operator_in_start78);
            opl3=operator();

            state._fsp--;

            stream_operator.add(opl3.getTree());
            dbg.location(15,45);
            NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start80);  
            stream_NEWLINE.add(NEWLINE3);

            dbg.location(16,6);
            pushFollow(FOLLOW_zahl_in_start86);
            z21=zahl();

            state._fsp--;

            stream_zahl.add(z21.getTree());
            dbg.location(16,16);
            pushFollow(FOLLOW_operator_in_start90);
            op21=operator();

            state._fsp--;

            stream_operator.add(op21.getTree());
            dbg.location(16,29);
            pushFollow(FOLLOW_zahl_in_start94);
            z22=zahl();

            state._fsp--;

            stream_zahl.add(z22.getTree());
            dbg.location(16,35);
            EQUALS4=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start96);  
            stream_EQUALS.add(EQUALS4);

            dbg.location(16,45);
            pushFollow(FOLLOW_zahl_in_start100);
            z23=zahl();

            state._fsp--;

            stream_zahl.add(z23.getTree());
            dbg.location(16,51);
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start102);  
            stream_NEWLINE.add(NEWLINE5);

            dbg.location(17,3);
            pushFollow(FOLLOW_eqline_in_start106);
            eqline6=eqline();

            state._fsp--;

            stream_eqline.add(eqline6.getTree());
            dbg.location(18,6);
            pushFollow(FOLLOW_zahl_in_start112);
            z31=zahl();

            state._fsp--;

            stream_zahl.add(z31.getTree());
            dbg.location(18,16);
            pushFollow(FOLLOW_operator_in_start116);
            op31=operator();

            state._fsp--;

            stream_operator.add(op31.getTree());
            dbg.location(18,29);
            pushFollow(FOLLOW_zahl_in_start120);
            z32=zahl();

            state._fsp--;

            stream_zahl.add(z32.getTree());
            dbg.location(18,35);
            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start122);  
            stream_EQUALS.add(EQUALS7);

            dbg.location(18,45);
            pushFollow(FOLLOW_zahl_in_start126);
            z33=zahl();

            state._fsp--;

            stream_zahl.add(z33.getTree());
            dbg.location(18,51);
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:18:51: ( NEWLINE )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==NEWLINE) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:18:51: NEWLINE
                    {
                    dbg.location(18,51);
                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start128);  
                    stream_NEWLINE.add(NEWLINE8);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: z33, op11, EQUALS, z12, z22, z11, EQUALS, z23, z31, z12, z21, EQUALS, EQUALS, z21, z31, opl3, z13, z32, op21, op31, z32, z13, opl2, z23, z33, z11, opl1, EQUALS, EQUALS, z22
            // token labels: 
            // rule labels: op31, retval, opl1, opl2, op21, op11, z21, z32, z31, z12, z23, z33, z22, z11, opl3, z13
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_op31=new RewriteRuleSubtreeStream(adaptor,"rule op31",op31!=null?op31.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_opl1=new RewriteRuleSubtreeStream(adaptor,"rule opl1",opl1!=null?opl1.tree:null);
            RewriteRuleSubtreeStream stream_opl2=new RewriteRuleSubtreeStream(adaptor,"rule opl2",opl2!=null?opl2.tree:null);
            RewriteRuleSubtreeStream stream_op21=new RewriteRuleSubtreeStream(adaptor,"rule op21",op21!=null?op21.tree:null);
            RewriteRuleSubtreeStream stream_op11=new RewriteRuleSubtreeStream(adaptor,"rule op11",op11!=null?op11.tree:null);
            RewriteRuleSubtreeStream stream_z21=new RewriteRuleSubtreeStream(adaptor,"rule z21",z21!=null?z21.tree:null);
            RewriteRuleSubtreeStream stream_z32=new RewriteRuleSubtreeStream(adaptor,"rule z32",z32!=null?z32.tree:null);
            RewriteRuleSubtreeStream stream_z31=new RewriteRuleSubtreeStream(adaptor,"rule z31",z31!=null?z31.tree:null);
            RewriteRuleSubtreeStream stream_z12=new RewriteRuleSubtreeStream(adaptor,"rule z12",z12!=null?z12.tree:null);
            RewriteRuleSubtreeStream stream_z23=new RewriteRuleSubtreeStream(adaptor,"rule z23",z23!=null?z23.tree:null);
            RewriteRuleSubtreeStream stream_z33=new RewriteRuleSubtreeStream(adaptor,"rule z33",z33!=null?z33.tree:null);
            RewriteRuleSubtreeStream stream_z22=new RewriteRuleSubtreeStream(adaptor,"rule z22",z22!=null?z22.tree:null);
            RewriteRuleSubtreeStream stream_z11=new RewriteRuleSubtreeStream(adaptor,"rule z11",z11!=null?z11.tree:null);
            RewriteRuleSubtreeStream stream_opl3=new RewriteRuleSubtreeStream(adaptor,"rule opl3",opl3!=null?opl3.tree:null);
            RewriteRuleSubtreeStream stream_z13=new RewriteRuleSubtreeStream(adaptor,"rule z13",z13!=null?z13.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:3: -> ^( RAETSEL ^( EQUALS[\"=\"] ^( $op11 $z11 $z12) $z13) ^( EQUALS[\"=\"] ^( $op21 $z21 $z22) $z23) ^( EQUALS[\"=\"] ^( $op31 $z31 $z32) $z33) ^( EQUALS[\"=\"] ^( $opl1 $z11 $z21) $z31) ^( EQUALS[\"=\"] ^( $opl2 $z12 $z22) $z32) ^( EQUALS[\"=\"] ^( $opl3 $z13 $z23) $z33) )
            {
                dbg.location(20,6);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:20:6: ^( RAETSEL ^( EQUALS[\"=\"] ^( $op11 $z11 $z12) $z13) ^( EQUALS[\"=\"] ^( $op21 $z21 $z22) $z23) ^( EQUALS[\"=\"] ^( $op31 $z31 $z32) $z33) ^( EQUALS[\"=\"] ^( $opl1 $z11 $z21) $z31) ^( EQUALS[\"=\"] ^( $opl2 $z12 $z22) $z32) ^( EQUALS[\"=\"] ^( $opl3 $z13 $z23) $z33) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(20,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RAETSEL, "RAETSEL")
                , root_1);

                dbg.location(20,16);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:20:16: ^( EQUALS[\"=\"] ^( $op11 $z11 $z12) $z13)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(20,18);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(20,30);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:20:30: ^( $op11 $z11 $z12)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(20,33);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op11.nextNode(), root_3);

                dbg.location(20,39);
                adaptor.addChild(root_3, stream_z11.nextTree());
                dbg.location(20,44);
                adaptor.addChild(root_3, stream_z12.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(20,50);
                adaptor.addChild(root_2, stream_z13.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,3);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:21:3: ^( EQUALS[\"=\"] ^( $op21 $z21 $z22) $z23)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(21,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(21,17);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:21:17: ^( $op21 $z21 $z22)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(21,20);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op21.nextNode(), root_3);

                dbg.location(21,26);
                adaptor.addChild(root_3, stream_z21.nextTree());
                dbg.location(21,31);
                adaptor.addChild(root_3, stream_z22.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(21,37);
                adaptor.addChild(root_2, stream_z23.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(22,3);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:22:3: ^( EQUALS[\"=\"] ^( $op31 $z31 $z32) $z33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(22,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(22,17);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:22:17: ^( $op31 $z31 $z32)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(22,20);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op31.nextNode(), root_3);

                dbg.location(22,26);
                adaptor.addChild(root_3, stream_z31.nextTree());
                dbg.location(22,31);
                adaptor.addChild(root_3, stream_z32.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(22,37);
                adaptor.addChild(root_2, stream_z33.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(23,3);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:23:3: ^( EQUALS[\"=\"] ^( $opl1 $z11 $z21) $z31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(23,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(23,17);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:23:17: ^( $opl1 $z11 $z21)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(23,20);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_opl1.nextNode(), root_3);

                dbg.location(23,26);
                adaptor.addChild(root_3, stream_z11.nextTree());
                dbg.location(23,31);
                adaptor.addChild(root_3, stream_z21.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(23,37);
                adaptor.addChild(root_2, stream_z31.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(24,3);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:24:3: ^( EQUALS[\"=\"] ^( $opl2 $z12 $z22) $z32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(24,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(24,17);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:24:17: ^( $opl2 $z12 $z22)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(24,20);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_opl2.nextNode(), root_3);

                dbg.location(24,26);
                adaptor.addChild(root_3, stream_z12.nextTree());
                dbg.location(24,31);
                adaptor.addChild(root_3, stream_z22.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(24,37);
                adaptor.addChild(root_2, stream_z32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(25,3);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:25:3: ^( EQUALS[\"=\"] ^( $opl3 $z13 $z23) $z33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(25,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUALS, "=")
                , root_2);

                dbg.location(25,17);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:25:17: ^( $opl3 $z13 $z23)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(25,20);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_opl3.nextNode(), root_3);

                dbg.location(25,26);
                adaptor.addChild(root_3, stream_z13.nextTree());
                dbg.location(25,31);
                adaptor.addChild(root_3, stream_z23.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(25,37);
                adaptor.addChild(root_2, stream_z33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
        dbg.location(25, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class eqline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eqline"
    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:27:1: eqline : EQUALS EQUALS EQUALS NEWLINE ;
    public final buchstabenGrammarParser.eqline_return eqline() throws RecognitionException {
        buchstabenGrammarParser.eqline_return retval = new buchstabenGrammarParser.eqline_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUALS9=null;
        Token EQUALS10=null;
        Token EQUALS11=null;
        Token NEWLINE12=null;

        CommonTree EQUALS9_tree=null;
        CommonTree EQUALS10_tree=null;
        CommonTree EQUALS11_tree=null;
        CommonTree NEWLINE12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "eqline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:27:9: ( EQUALS EQUALS EQUALS NEWLINE )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:27:11: EQUALS EQUALS EQUALS NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,11);
            EQUALS9=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_eqline280); 
            EQUALS9_tree = 
            (CommonTree)adaptor.create(EQUALS9)
            ;
            adaptor.addChild(root_0, EQUALS9_tree);

            dbg.location(27,18);
            EQUALS10=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_eqline282); 
            EQUALS10_tree = 
            (CommonTree)adaptor.create(EQUALS10)
            ;
            adaptor.addChild(root_0, EQUALS10_tree);

            dbg.location(27,25);
            EQUALS11=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_eqline284); 
            EQUALS11_tree = 
            (CommonTree)adaptor.create(EQUALS11)
            ;
            adaptor.addChild(root_0, EQUALS11_tree);

            dbg.location(27,32);
            NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eqline286); 
            NEWLINE12_tree = 
            (CommonTree)adaptor.create(NEWLINE12)
            ;
            adaptor.addChild(root_0, NEWLINE12_tree);


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
        dbg.location(27, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eqline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eqline"


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:29:1: operator : ( PLUS | MINUS ) ;
    public final buchstabenGrammarParser.operator_return operator() throws RecognitionException {
        buchstabenGrammarParser.operator_return retval = new buchstabenGrammarParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:29:9: ( ( PLUS | MINUS ) )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,9);
            set13=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set13)
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
        dbg.location(29, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operator"


    public static class zahl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zahl"
    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:31:1: zahl : ( LETTER )+ -> ^( WORT ( LETTER )+ ) ;
    public final buchstabenGrammarParser.zahl_return zahl() throws RecognitionException {
        buchstabenGrammarParser.zahl_return retval = new buchstabenGrammarParser.zahl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER14=null;

        CommonTree LETTER14_tree=null;
        RewriteRuleTokenStream stream_LETTER=new RewriteRuleTokenStream(adaptor,"token LETTER");

        try { dbg.enterRule(getGrammarFileName(), "zahl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:31:7: ( ( LETTER )+ -> ^( WORT ( LETTER )+ ) )
            dbg.enterAlt(1);

            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:31:10: ( LETTER )+
            {
            dbg.location(31,10);
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:31:10: ( LETTER )+
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

            	    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:31:10: LETTER
            	    {
            	    dbg.location(31,10);
            	    LETTER14=(Token)match(input,LETTER,FOLLOW_LETTER_in_zahl307);  
            	    stream_LETTER.add(LETTER14);


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


            // AST REWRITE
            // elements: LETTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:19: -> ^( WORT ( LETTER )+ )
            {
                dbg.location(32,4);
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:32:4: ^( WORT ( LETTER )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(32,6);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WORT, "WORT")
                , root_1);

                dbg.location(32,11);
                if ( !(stream_LETTER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LETTER.hasNext() ) {
                    dbg.location(32,11);
                    adaptor.addChild(root_1, 
                    stream_LETTER.nextNode()
                    );

                }
                stream_LETTER.reset();

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
        dbg.location(32, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zahl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "zahl"

    // Delegated rules


 

    public static final BitSet FOLLOW_zahl_in_start47 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start55 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start57 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start63 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start70 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start74 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start78 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start80 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start86 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start90 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_eqline_in_start106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start112 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_operator_in_start116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_zahl_in_start126 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NEWLINE_in_start128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_eqline280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_eqline282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_eqline284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_eqline286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_zahl307 = new BitSet(new long[]{0x0000000000000042L});

}