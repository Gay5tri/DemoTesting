package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a=20;
		int b=30;
		int expres=50;
		
		int actres=Calculator.add(a,b);
		
		assertEquals(expres,actres);
	}
	
	@Test
	public void testSubstract() {
        int expres=20;
		int actres=Calculator.substract(50,30);
		assertEquals(expres,actres);
	}
	
	@Test
	public void testMultiply() {
        int expres=1500;
		int actres=Calculator.multiply(50,30);
		assertEquals(expres,actres);
	}

	@Test
	public void testDivide() {
        int expres=1;
		int actres=Calculator.divide(50,30);
		assertEquals(expres,actres);
	}
}
