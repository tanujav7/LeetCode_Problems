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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0 || head.next==null)
            return head;
        
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
     
        k = k % len;
        
        if(k==0)
            return head;
        
        
        ListNode slow = head, fast = head;
        
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        
        // if(fast.next==null)
        //     return head;
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode res = slow.next;
        
        fast.next = head;
        
        slow.next = null;
        
        return res;
    }
}