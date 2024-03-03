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
        
        ListNode middleNode = middleofList(head);
        
        ListNode reversedNode = reverseList(middleNode);
        
        int sum = 0, maxSum = 0;
        
        ListNode tempNode = head;
        
        while(reversedNode.next!=null){
            sum = tempNode.val + reversedNode.val;
            
            maxSum = Math.max(maxSum, sum);
            
            tempNode = tempNode.next;
            reversedNode = reversedNode.next;
        }
        
        return maxSum;
    }
    
    ListNode middleofList(ListNode head){
       
        ListNode slow = head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverseList(ListNode head){
        
        ListNode current = head, next = null, prev = null;
        
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}