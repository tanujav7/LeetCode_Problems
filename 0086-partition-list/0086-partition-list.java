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
        
        ListNode lessHead = new ListNode(0);
        ListNode moreHead = new ListNode(0);
        
        ListNode less = lessHead;
        ListNode more = moreHead;
        
        ListNode tempNode = head;
        
        while(tempNode!=null){
            if(tempNode.val<x){
                less.next = new ListNode(tempNode.val);
                less = less.next;
            }
            
            else{
                more.next = new ListNode(tempNode.val);
                more = more.next;
            }
            tempNode = tempNode.next;
        }
        
        less.next = moreHead.next;
        
        return lessHead.next;
    }
}