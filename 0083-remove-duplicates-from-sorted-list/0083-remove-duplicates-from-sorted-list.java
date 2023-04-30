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
    public ListNode deleteDuplicates(ListNode head) {
       
      if(head==null)
          return null;
        
       ListNode tempNode = head;
        
        while(tempNode.next!=null){
            if(tempNode.val==tempNode.next.val)
                tempNode.next = tempNode.next.next;
            else
                tempNode = tempNode.next;
        }
        
        return head;
    }
}