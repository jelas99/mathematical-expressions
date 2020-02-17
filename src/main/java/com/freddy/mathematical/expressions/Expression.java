package com.freddy.mathematical.expressions;

/**
 * Abstract representation of our expression evaluator
 * 
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public abstract class Expression {

	protected Expression leftExp;
	protected Expression rightExp;

	public Expression(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public abstract double evaluate();
}
