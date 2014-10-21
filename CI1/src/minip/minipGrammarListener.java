// Generated from C:\Users\ClausTorben\OneDrive\Dokumente\Studium\Praktikum\CI\CI1\src\minip\minipGrammar.g4 by ANTLR 4.4
package minip;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minipGrammarParser}.
 */
public interface minipGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#arithausdr}.
	 * @param ctx the parse tree
	 */
	void enterArithausdr(@NotNull minipGrammarParser.ArithausdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#arithausdr}.
	 * @param ctx the parse tree
	 */
	void exitArithausdr(@NotNull minipGrammarParser.ArithausdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(@NotNull minipGrammarParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(@NotNull minipGrammarParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull minipGrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull minipGrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void enterAnweisung(@NotNull minipGrammarParser.AnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void exitAnweisung(@NotNull minipGrammarParser.AnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(@NotNull minipGrammarParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(@NotNull minipGrammarParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull minipGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull minipGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull minipGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull minipGrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull minipGrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull minipGrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull minipGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull minipGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#zuweisungvalue}.
	 * @param ctx the parse tree
	 */
	void enterZuweisungvalue(@NotNull minipGrammarParser.ZuweisungvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#zuweisungvalue}.
	 * @param ctx the parse tree
	 */
	void exitZuweisungvalue(@NotNull minipGrammarParser.ZuweisungvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(@NotNull minipGrammarParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(@NotNull minipGrammarParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull minipGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull minipGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull minipGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull minipGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull minipGrammarParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull minipGrammarParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#programmcode}.
	 * @param ctx the parse tree
	 */
	void enterProgrammcode(@NotNull minipGrammarParser.ProgrammcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#programmcode}.
	 * @param ctx the parse tree
	 */
	void exitProgrammcode(@NotNull minipGrammarParser.ProgrammcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void enterZuweisung(@NotNull minipGrammarParser.ZuweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void exitZuweisung(@NotNull minipGrammarParser.ZuweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#arithidentifiere}.
	 * @param ctx the parse tree
	 */
	void enterArithidentifiere(@NotNull minipGrammarParser.ArithidentifiereContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#arithidentifiere}.
	 * @param ctx the parse tree
	 */
	void exitArithidentifiere(@NotNull minipGrammarParser.ArithidentifiereContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#multiplikation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikation(@NotNull minipGrammarParser.MultiplikationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#multiplikation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikation(@NotNull minipGrammarParser.MultiplikationContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#vergleich}.
	 * @param ctx the parse tree
	 */
	void enterVergleich(@NotNull minipGrammarParser.VergleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#vergleich}.
	 * @param ctx the parse tree
	 */
	void exitVergleich(@NotNull minipGrammarParser.VergleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#schleife}.
	 * @param ctx the parse tree
	 */
	void enterSchleife(@NotNull minipGrammarParser.SchleifeContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#schleife}.
	 * @param ctx the parse tree
	 */
	void exitSchleife(@NotNull minipGrammarParser.SchleifeContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull minipGrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull minipGrammarParser.AdditionContext ctx);
}