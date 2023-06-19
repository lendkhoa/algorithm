package algorithm.linkedLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithm.lib.Node;

public class CommonLinkedListProblemsTest {

	@Test
	public void middleOfLinkedListTest1() {
		Node head = generateLinkedList(new int[]{1});
		int actual = CommonLinkedListProblems.getMiddleNode(head).value;
		assertEquals("Error", 1, actual, 0);
	}

	@Test
	public void middleOfLinkedListTest2() {
		Node head = generateLinkedList(new int[]{1,2,3,4,5});
		int actual = CommonLinkedListProblems.getMiddleNode(head).value;
		assertEquals("Error", 3, actual, 0);
	}

	@Test
	public void middleOfLinkedListTest3() {
		Node head = generateLinkedList(new int[]{1,2,3,4,5,6});
		int actual = CommonLinkedListProblems.getMiddleNode(head).value;
		assertEquals("Error", 4, actual, 0);
	}

	/*
	 * Generates a linked list of nodes with values from array
	 * @values: the nodes' values
	 */
	private Node generateLinkedList(int[] values) {
		if(values.length == 0) return null;
		if(values.length == 1) return new Node(values[0]);
		Node head = new Node(values[0]);
		Node agent = head;
		for(int i = 1; i < values.length; i++) {
			head.next = new Node(values[i]);
			head = head.next;
		}
		return agent;
	}
}
