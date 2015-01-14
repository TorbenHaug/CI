import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("Z:\\win7\\CI\\BuchstabenLoesung\\raetsel1.txt", "UTF8");
        
        buchstabenGrammarLexer lexer = new buchstabenGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
        buchstabenGrammarParser.start_return ret = parser.start();
        CommonTree treeBeforeNormalization = (CommonTree)ret.getTree();
        
        System.out.println("\n ************* \n Baum nach dem Parsen\n ************* \n ");
        System.out.println(treeBeforeNormalization.toStringTree());
        
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(treeBeforeNormalization);
        transformWalker walker = new transformWalker(nodes);
        CommonTree treeAfterNormalization=(CommonTree) walker.prog().getTree();
        System.out.println("\n ************* \n Baum nach der Normalisierung \n ************* \n");
        System.out.println(treeAfterNormalization.toStringTree());        
    }
}
