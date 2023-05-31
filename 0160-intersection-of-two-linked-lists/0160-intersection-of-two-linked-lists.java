/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode pA = headA, pB = headB;
        
        while(pA!=pB){
            pA = (pA!=null) ? pA.next : headB;
            pB = (pB!=null) ? pB.next : headA;
        }
        
        return pA;
    }
}