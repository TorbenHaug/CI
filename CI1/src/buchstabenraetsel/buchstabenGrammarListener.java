// Generated from C:\Users\ClausTorben\OneDrive\Dokumente\Studium\Praktikum\CI\CI1\src\buchstabenraetsel\buchstabenGrammar.g4 by ANTLR 4.4
package buchstabenraetsel;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link buchstabenGrammarParser}.
 */
public interface buchstabenGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link buchstabenGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull buchstabenGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link buchstabenGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull buchstabenGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link buchstabenGrammarParser#line3}.
	 * @param ctx the parse tree
	 */
	void enterLine3(@NotNull buchstabenGrammarParser.Line3Context ctx);
	/**
	 * Exit a parse tree produced by {@link buchstabenGrammarParser#line3}.
	 * @param ctx the parse tree
	 */
	void exitLine3(@NotNull buchstabenGrammarParser.Line3Context ctx);
	/**
	 * Enter a parse tree produced by {@link buchstabenGrammarParser#line2}.
	 * @param ctx the parse tree
	 */
	void enterLine2(@NotNull buchstabenGrammarParser.Line2Context ctx);
	/**
	 * Exit a parse tree produced by {@link buchstabenGrammarParser#line2}.
	 * @param ctx the parse tree
	 */
	void exitLine2(@NotNull buchstabenGrammarParser.Line2Context ctx);
	/**
	 * Enter a parse tree produced by {@link buchstabenGrammarParser#line1}.
	 * @param ctx the parse tree
	 */
	void enterLine1(@NotNull buchstabenGrammarParser.Line1Context ctx);
	/**
	 * Exit a parse tree produced by {@link buchstabenGrammarParser#line1}.
	 * @param ctx the parse tree
	 */
	void exitLine1(@NotNull buchstabenGrammarParser.Line1Context ctx);
}