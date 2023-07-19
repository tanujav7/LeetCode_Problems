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
    public ListNode partition(ListNode head, int x) {
        
        ListNode smallerHead = new ListNode(0);
        ListNode higherHead = new ListNode(0);
        
        ListNode smaller = smallerHead;
        ListNode higher = higherHead;
        
        ListNode temp = head;
        
        while(temp!=null){
            if(temp.val<x){
                smaller.next = new ListNode(temp.val);
                smaller = smaller.next;
            }
            
            else{
                higher.next = new ListNode(temp.val);
                higher = higher.next;
            }
            
            temp = temp.next;
          }
        
        
        smaller.next = higherHead.next;
        
        return smallerHead.next;
        }
    }
