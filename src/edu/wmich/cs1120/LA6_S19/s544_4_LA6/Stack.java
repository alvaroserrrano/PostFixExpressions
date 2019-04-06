package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public class Stack<E> implements IStack<E> {

	//PRIVATE FIELDS
	private LinkedList<E> list = new LinkedList<E>();
	
	/**
	 * Adds the parameter s to the top of the stack.
	 * @param s the element to be added
	 */
	@Override
	public void push(E s) {
		list.add(s);
	}

	/**
	 * Removes the top element from the stack
	 * @return data of the Node at the top
	 */
	@Override
	public E pop() {
		E temp = list.remove();
		return temp;
	}

	/**
	 * Returns the top element without removing it.
	 * @return The top element on the stack
	 */
	@Override
	public E peek() {
		return list.getTail();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
