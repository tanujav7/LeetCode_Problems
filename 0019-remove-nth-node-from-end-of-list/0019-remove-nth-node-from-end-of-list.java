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
        
        ListNode slow = head;
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        int k = len-n;
        
        if(k==0)
            return head.next;
        
        for(int i=1; i<k; i++){
            slow = slow.next;
        }
        
        if(slow.next==null)
            return head.next;
        
        slow.next = slow.next.next;
        
        return head;
    }
}