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
        
        //1. Find the middle node
        //2. Reverse the middleNode
        //3. Compare the values
        
        ListNode middleNode = findMiddle(head);
        ListNode reversedNode = reverseList(middleNode);
        
        int maxSum = 0;
        
        while(reversedNode!=null){
            int sum = head.val + reversedNode.val;
            maxSum = Math.max(maxSum, sum);
            head = head.next;
            reversedNode = reversedNode.next;
        }
        
        return maxSum;
        
    }
    
    ListNode findMiddle(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
    ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}