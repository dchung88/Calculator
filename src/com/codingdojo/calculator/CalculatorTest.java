package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Calculator c = new Calculator();
		calculator.setOperandOne(10.5);
		calculator.setOperandTwo(3.2);
		calculator.setOperation("+");
		calculator.performOperation();
		calculator.getResults();
		
		calculator.setOperandOne(11.7);
		calculator.setOperandTwo(5.3);
		calculator.setOperation("-");
		calculator.performOperation();
		calculator.getResults();
		
		c.setOperandOne(10.5);
		c.setOperandTwo(3.2);
		c.setOperation("%");
		c.performOperation();
		c.getResults();

	}

}
