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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        
        int t2 = len - k;
        
        ListNode temp1 = head, temp2 = head;
        
        k = k-1;
        
        while(k-->0){
            temp1 = temp1.next;
        }
        
        while(t2-->0){
            temp2 = temp2.next;
        }
        
        int tempVal = temp1.val;
        temp1.val = temp2.val;
        temp2.val = tempVal;
        
        return head;
    }
}