// Generated from C:/Users/dev/Desktop/Projects/Java/PoseidonParser/src/main/antlr\Poseidon.g4 by ANTLR 4.9.2
package com.flipper.poseidonparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PoseidonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PoseidonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PoseidonParser#poseidonConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoseidonConfig(PoseidonParser.PoseidonConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PoseidonParser#classDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinitions(PoseidonParser.ClassDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PoseidonParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(PoseidonParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PoseidonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PoseidonParser.VariableDeclarationContext ctx);
}