package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;

public class Decoder implements IDecoder {

	private ArrayList<IPostfixExpression> expressionList = new ArrayList<IPostfixExpression>(); 
	/**
	 * Default constructor
	 */
	public Decoder() {
		
	}

	/**
	 * A setter for the postfix (arithmetic) expression
	 * @param expressions	An arrayList of expressions.
	 */
	@Override
	public void setPostfixExpressions(ArrayList<IPostfixExpression> expressions) {
		expressionList = expressions;

	}

	/**
	 * This method reads the expression from the input file, stores
	 * it in a String, creates a Postfix object, sets the
	 * expression attribute for the Postfix object, and adds the expression
	 * to the ArrayList.
	 * 
	 * 2 expressions in each file
	 * Expressions made of chars at random locations
	 * First 2 bytes => first char of expression
	 * Following 4 bytes => location index of the next char
	 * -1 => end of current expression
	 * Byte following -1=> beginning of the next expression
	 * -1000 => End of the last expression
	 * 
	 * 
	 * @param fileName	The name of the input file (a random access file).
	 * @throws IOException
	 */
	@Override
	public void processExpressions(String fileName) throws IOException {
		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		int position = 0;
		boolean countExpression = true;

		file.close();
	}
	
	/**
	 * This iterates through the ArrayList and prints out the result
	 * of the expression(s) (which is returned by the calculateResult method).
	 */
	@Override
	public void printResults() {
		// TODO Auto-generated method stub

	}

}
