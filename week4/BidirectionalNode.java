package week4;

import week4.BidirectionalNode;

public class BidirectionalNode<E> {
	public BidirectionalNode<E> prev;
 	public E item;
 	public BidirectionalNode<E> next;
 	public BidirectionalNode() {
 		prev = next = null;
 		item = null;
 	}
 	public BidirectionalNode(E newItem) {
 		prev = next = null;
 		item = newItem;
 	}
 	public BidirectionalNode(BidirectionalNode<E> prevNode, E newItem, BidirectionalNode<E> nextNode) {
 		prev = prevNode; next = nextNode;
 		item = newItem;
 	}
} // �ڵ� 5-13