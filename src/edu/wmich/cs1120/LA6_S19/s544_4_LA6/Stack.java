package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public class Stack<E> implements IStack<E> {

	//PRIVATE FIELDS
	private LinkedList<E> list = new LinkedList<E>();
	
	@Override
	public void push(E s) {
		list.add(s);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
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
