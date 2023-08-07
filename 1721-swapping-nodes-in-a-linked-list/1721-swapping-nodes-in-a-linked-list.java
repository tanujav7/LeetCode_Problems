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
        
        ListNode p1 = head, p2 = head;
        
        for(int i=1; i<k; i++)
            p1 = p1.next;
        
       ListNode tempNode = p1;
        
       while(tempNode.next!=null){
           tempNode = tempNode.next;
           p2 = p2.next;
       }
        
        //Swap the values
        
        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;
        
        return head;
    }
}