package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		if(operation == "+" || operation == "-") {
			this.operation = operation;
		}
		else {
			System.out.println("Invalid operation entered. Please choose a valid operation.");
		}
	}
	
	public Calculator() {
	}
	
	public void performOperation() {
		if(getOperation() == "+") {
			this.result = getOperandOne() + getOperandTwo();
		} 
		else if(getOperation() == "-") {
			this.result = getOperandOne() - getOperandTwo();
		} 
		else {
			System.out.println("An invalid operation has been entered!");
		}
	}
	public void getResults() {
		System.out.println("Result: " + this.result);
	}
	
}
