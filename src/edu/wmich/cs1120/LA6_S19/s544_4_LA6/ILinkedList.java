package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public interface ILinkedList <E> {
	/**
	 * Adds the element e to the end of the list. 
	 * @param e element to be added
	 */
	void add(E e);
	
	/**
	 * Removes all of the elements from the list
	 */
	void clear();

	/**
	 * @return the element at the end (index size-1) of the list. 
	 */
	E getTail();

	/**
	 * 
	 * @param Index of the element to retrieve. (Indexing starts from 0.)
	 * @return the element at that index.
	 * @throws IndexOutOfBoundsException
	 */
	E get(int index) throws IndexOutOfBoundsException;

	/**
	 * @return true if the list is empty, false otherwise.
	 */
	boolean isEmpty();

	/**
	 * Removes the element at the specified index.
	 * @param Index of element to be removed. (Indexing starts from 0.)
	 * @return The contents of the element that was removed.
	 * @throws IndexOutOfBoundsException
	 */
	E remove(int index) throws IndexOutOfBoundsException;

	/**
	 * 
	 * @return the number of elements in this list.
	 */
	int size();	
}
