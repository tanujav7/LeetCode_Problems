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
        
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry>0){
            
            int sum1 = (l1!=null) ? l1.val : 0;
            int sum2 = (l2!=null) ? l2.val : 0;
            
            int sum = sum1 + sum2 + carry;
            carry = sum/10;
            
            currentNode.next = new ListNode(sum%10);
            currentNode = currentNode.next;
            
            if(l1!=null)
                l1 = l1.next;
            
            if(l2!=null)
                l2 = l2.next;
            
        }
        
        dummyHead = dummyHead.next;
        
        return dummyHead;
    }
}