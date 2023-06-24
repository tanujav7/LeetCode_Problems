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
        
        ListNode middleNode = middleofTheList(head);
        ListNode middleNextNode = middleNode.next;
        
        middleNode.next = null;
        
        ListNode p1 = head;
        ListNode p2 = reverseList(middleNextNode);
        
        ListNode dummyHead = new ListNode(0);
        
        ListNode currentNode = dummyHead;
        
        while(p1!=null || p2!=null){
            if(p1!=null){
                currentNode.next = p1;
                currentNode = currentNode.next;
                p1 = p1.next;
            }
            if(p2!=null){
                currentNode.next = p2;
                currentNode = currentNode.next;
                p2 = p2.next;
            }
        }
        
      // head = dummyHead.next;
    }
    
    ListNode middleofTheList(ListNode head){
        ListNode slow=head, fast=head;
        
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