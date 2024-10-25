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
    public ListNode partition(ListNode head, int x) {
        
        ListNode moreHead = new ListNode(0);
        ListNode lessHead = new ListNode(0);
        
        ListNode less = lessHead, more = moreHead;
        
        ListNode temp = head;
        
        while(temp!=null){
            if(temp.val<x){
                less.next = new ListNode(temp.val);
                less = less.next;
            }
            
            else{
                more.next = new ListNode(temp.val);
                more = more.next;
            }
            temp = temp.next;
        }
    
         less.next = moreHead.next;
    
        return lessHead.next;
    }
}