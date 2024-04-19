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
        
        int lenA = 0, lenB = 0;
        
        ListNode tempA = headA, tempB = headB;
        
        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
        }
        
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
        }
        
        ListNode pA = headA, pB = headB;
        
        int diff = Math.abs(lenA-lenB);
        
        if(lenA>lenB){
            while(diff-->0)
                pA = pA.next;
        }
        
         if(lenB>lenA){
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