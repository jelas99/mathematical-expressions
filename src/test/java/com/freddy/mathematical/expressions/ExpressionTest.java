package com.freddy.mathematical.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExpressionTest {

	@Test
	@DisplayName("Calculation of '3+3-2*2/2' with interpreter pattern")
	void do_calculation_of_mathematical_expression() {
		//example 3+3-2*2/2
		Expression sum = new SumExpression(new DoubleExpression(3d),new DoubleExpression(3d));
		Expression product = new ProductExpression(new DoubleExpression(2d),new DoubleExpression(2d));
		Expression div = new DivExpression(product,new DoubleExpression(2d));
		Expression sub = new SubExpression(sum,div);

		assertEquals(4d, sub.evaluate());
	}
}
