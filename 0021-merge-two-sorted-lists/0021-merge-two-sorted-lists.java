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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                currentNode.next = new ListNode(l1.val);
                l1 = l1.next;
                currentNode = currentNode.next;
            }
            else{
                currentNode.next = new ListNode(l2.val);
                l2 = l2.next;
                currentNode = currentNode.next;
            }
        }
        
         while(l1!=null){
            currentNode.next = new ListNode(l1.val);
            l1 = l1.next;
            currentNode = currentNode.next;
        }
        
        
        while(l2!=null){
            currentNode.next = new ListNode(l2.val);
            l2 = l2.next;
            currentNode = currentNode.next;
        }
        
        
        return dummyHead.next;
    }
}