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
		boolean continueExpression = true;
		boolean continueFile = true;
		int counter = 0;
		//current char that we are reading
		char temp = ' ';
		String expression;
		//find first char
		file.seek(0);
		while(continueFile) {
			//1. create expression object
			expressionList.add(new PostFixExpression());
			//2. reset expression
			expression = "";
			//3. reset continueExpression
			continueExpression = true;
			while(continueExpression) {
				//read first char
				temp = file.readChar();
				//add char to expression
				expression += temp;
				//find out the integer that indicates the position of the next char
				position = file.readInt();
				//Make decision based on the integer we just read
				if(position == -1) {
					//exit loop for expression
					continueExpression = false;
				}else if(position <-1){
					//exit both loops
					continueExpression = false;
					continueFile = false;
				}else {
					file.seek(position);
				}
			}
			//Set postfixExpression based on expression
			expressionList.get(counter).setPostfixExpression(expression);
			//Move counter
			counter ++;
		}//while
		file.close();
	}
	
	/**
	 * This iterates through the ArrayList and prints out the result
	 * of the expression(s) (which is returned by the calculateResult method).
	 */
	@Override
	public void printResults() {
		System.out.println("Number of expressions");
		System.out.println("-----------------------");
		for(int i = 0; i < expressionList.size(); i++) {
			System.out.println("Expression " + (i+1) + ": " + expressionList.get(i).getPostfixExpression());
			System.out.println("Result: " + expressionList.get(i).calculateResult());
		}
	}

}
