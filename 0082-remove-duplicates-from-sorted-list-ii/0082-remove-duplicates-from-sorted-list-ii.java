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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode prevNode = new ListNode(0);
        ListNode currentNode = head;
        head = prevNode;
        
        while(currentNode!=null && currentNode.next!=null){
            if(currentNode.next!=null && currentNode.next.val==currentNode.val){
                while(currentNode.next!=null && currentNode.next.val==currentNode.val)
                    currentNode = currentNode.next;
                    prevNode.next = currentNode.next;
            }
            
            else{
                prevNode.next = currentNode;
                prevNode = prevNode.next;
            }
            
            currentNode = currentNode.next;
        }
        
        return head.next;
    }
}