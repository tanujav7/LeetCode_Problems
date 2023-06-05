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
        
        ListNode midNode = middleNode.next;
        
        middleNode.next = null;
        
        ListNode node2 = reverseList(midNode);
        ListNode node1 = head;
        
        
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        
        while(node1!=null || node2!=null){
            
            if(node1!=null){
                currentNode.next = node1;
                currentNode = currentNode.next;
                node1 = node1.next;
            }
            
            if(node2!=null){
                currentNode.next = node2;
                currentNode = currentNode.next;
                node2 = node2.next;
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
        
        ListNode currentNode = head, previous = null, next = null;
        
        while(currentNode!=null){
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        
        return previous;
    }
}