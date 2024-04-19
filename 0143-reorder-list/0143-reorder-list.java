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
    public void reorderList(ListNode head) {
        
        ListNode middleNode = middleofList(head);
        ListNode reversedNode = reverseList(middleNode.next);
        middleNode.next = null;
        ListNode p1 = head, p2 = reversedNode;
        
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        while(p1!=null || p2!=null){
            if(p1!=null){
                current.next = p1;
                p1 = p1.next;
                current = current.next;
            }
            
            if(p2!=null){
                current.next = p2;
                p2 = p2.next;
                current = current.next;
            }
        }
        
        head = dummyHead.next;
    }
    
    ListNode middleofList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverseList(ListNode head){
        ListNode prev = null, current = head, next = null;
        
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}