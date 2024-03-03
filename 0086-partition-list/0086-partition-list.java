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
        ListNode lessNode = lessHead;
        ListNode moreHead = new ListNode(0);
        ListNode moreNode = moreHead;
        
        
        ListNode tempNode = head;
        
        while(tempNode!=null){
            if(tempNode.val<x){
                lessNode.next = new ListNode(tempNode.val);
                lessNode = lessNode.next;
            }
            
            else{
                moreNode.next = new ListNode(tempNode.val);
                moreNode = moreNode.next;
            }
            
            tempNode = tempNode.next;
        }
        
        lessNode.next = moreHead.next;
        
        return lessHead.next;
    }
}