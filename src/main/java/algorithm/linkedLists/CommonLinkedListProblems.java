package algorithm.linkedLists;

import algorithm.lib.Node;

public class CommonLinkedListProblems {
    public CommonLinkedListProblems() {
        System.out.println("Common LinkedList Problems");
    }

    /**
     * Returns the middle node of the linked list
     * @head: the head input node
     */
    static Node getMiddleNode(Node head) {
        if(head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
