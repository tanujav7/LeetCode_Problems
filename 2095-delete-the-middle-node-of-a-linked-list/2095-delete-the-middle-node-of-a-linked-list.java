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
        
        if(head.next==null)
            return null;
        
        ListNode temp=head;
        
        int length = 0;
        
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        
        int middleButOne = (length/2)-1;
        
        ListNode ptr = head;
        
        for(int i=0; i<middleButOne; i++)
            ptr = ptr.next;
        
        ptr.next = ptr.next.next;
        
        return head;
    }
}