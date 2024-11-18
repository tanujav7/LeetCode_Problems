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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || head.next==null)
            return null;
        
        ListNode tempHead = head;
        int len = 0;
        
        while(tempHead!=null){
            len++;
            tempHead = tempHead.next;
        }
        
        int diff = len-n;
        
        if(diff==0)
            return head.next;
        
        ListNode pointer = head;
        
        for(int i=1; i<diff; i++){
            pointer = pointer.next;
        }
        
        pointer.next = pointer.next.next;
        
        return head;
    }
}