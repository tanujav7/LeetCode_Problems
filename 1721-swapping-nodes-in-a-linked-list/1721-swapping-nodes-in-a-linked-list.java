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
        
        ListNode node1 = head, node2 = head;
        
        for(int i=1; i<k; i++)
            node1 = node1.next;
        
        ListNode tempNode = node1;
        
        while(tempNode.next!=null){
            tempNode = tempNode.next;
            node2 = node2.next;
        }
        
        int tempVal = node1.val;
        node1.val = node2.val;
        node2.val = tempVal;
        
        return head;
    }
}