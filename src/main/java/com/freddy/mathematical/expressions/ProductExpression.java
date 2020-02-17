package com.freddy.mathematical.expressions;

/**
 * Expression evaluator of mathematical PRODUCT operation
 * 
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public class ProductExpression extends Expression{

	public ProductExpression(Expression leftExp, Expression rightExp) {
		super(leftExp, rightExp);
	}

	@Override
	public double evaluate() {
		return leftExp.evaluate() * rightExp.evaluate();
	}
}
