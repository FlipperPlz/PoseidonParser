// Generated from C:/Users/dev/Desktop/Projects/Java/PoseidonParser/src/main/antlr\Poseidon.g4 by ANTLR 4.9.2
package com.flipper.poseidonparser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PoseidonVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PoseidonBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PoseidonVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPoseidonConfig(PoseidonParser.PoseidonConfigContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassDefinitions(PoseidonParser.ClassDefinitionsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassBlock(PoseidonParser.ClassBlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDeclaration(PoseidonParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }
}