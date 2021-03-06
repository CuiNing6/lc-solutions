package linked_list;

/**
 * Created by cuining8 on 02/21/2022. Given a linked list, reverse the nodes of a linked
 * list k at a time and return its modified list.
 *
 * <p>k is a positive integer and is less than or equal to the length of the linked list. If the
 * number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 *
 * <p>You may not alter the values in the nodes, only nodes itself may be changed.
 *
 * <p>Only constant memory is allowed.
 *
 * <p>For example, Given this linked list: 1->2->3->4->5
 *
 * <p>For k = 2, you should return: 2->1->4->3->5
 *
 * <p>For k = 3, you should return: 3->2->1->4->5
 *
 * <p>
 *
 * <p>Solution: O(N) solution with constant space. Recursively reverse a group of K nodes and for
 * each group join the tail of the prev group to the head of the next group.
 */
public class ReverseNodesKGroup {
}
