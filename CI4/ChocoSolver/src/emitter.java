// $ANTLR 3.4 Z:\\win7\\CI\\CI4\\emitter.g 2015-01-14 19:42:44

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.lang.Character;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class emitter extends TreeParser {
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


    public emitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public emitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("emitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return emitter.tokenNames; }
    public String getGrammarFileName() { return "Z:\\win7\\CI\\CI4\\emitter.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        public Set<String> letters;
        public Set<String> constraints;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // Z:\\win7\\CI\\CI4\\emitter.g:15:1: prog returns [Set<String> letters, Set<String> constraints] : ^( RAETSEL a1= aufgabe a2= aufgabe a3= aufgabe a4= aufgabe a5= aufgabe a6= aufgabe ) -> sums(constrains=$constraintsletters=$letters);
    public final emitter.prog_return prog() throws RecognitionException {
        emitter.prog_return retval = new emitter.prog_return();
        retval.start = input.LT(1);


        emitter.aufgabe_return a1 =null;

        emitter.aufgabe_return a2 =null;

        emitter.aufgabe_return a3 =null;

        emitter.aufgabe_return a4 =null;

        emitter.aufgabe_return a5 =null;

        emitter.aufgabe_return a6 =null;


        try {
            // Z:\\win7\\CI\\CI4\\emitter.g:16:2: ( ^( RAETSEL a1= aufgabe a2= aufgabe a3= aufgabe a4= aufgabe a5= aufgabe a6= aufgabe ) -> sums(constrains=$constraintsletters=$letters))
            // Z:\\win7\\CI\\CI4\\emitter.g:16:4: ^( RAETSEL a1= aufgabe a2= aufgabe a3= aufgabe a4= aufgabe a5= aufgabe a6= aufgabe )
            {
            match(input,RAETSEL,FOLLOW_RAETSEL_in_prog55); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_aufgabe_in_prog59);
            a1=aufgabe();

            state._fsp--;


            pushFollow(FOLLOW_aufgabe_in_prog63);
            a2=aufgabe();

            state._fsp--;


            pushFollow(FOLLOW_aufgabe_in_prog67);
            a3=aufgabe();

            state._fsp--;


            pushFollow(FOLLOW_aufgabe_in_prog71);
            a4=aufgabe();

            state._fsp--;


            pushFollow(FOLLOW_aufgabe_in_prog75);
            a5=aufgabe();

            state._fsp--;


            pushFollow(FOLLOW_aufgabe_in_prog79);
            a6=aufgabe();

            state._fsp--;


            match(input, Token.UP, null); 



            	retval.letters = new HashSet<String>();
            	retval.constraints = new HashSet<String>();
            	
            	retval.letters.addAll((a1!=null?a1.signs:null));
            	retval.letters.addAll((a2!=null?a2.signs:null));
            	retval.letters.addAll((a3!=null?a3.signs:null));
            	retval.letters.addAll((a4!=null?a4.signs:null));
            	retval.letters.addAll((a5!=null?a5.signs:null));
            	retval.letters.addAll((a6!=null?a6.signs:null));
            	
            	retval.constraints.add((a1!=null?a1.st:null).toString());
            	retval.constraints.add((a2!=null?a2.st:null).toString());
            	retval.constraints.add((a3!=null?a3.st:null).toString());
            	retval.constraints.add((a4!=null?a4.st:null).toString());
            	retval.constraints.add((a5!=null?a5.st:null).toString());
            	retval.constraints.add((a6!=null?a6.st:null).toString());
            	

            // TEMPLATE REWRITE
            // 35:2: -> sums(constrains=$constraintsletters=$letters)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("constrains", retval.constraints).put("letters", retval.letters));
            }



            }

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
        public Set<String> signs;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "aufgabe"
    // Z:\\win7\\CI\\CI4\\emitter.g:37:1: aufgabe returns [Set<String> signs] : ^( EQUALS ( ^( PLUS w1= wort w2= wort ) ) w3= wort ) -> sum(sum1=w1.numbersum2=w2.numbererg=w3.number);
    public final emitter.aufgabe_return aufgabe() throws RecognitionException {
        emitter.aufgabe_return retval = new emitter.aufgabe_return();
        retval.start = input.LT(1);


        emitter.wort_return w1 =null;

        emitter.wort_return w2 =null;

        emitter.wort_return w3 =null;


        try {
            // Z:\\win7\\CI\\CI4\\emitter.g:44:2: ( ^( EQUALS ( ^( PLUS w1= wort w2= wort ) ) w3= wort ) -> sum(sum1=w1.numbersum2=w2.numbererg=w3.number))
            // Z:\\win7\\CI\\CI4\\emitter.g:44:4: ^( EQUALS ( ^( PLUS w1= wort w2= wort ) ) w3= wort )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_aufgabe117); 

            match(input, Token.DOWN, null); 
            // Z:\\win7\\CI\\CI4\\emitter.g:44:13: ( ^( PLUS w1= wort w2= wort ) )
            // Z:\\win7\\CI\\CI4\\emitter.g:44:14: ^( PLUS w1= wort w2= wort )
            {
            match(input,PLUS,FOLLOW_PLUS_in_aufgabe121); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_wort_in_aufgabe125);
            w1=wort();

            state._fsp--;


            pushFollow(FOLLOW_wort_in_aufgabe129);
            w2=wort();

            state._fsp--;


            match(input, Token.UP, null); 


            }


            pushFollow(FOLLOW_wort_in_aufgabe135);
            w3=wort();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 45:2: -> sum(sum1=w1.numbersum2=w2.numbererg=w3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("sum1", w1.number).put("sum2", w2.number).put("erg", w3.number));
            }



            }


            		retval.signs = new HashSet<String>();
            		retval.signs.addAll(w1.number.getCharacters());
            		retval.signs.addAll(w2.number.getCharacters());
            		retval.signs.addAll(w3.number.getCharacters());
            	
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
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "wort"
    // Z:\\win7\\CI\\CI4\\emitter.g:47:1: wort returns [Number number] : ^( WORT (letters+= LETTER )+ ) ;
    public final emitter.wort_return wort() throws RecognitionException {
        emitter.wort_return retval = new emitter.wort_return();
        retval.start = input.LT(1);


        CommonTree letters=null;
        List list_letters=null;

        try {
            // Z:\\win7\\CI\\CI4\\emitter.g:52:2: ( ^( WORT (letters+= LETTER )+ ) )
            // Z:\\win7\\CI\\CI4\\emitter.g:52:4: ^( WORT (letters+= LETTER )+ )
            {
            match(input,WORT,FOLLOW_WORT_in_wort175); 

            match(input, Token.DOWN, null); 
            // Z:\\win7\\CI\\CI4\\emitter.g:52:18: (letters+= LETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\win7\\CI\\CI4\\emitter.g:52:18: letters+= LETTER
            	    {
            	    letters=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_wort179); 
            	    if (list_letters==null) list_letters=new ArrayList();
            	    list_letters.add(letters);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            }


            		retval.number = new Number();
            		retval.number.setDigits(list_letters);
            	
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


 

    public static final BitSet FOLLOW_RAETSEL_in_prog55 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aufgabe_in_prog59 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog67 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_prog79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_aufgabe117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_aufgabe121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_aufgabe125 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_wort_in_aufgabe129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_aufgabe135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORT_in_wort175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_wort179 = new BitSet(new long[]{0x0000000000000048L});

}