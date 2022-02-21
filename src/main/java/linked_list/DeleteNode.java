package linked_list;

import java.util.List;

/**
 * Created by cuining8 on 02/21/2022. Write a function to delete a node (except the tail)
 * in a singly linked list, given only access to that node.
 *
 * <p>Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        new DeleteNode().deleteNode(listNode.next.next);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public void deleteNode(ListNode node) {
        ListNode prev = node;
        ListNode last = node;
        ListNode next = node.next;

        while (next != null) {
            last = prev;
            int temp = prev.val;
            prev.val = next.val;
            next.val = temp;
            prev = prev.next;
            next = next.next;
        }
        last.next = null;
    }
}
