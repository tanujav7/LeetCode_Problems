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
        
        if(head.next==null || head==null)
            return null;
        
        int len = 0;
        ListNode tempHead = head;
        
        while(tempHead!=null){
            len++;
            tempHead = tempHead.next;
        }
        
        
        int midNode = (len/2)-1;
        
        ListNode temp = head;
        
        while(midNode-->0){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}