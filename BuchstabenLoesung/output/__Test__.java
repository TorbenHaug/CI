import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("Z:\\win7\\CI\\BuchstabenLoesung\\raetsel1.txt", "UTF8");
        buchstabenGrammarLexer lexer = new buchstabenGrammarLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
        buchstabenGrammarParser.start_return ret = parser.start();
        
        CommonTree tree = (CommonTree)ret.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        System.out.println(tree.toString());
        
        transformWalker walker = new transformWalker(nodes);
        walker.prog();

    }

}