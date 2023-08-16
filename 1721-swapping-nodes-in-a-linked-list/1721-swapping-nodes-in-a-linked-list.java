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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode p1 = head;
        
        ListNode p2 = head;
        
        for(int i=1; i<k; i++)
            p1 = p1.next;
        
        ListNode tempNode = p1;
        
        while(tempNode.next!=null){
            p2 = p2.next;
            tempNode = tempNode.next;
        }
        
        
        //Swap the node values
        
        int tempVal = p1.val;
        p1.val = p2.val;
        p2.val = tempVal;
        
        return head;
        
    }
}