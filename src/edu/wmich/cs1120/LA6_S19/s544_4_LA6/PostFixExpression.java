package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public class PostFixExpression implements IPostfixExpression {

	//PRIVATE FIELDS
	private String expression = "";
	private IStack<Integer> stack = new Stack<Integer>();
	
	/**
	 * Calculates the result of the expression using a stack and returns
	 * the result.
	 * @return	The result.
	 */
	@Override
	public int calculateResult() {
		//Loop over expression and push every char to the stack
		//Create a temporary array
		String temp[] = new String[expression.length()];
		temp = expression.split(",");
		String tempString = "";
		for (int i = 0; i < temp.length; i++) {
			//Push onto the stack
			//Trim spaces
			tempString = temp[i];
			int right = 0;
			int left = 0;
			switch(tempString) {
			
			default:
				stack.push(Integer.parseInt(tempString));
				break;
			}//switch
		}//for
		return 0;
	}

	/**
	 * Getter for the arithmetic expression (expressed as a string).
	 * @return	The postfix expression
	 */
	@Override
	public String getPostfixExpression() {
		return expression;
	}

	/**
	 * Setter for the arithmetic expression (expressed as a string)
	 * @param expression	A new postfix expression
	 */
	@Override
	public void setPostfixExpression(String expression) {
		this.expression = expression;
	}

	/**
	 * Setter for the stack attribute. 
	 * @param stack		The stack for this expression
	 */
	@Override
	public void setStack(IStack<Integer> stack) {
		this.stack = stack;
	}

}
