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
        
        if(head==null)
            return null;
        
        ListNode slow=head, fast=head;
        
        for(int i=1; i<k; i++)
            fast = fast.next;
        
        ListNode tempNode = fast;
        
        while(tempNode.next!=null){
            slow = slow.next;
            tempNode = tempNode.next;
        }
        
        int tempVal = slow.val;
        slow.val = fast.val;
        fast.val = tempVal;
        
        return head;
    }
}