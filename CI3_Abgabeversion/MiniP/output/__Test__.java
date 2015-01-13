import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        miniPLexer lex = new miniPLexer(new ANTLRFileStream("Z:\\win7\\Studium\\CI\\CI3\\MiniP\\testProgram1.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        miniPParser g = new miniPParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}