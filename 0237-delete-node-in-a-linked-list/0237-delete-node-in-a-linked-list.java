/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       
       ListNode tempNode = node.next;
       node.val = tempNode.val;
       node.next = tempNode.next;
        
    }
}