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
        
        if(head==null)
            return null;
        
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        k = k % len;
        
        ListNode slow = head, fast = head;
        
        while(k-->0){
            fast = fast.next;
        }
        
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = head;
        
        ListNode res = slow.next;
        
        slow.next = null;
        
        return res;
    }
}