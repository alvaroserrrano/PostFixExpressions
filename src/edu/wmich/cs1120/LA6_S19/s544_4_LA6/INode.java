package edu.wmich.cs1120.LA6_S19.s544_4_LA6;

public interface INode<E> {
	/**
	 * Returns the data stored in this node.
	 * @return	Data in this node.
	 */
	E getData();

	/**
	 * Setter for data for this node.
	 * @param data	New data
	 */
	void setData(E data);

	/**
	 * Returns the node next to this node.
	 * @return	Node next to this node.
	 */
	INode<E> getNext();

	/**
	 * Sets node received as the next node to this node.
	 * @param next	New next node.
	 */
	void setNext(INode<E> next);

}
