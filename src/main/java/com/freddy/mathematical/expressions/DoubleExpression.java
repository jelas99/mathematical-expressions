package com.freddy.mathematical.expressions;

/**
 * Expression evaluator of simple number. 
 * This is the terminal expression of our pattern
 * 
 * @author Joel Costa <frederico08@gmail.com>
 * @version 1
 *
 */
public class DoubleExpression extends Expression {

	private double value;

	public DoubleExpression(double value) {
		super(null, null);
		this.value = value;
	}

	@Override
	public double evaluate() {
		return value;
	}

	public static DoubleExpression parse(String number) {
		Double parsedNumber = Double.valueOf(number);
		return new DoubleExpression(parsedNumber);
	}
}