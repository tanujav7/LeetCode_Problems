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
        
        ListNode tempA = headA, tempB = headB;
        int lA = 0, lB = 0;
        
        while(tempA!=null){
            lA++;
            tempA = tempA.next;
        }
        
         while(tempB!=null){
            lB++;
            tempB = tempB.next;
        }
        
        ListNode pA = headA, pB = headB;
        
        int diff = Math.abs(lA-lB);
        
        if(lA>lB){
            while(diff-->0)
                pA = pA.next;
        }
        
        else if(lB>lA){
            while(diff-->0)
                pB = pB.next;
        }
        
        while(pA!=pB){
            pA = pA.next;
            pB = pB.next;
        }
        
        return pA;
    }
}