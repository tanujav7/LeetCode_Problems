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
        ListNode reversed = reverseList(middleNode);
        
        ListNode p1 = head, p2 = reversed;
        
        int max = Integer.MIN_VALUE;
        
        while(p2.next!=null){
            int sum = p1.val + p2.val;
            max = Math.max(max, sum);
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return max;
    }
    
    ListNode middleOfList(ListNode head){
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