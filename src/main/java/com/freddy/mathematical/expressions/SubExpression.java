package com.freddy.mathematical.expressions;

/**
 * Expression evaluator of mathematical SUB operation
 * 
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public class SubExpression extends Expression {

	public SubExpression(Expression leftExp, Expression rightExp) {
		super(leftExp, rightExp);
	}

	@Override
	public double evaluate() {
		return leftExp.evaluate() - rightExp.evaluate();
	}
}