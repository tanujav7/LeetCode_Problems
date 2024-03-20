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
    public ListNode mergeInBetween(ListNode head1, int a, int b, ListNode head2) {
        
        ListNode p1 = head1;
        
        for(int i=0; i<a-1; i++){
            p1 = p1.next;
        }
        
        ListNode p2 = head1;
        
        for(int i=0; i<b; i++){
            p2 = p2.next;
        }
        
        ListNode p3 = head2;
        
        ListNode res = head1;
        
        while(head1!=p1){
            head1 = head1.next;
        }
        
        head1.next = head2;
        
        while(p3.next!=null){
            p3 = p3.next;
        }
        
        p3.next = p2.next;
        
        return res;
        
    }
}