import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;


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
        
        CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(treeAfterNormalization);
        nodes2.setTokenStream(tokens);
        emitter emitter = new emitter(nodes2);
        InputStream templateIs =new FileInputStream("../template.stg");
        StringTemplateGroup templates = new StringTemplateGroup(
        new InputStreamReader(templateIs, "ISO-8859-15"),
        AngleBracketTemplateLexer.class);
        emitter.setTemplateLib(templates);
        emitter.prog_return puzzle_return = emitter.prog();
        String output = puzzle_return.getTemplate().toString();
        System.out.println("\n ************* \n Puzzle als Choco code \n ************* \n");
        System.out.println(output); 
    }
}
