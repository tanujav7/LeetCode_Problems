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
        
        int lA = 0, lB = 0;
        
        ListNode tempA = headA, tempB = headB;
        
        while(tempA!=null){
            lA = lA + 1;
            tempA = tempA.next;
        }
        
        while(tempB!=null){
            lB = lB + 1;
            tempB = tempB.next;
        }
        
        
        int diff = Math.abs(lA-lB);
        
        if(lA>lB){
            while(diff-->0){
                headA = headA.next;
            }
        }
        
        else if(lB>lA){
            while(diff-->0){
                headB = headB.next;
            }
        }
        
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}