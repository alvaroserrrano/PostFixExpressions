package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public class LinkedList<E> implements ILinkedList<E> {
	
	//PRIVATE FIELDS
	private Node head = null;
	private Node tail = null;
	private Node copyHead;
	
	/**
	 * Default Constructor
	 */
	public LinkedList() {

	}
	
	/**
	 * This constructor creates a new Node
	 * @param val
	 * Data to be entered into the new node
	 */
	public LinkedList (E val) {
		Node first = new Node(val);
		head = first;
		tail = first;
	}
	
	/**
	 * private class for each individual node in the Linkedlist
	 */
	private class Node implements INode<E>{
		private E value;
		private INode<E> next;
		
		//Constructor one param
		Node (E value){
			this.value = value;
			this.next = null;
		}
		
		@Override
		public E getData() {
			return this.value;
		}
		@Override
		public void setData(E data) {
			this.value = data;
			
		}
		@Override
		public INode<E> getNext() {
			return this.next;
		}
		@Override
		public void setNext(INode<E> next) {
			this.next = next;
		} 
	}//private class Node
	
	
	@Override
	public void add(E e) {
		Node newNode = new Node(e);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
		}
		tail = newNode;
	}

	/**
	 * Removes all of the elements from the list
	 */
	@Override
	public void clear() {
		head = null;
	}

	/**
	 * 
	 * @param Index of the element to retrieve. (Indexing starts from 0.)
	 * @return the element at that index.
	 * @throws IndexOutOfBoundsException
	 */
	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		copyHead = head;
		int counter = 0;
		while(counter < index) {
			copyHead = (LinkedList<E>.Node) copyHead.next;
			counter ++;
		}
		return copyHead.getData();
	}

	/**
	 * @return true if the list is empty, false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return number of nodes in the LinkedList
	 */
	@Override
	public int size() {
		copyHead = head;
		int counter = 0;
		while(copyHead.next != null) {
			counter ++;
		}
		
		//count the last node
		counter ++;
		return counter;
	}

	@Override
	public E getTail() {
		// TODO Auto-generated method stub
		return null;
	}


}
