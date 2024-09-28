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
        
        ListNode nextNode = node.next;
        int nextVal = nextNode.val;
        node.val = nextVal;
        node.next = node.next.next;
    }
}