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
        
        ListNode getMiddle = middleofList(head);
        
        ListNode reversedNode = reverseList(getMiddle);
        
        //getMiddle.next = null;
        
        int maxSum = 0;
        
        ListNode p1 = head, p2 = reversedNode;
        
        while(p2!=null){
            maxSum = Math.max(maxSum, p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return maxSum;
    
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
    
    ListNode middleofList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}