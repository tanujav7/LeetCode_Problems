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
            temp = temp.next;
            len++;
        }
        
        if(k>len)
            k = k%len;
        
        if(k==len || k==0)
            return head;
        
        ListNode slow = head, fast = head;
        
        while(k-->0){
            fast = fast.next;
        }
        
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode res = slow.next;
        fast.next = head;
        slow.next = null;
        
        return res;
    }
}