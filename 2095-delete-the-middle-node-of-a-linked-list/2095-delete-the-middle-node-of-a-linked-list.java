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
            
        ListNode tempNode = head;
        int length = 0;
        
        while(tempNode!=null){
            length++;
            tempNode = tempNode.next;
        }
        
        int middleButNode = (length/2)-1;
        
        ListNode node = head;
        
        for(int i=0; i<middleButNode; i++)
            node = node.next;
        
        node.next = node.next.next;
        
        return head;
        
    }
}