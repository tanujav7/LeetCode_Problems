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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        ListNode middleNode = findMiddle(head);
        middleNode.next = middleNode.next.next;
        
        return head;
    }
    
    ListNode findMiddle(ListNode head){
        ListNode slow = head, fast = head.next;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}