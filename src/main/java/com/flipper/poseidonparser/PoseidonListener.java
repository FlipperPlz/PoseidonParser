// Generated from C:/Users/dev/Desktop/Projects/Java/PoseidonParser/src/main/antlr\Poseidon.g4 by ANTLR 4.9.2
package com.flipper.poseidonparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PoseidonParser}.
 */
public interface PoseidonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PoseidonParser#poseidonConfig}.
	 * @param ctx the parse tree
	 */
	void enterPoseidonConfig(PoseidonParser.PoseidonConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoseidonParser#poseidonConfig}.
	 * @param ctx the parse tree
	 */
	void exitPoseidonConfig(PoseidonParser.PoseidonConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoseidonParser#classDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinitions(PoseidonParser.ClassDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoseidonParser#classDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinitions(PoseidonParser.ClassDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoseidonParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(PoseidonParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoseidonParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(PoseidonParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoseidonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PoseidonParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoseidonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PoseidonParser.VariableDeclarationContext ctx);
}