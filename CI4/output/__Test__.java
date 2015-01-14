import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        buchstabenGrammarLexer lex = new buchstabenGrammarLexer(new ANTLRFileStream("Z:\\win7\\CI\\CI4\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
        buchstabenGrammarParser.prog_return r = parser.prog();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        transformWalker walker = new transformWalker(nodes);
        try {
            walker.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}