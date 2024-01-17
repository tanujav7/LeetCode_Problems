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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                currentNode.next = new ListNode(list1.val);
                list1 = list1.next;
                currentNode = currentNode.next;
            }
            
            else{  
                currentNode.next = new ListNode(list2.val);
                list2 = list2.next;
                currentNode = currentNode.next;
            }
        }
        
         while(list1!=null){
            currentNode.next = new ListNode(list1.val);
            list1 = list1.next;
            currentNode = currentNode.next;
         }
        
        while(list2!=null){
            currentNode.next = new ListNode(list2.val);
            list2 = list2.next;
            currentNode = currentNode.next;
         }
        
        return head.next;
    }
}