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
        
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        
        int k = len - n;
        
       if(head.next==null)
           return null;
        
        
        if(k==0)
            return head.next;
        
        ListNode pointer = head;
        
        for(int i=1; i<k; i++){
            pointer = pointer.next;
        }
        
        if(pointer.next==null)
            return head;
        
        pointer.next = pointer.next.next;
        
        return head;
    }
}