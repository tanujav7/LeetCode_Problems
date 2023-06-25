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
        
        int length=0;
        ListNode tempNode = head;
        
        while(tempNode!=null){
            tempNode = tempNode.next;
            length++;
        }
        
        int middleIndex = (length/2)-1;
        
        ListNode pointer = head;
        
        for(int i=0; i<middleIndex; i++)
            pointer = pointer.next;
        
        pointer.next = pointer.next.next;
        
        return head;
        
    }
}