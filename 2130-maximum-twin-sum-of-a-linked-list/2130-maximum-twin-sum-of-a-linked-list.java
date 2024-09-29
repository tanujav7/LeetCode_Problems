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
        
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode reversedNode = reverseList(slow); 
        
        
        ListNode p1 = head, p2 = reversedNode;
        
        int maxSum = 0;
        
        while(p2!=null){
            int sum = p1.val + p2.val;
            
            maxSum = Math.max(sum, maxSum);
            
            p1 = p1.next;
            
            p2 = p2.next;
        }
        
        return maxSum;
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