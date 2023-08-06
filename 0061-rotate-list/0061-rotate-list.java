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
        
        int length = 0;
        
        ListNode temp = head;
        
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        
            k = k%length;
        
        ListNode slow = head, fast = head;
        
        for(int i=0; i<k; i++)
            fast = fast.next;
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        fast.next = head;
        
        ListNode res = slow.next;
   
        slow.next = null;
        
        return res;
    }
}