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
        
        ListNode p1 = head;
        ListNode middleNode = middleOfTheList(head);
        ListNode p2 = reverseList(middleNode.next);
        middleNode.next = null;
        
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        
        while(p1!=null || p2!=null){
            if(p1!=null){
                currentNode.next = p1;
                p1 = p1.next;
                currentNode = currentNode.next;
            }
            if(p2!=null){
                currentNode.next = p2;
                p2 = p2.next;
                currentNode = currentNode.next;
            }
        }
        currentNode.next = null;
        
        head = dummyHead.next;
    }
    
    
    ListNode middleOfTheList(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverseList(ListNode head){
        ListNode currentNode = head, nextNode = null, prevNode = null;
        
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        
        return prevNode;
    }
}