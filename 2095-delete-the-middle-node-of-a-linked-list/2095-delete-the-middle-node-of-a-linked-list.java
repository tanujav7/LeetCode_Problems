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
        
        int length = 0;
        ListNode tempnode = head;
        
        while(tempnode!=null){
            length++;
            tempnode = tempnode.next;
        }
        
        int middleButOne = (length/2)-1;
        
        ListNode currentNode = head;
        
        for(int i=0; i<middleButOne; i++)
            currentNode = currentNode.next;
        
        currentNode.next = currentNode.next.next;
        
        return head;
    }
}