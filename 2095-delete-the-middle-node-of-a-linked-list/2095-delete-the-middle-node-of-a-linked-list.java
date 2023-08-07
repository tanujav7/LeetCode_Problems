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
        
        int length = 0;
        
        ListNode temp = head;
        
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        
        int middleButIndex = (length/2)-1;
        
        ListNode currentNode = head;
        
        for(int i=0; i<middleButIndex; i++){
            currentNode = currentNode.next;
        }
        
        if(currentNode.next!=null)
        currentNode.next = currentNode.next.next;
        
        return head;
    }
}