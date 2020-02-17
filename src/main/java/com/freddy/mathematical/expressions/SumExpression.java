package com.freddy.mathematical.expressions;

/**
 * Expression evaluator of mathematical SUM operation
 *   
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public class SumExpression extends Expression {

	public SumExpression(Expression leftExp, Expression rightExp) {
		super(leftExp, rightExp);
	}

	@Override
	public double evaluate() {
		return leftExp.evaluate() + rightExp.evaluate();
	}
}