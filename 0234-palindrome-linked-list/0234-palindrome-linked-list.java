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
        
        ListNode p1 = head;
        ListNode tempNode = middleOfTheList(head);
        ListNode p2 = reverseList(tempNode);
        
        while(p2.next!=null){
            if(p1.val!=p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return true;
        
    }
    
    
    ListNode middleOfTheList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
                
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverseList(ListNode head){
        
        ListNode currentNode = head, prevNode = null, nextNode = null;
        
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        
        return prevNode;
    }
}