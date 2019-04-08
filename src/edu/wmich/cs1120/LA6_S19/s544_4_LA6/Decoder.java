package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;

public class Decoder implements IDecoder {
	RandomAccessFile file;
	ArrayList<IPostfixExpression> expressionList;
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
	 * @param fileName	The name of the input file (a random access file).
	 * @throws IOException
	 */
	@Override
	public void processExpressions(String fileName) throws IOException {
		file = new RandomAccessFile(fileName,"r");
		boolean done = false;
		while(!done) {
			file.seek(0);
			file.readChar();
		}

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
