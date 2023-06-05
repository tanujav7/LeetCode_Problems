/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
       if (head == null) {
            return head;
        }
        
        // find the first node to be swapped
        ListNode node1 = head;
        for (int i = 1; i < k; i++) {
            node1 = node1.next;
        }
        
        // find the second node to be swapped
        ListNode node2 = head;
        ListNode current = node1;
        while (current.next != null) {
            current = current.next;
            node2 = node2.next;
        }
        
        // swap the nodes by changing the pointers
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        
        return head;

        
    }
}