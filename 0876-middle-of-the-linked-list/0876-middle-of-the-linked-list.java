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
    public ListNode middleNode(ListNode head) {
        
        ListNode[] arr = new ListNode[100];
        
        ListNode temp = head;
        
        int i = 0;
        while(temp!=null){
    
            arr[i++] = temp;
            temp = temp.next;
        
        }
        
        return arr[i/2];
    }
}