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
        
        ListNode p1 = head, tempNode = middleOfTheList(head);
        ListNode p2 = reverseList(tempNode);
        
        int res = 0;
        
        while(p2!=null){
            int sum = p1.val+p2.val;
            res = Math.max(sum,res);
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return res;
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