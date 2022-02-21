package linked_list;

/**
 * Created by cuining8 on 02/21/2022 We are given a linked list with head as the first
 * node. Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
 *
 * <p>Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such
 * that j > i, node_j.val > node_i.val, and j is the smallest possible choice. If such a j does not
 * exist, the next larger value is 0.
 *
 * <p>Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
 *
 * <p>Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the
 * serialization of a linked list with a head node value of 2, second node value of 1, and third
 * node value of 5.
 *
 * <p>Example 1:
 *
 * <p>Input: [2,1,5] Output: [5,5,0] Example 2:
 *
 * <p>Input: [2,7,4,3,5] Output: [7,0,5,5,0] Example 3:
 *
 * <p>Input: [1,7,5,1,9,2,5,1] Output: [7,9,9,9,0,5,0,0]
 *
 * <p>Note:
 *
 * <p>1 <= node.val <= 10^9 for each node in the linked list. The given list has length in the range
 * [0, 10000].
 *
 * <p>Solution O(N) solve the problem in the inverse order starting from the tail of the list.
 * Maintain a stack of values and on each iteration pop() all the values from the stack which are
 * smaller then the current element.
 */
public class NextGreaterNodeInLinkedList {
}
