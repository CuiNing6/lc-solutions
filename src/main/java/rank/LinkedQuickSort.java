package rank;

import linked_list.DeleteNode;

/**
 * Created by cuining8 on 02/22/2022.
 */
public class LinkedQuickSort {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        LinkedQuickSort.ListNode listNode = new LinkedQuickSort.ListNode(4);
        listNode.next = new LinkedQuickSort.ListNode(2);
        listNode.next.next = new LinkedQuickSort.ListNode(1);
        listNode.next.next.next = new LinkedQuickSort.ListNode(3);

        ListNode res = new LinkedQuickSort().linkedQuickSort(listNode);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public ListNode linkedQuickSort(ListNode head) {
        quickSort(head, null);
        return head;
    }

    public void quickSort(ListNode head, ListNode end) {
        if( head != end) {
            ListNode node = sort(head, end);
            quickSort(head, node);
            quickSort(node.next, end);
        }
    }

    public ListNode sort(ListNode head, ListNode end) {
        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != end) {
            if (p2.val < head.val) {
                p1 = p1.next;

                int tmp = p1.val;
                p1.val = p2.val;
                p2.val = tmp;
            }
            p2 = p2.next;
        }

        if (p1 != head) {
            int temp = p1.val;
            p1.val = head.val;
            head.val = temp;
        }

        return p1;
    }




















}
