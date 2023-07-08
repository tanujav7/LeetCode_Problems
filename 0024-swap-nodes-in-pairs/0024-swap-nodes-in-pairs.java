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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode currentNode = dummyHead;
        
        while(currentNode.next!=null && currentNode.next.next!=null){
            
            ListNode firstNode = currentNode.next;
            
            ListNode secondNode = currentNode.next.next;
            
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            currentNode.next = secondNode;
            currentNode = currentNode.next.next;
        }
        
        return dummyHead.next;
        
    }
}