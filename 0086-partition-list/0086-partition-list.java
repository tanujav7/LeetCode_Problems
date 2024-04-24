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
        ListNode highHead = new ListNode(0);
        
        ListNode less = lessHead, high = highHead;
        
        ListNode temp = head;
        
        while(temp!=null){
            if(temp.val<x){
                less.next = new ListNode(temp.val);
                less = less.next;
            }
            else{
                high.next = new ListNode(temp.val);
                high = high.next;
            }
            temp = temp.next;
        }
        
        less.next = highHead.next;
        
        return lessHead.next;
    }
}