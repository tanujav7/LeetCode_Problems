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
        
        ListNode middleNode = middleOfTheList(head);
        ListNode middleNext = middleNode.next;
        middleNode.next = null;
        
        ListNode p1 = head;
        ListNode p2 = reverseList(middleNext);
        
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