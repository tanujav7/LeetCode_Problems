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
    public int pairSum(ListNode head) {
        
        ListNode middleNode = middleOfList(head);
        
        ListNode reversedNode = reverseList(middleNode);
        
        int maxSum = 0, sum = 0;
        
        ListNode p1 = head, p2 = reversedNode;
        
        while(p1.next!=null){
            
            sum = p1.val + p2.val;
            
            maxSum = Math.max(sum, maxSum);
            
            p1 = p1.next;
            
            p2 = p2.next;
        }
        
        return maxSum;
        
    }
    
    ListNode middleOfList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverseList(ListNode head){
        ListNode currentNode = head, next = null, prev = null;
        
        while(currentNode!=null){
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        
        return prev;
    }
}