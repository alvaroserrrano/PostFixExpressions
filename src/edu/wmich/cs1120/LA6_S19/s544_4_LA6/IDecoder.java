package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public interface IDecoder {
	/**
	 * A setter for the postfix (arithmetic) expression
	 * @param expressions	An arrayList of expressions.
	 */
	void setPostfixExpressions(ArrayList<IPostfixExpression> expressions);
	
	/**
	 * This method reads the expression from the input file, stores
	 * it in a String, creates a Postfix object, sets the
	 * expression attribute for the Postfix object, and adds the expression
	 * to the ArrayList.
	 * 
	 * @param fileName	The name of the input file (a random access file).
	 * @throws IOException
	 */
	void processExpressions(String fileName) throws IOException;
	
	/**
	 * This iterates through the ArrayList and prints out the result
	 * of the expression(s) (which is returned by the calculateResult method).
	 */
	void printResults();
}
