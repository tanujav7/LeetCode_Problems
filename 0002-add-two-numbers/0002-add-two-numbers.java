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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        
        int carry = 0, sum = 0;
        
        while(l1!=null || l2!=null || carry>0){
            
            int s1 = (l1!=null) ? l1.val : 0;
            int s2 = (l2!=null) ? l2.val : 0;
            
            sum = s1 + s2 + carry;
            
            currentNode.next = new ListNode(sum%10);
            carry = sum/10;
            
            if(l1!=null)
                l1 = l1.next;
            
            if(l2!=null)
                l2 = l2.next;
            
            currentNode = currentNode.next;
        }
        
        return head.next;
    }
}