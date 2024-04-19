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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
       
        ListNode temp = head;
        int length = 0;
        
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        
        int middleButOne = (length/2)-1;
        
        ListNode pointer = head;
        
        while(middleButOne-->0){
            pointer = pointer.next;
        }
        
        pointer.next = pointer.next.next;
        
        return head;
    }
}