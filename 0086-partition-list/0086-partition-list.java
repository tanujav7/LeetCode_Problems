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
        
        ListNode smallerHead = new ListNode(0);
        ListNode higherHead = new ListNode(0);
        
        ListNode small = smallerHead;
        ListNode high = higherHead;
        
        ListNode tempNode = head;
        
        while(tempNode!=null){
            if(tempNode.val<x){
                small.next = new ListNode(tempNode.val);
                small = small.next;
            }
            
            else{
                high.next = new ListNode(tempNode.val);
                high = high.next;
            }
            
            tempNode = tempNode.next;
        }
        
        small.next = higherHead.next;
        
        return smallerHead.next;
        
    }
}