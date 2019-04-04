package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public interface IPostFixExpression {
	/**
	 * Calculates the result of the expression using a stack and returns
	 * the result.
	 * @return	The result.
	 */
	int calculateResult();
	
	/**
	 * Getter for the arithmetic expression (expressed as a string).
	 * @return	The postfix expression
	 */
	String getPostfixExpression();
	
	/**
	 * Setter for the arithmetic expression (expressed as a string)
	 * @param expression	A new postfix expression
	 */
	void setPostfixExpression(String expression);
	
	/**
	 * Setter for the stack attribute. 
	 * @param stack		The stack for this expression
	 */
	void setStack(IStack<Integer> stack);
}
