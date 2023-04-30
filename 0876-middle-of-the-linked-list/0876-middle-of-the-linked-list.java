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
        
      
   ListNode Arr[] = new ListNode[100];
        int index = 0;
        
        while(head!=null){
            Arr[index++] = head;
            head = head.next;
        }
        
        return Arr[index/2];
    }
}