package linked_list;

/**
 * Created by cuining8 on 02/21/2022. Write a program to find the node at which the
 * intersection of two singly linked lists begins.
 *
 * <p>
 *
 * <p>For example, the following two linked lists:
 *
 * <p>A: a1 → a2 ↘ c1 → c2 → c3 ↗ B: b1 → b2 → b3 begin to intersect at node c1.
 *
 * <p>
 *
 * <p>Notes:
 *
 * <p>If the two linked lists have no intersection at all, return null. The linked lists must retain
 * their original structure after the function returns. You may assume there are no cycles anywhere
 * in the entire linked structure. Your code should preferably run in O(n) time and use only O(1)
 * memory.
 */
public class IntersectionOfTwoLists {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        IntersectionOfTwoLists.ListNode listNode1 = new IntersectionOfTwoLists.ListNode(1);
        listNode1.next = new IntersectionOfTwoLists.ListNode(2);
        listNode1.next.next = new IntersectionOfTwoLists.ListNode(8);
        listNode1.next.next.next = new IntersectionOfTwoLists.ListNode(9);
        listNode1.next.next.next.next = new IntersectionOfTwoLists.ListNode(10);

        IntersectionOfTwoLists.ListNode listNode2 = new IntersectionOfTwoLists.ListNode(3);
        listNode2.next = new IntersectionOfTwoLists.ListNode(4);
        listNode2.next.next = new IntersectionOfTwoLists.ListNode(5);
        listNode2.next.next.next = new IntersectionOfTwoLists.ListNode(8);
        listNode2.next.next.next.next = new IntersectionOfTwoLists.ListNode(9);
        listNode2.next.next.next.next.next = new IntersectionOfTwoLists.ListNode(10);

        ListNode res = new IntersectionOfTwoLists().intersectionOfTwoLists(listNode1, listNode2);

        System.out.println(res);

    }

    public ListNode intersectionOfTwoLists (ListNode head1, ListNode head2) {
        ListNode p1 = head1;
        ListNode p2 = head2;

        int len1 = 0;
        int len2 = 0;

        while (p1 != null) {
            p1 = p1.next;
            len1 += 1;
        }

        while (p2 != null) {
            p2 = p2.next;
            len2 += 1;
        }

        if (len1 <= len2) {
            int n = len2 - len1;
            p1 = head1; p2 = head2;
            while (n != 0) {
               p2 = p2.next;
               n -= 1;
            }
        } else {
            int n = len1 - len2;
            p1 = head1; p2 = head2;
            while (n != 0) {
                p1 = p1.next;
                n -= 1;
            }
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

}
