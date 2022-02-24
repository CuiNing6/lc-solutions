package linked_list;

/**
 * Created by cuining8 on 02/21/2022. Merge two sorted linked lists and return it as a
 * new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedList.ListNode listNode = new MergeTwoSortedList.ListNode(1);
        listNode.next = new MergeTwoSortedList.ListNode(2);
        listNode.next.next = new MergeTwoSortedList.ListNode(6);
        listNode.next.next.next = new MergeTwoSortedList.ListNode(7);

        MergeTwoSortedList.ListNode listNode1 = new MergeTwoSortedList.ListNode(3);
        listNode1.next = new MergeTwoSortedList.ListNode(4);
        listNode1.next.next = new MergeTwoSortedList.ListNode(8);
        listNode1.next.next.next = new MergeTwoSortedList.ListNode(9);

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode res = mergeTwoSortedList.mergeTwoSortedList(listNode, listNode1);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public ListNode mergeTwoSortedList(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        } else if (p2 == null) {
            return p1;
        }

        if (p1.val < p2.val) {
            p1.next = mergeTwoSortedList(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoSortedList(p1, p2.next);
            return p2;
        }
    }



















}
