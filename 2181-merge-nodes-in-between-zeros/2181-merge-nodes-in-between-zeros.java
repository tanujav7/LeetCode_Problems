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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        
        
        ListNode temp = head.next;
        
        int sum = 0;
        
        while(temp!=null){
            if(temp.val!=0){
                sum += temp.val;
            }
            
            else{
                currentNode.next = new ListNode(sum);
                sum = 0;
                currentNode = currentNode.next;
            }
            temp = temp.next;
        }
        
        return dummyHead.next;
    }
}