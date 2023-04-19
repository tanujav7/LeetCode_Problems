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
    public boolean isPalindrome(ListNode head) {
        
   
        if(head==null)
            return true;
        
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd);
        
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        
        while(p2.next!=null){
            
            if(p1.val!=p2.val)
                return false;
            
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return true;
    }
    
   ListNode endOfFirstHalf(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head;
       
       while(fast.next!=null && fast.next.next!=null){
          slow = slow.next;
          fast = fast.next.next;
       }
       
       return slow;
    }
    
    ListNode reverseList(ListNode head){
            
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
}