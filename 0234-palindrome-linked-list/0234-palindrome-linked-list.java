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
    public boolean isPalindrome(ListNode head) {
        
        ListNode middleNode = middleofTheList(head);
        
        ListNode reverseNode = reverseList(middleNode);
        
        ListNode temp1 = head, temp2 = reverseNode;
        
        while(temp2!=null){
            if(temp1.val!=temp2.val)
                return false;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return true;
    }
    
    ListNode middleofTheList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
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