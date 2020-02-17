package com.freddy.mathematical.expressions;

/**
 * Expression evaluator of mathematical DIV operation
 * 
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public class DivExpression extends Expression {

	public DivExpression(Expression leftExp, Expression rightExp) {
		super(leftExp, rightExp);
	}

	@Override
	public double evaluate() {
		return leftExp.evaluate() / rightExp.evaluate();
	}
}