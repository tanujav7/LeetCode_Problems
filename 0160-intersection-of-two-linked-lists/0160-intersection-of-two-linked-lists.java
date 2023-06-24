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
        
        ListNode tempA=headA, tempB=headB;
        ListNode pA=headA, pB=headB;
        
        int lengthA=0, lengthB=0;
        
        while(tempA!=null){
            tempA = tempA.next;
            lengthA++;
        }
        
        while(tempB!=null){
            tempB = tempB.next;
            lengthB++;
        }
        
        int diff = Math.abs(lengthA-lengthB);
        
        if(lengthA>lengthB){
            while(diff-->0)
                pA = pA.next;
        }
        
        if(lengthB>lengthA){
            while(diff-->0)
                pB = pB.next;
        }
        
        while(pA!=pB){
            pA = pA.next;
            pB = pB.next;
            
            if(pA==null || pB==null)
                return null;
        }
        
        return pA;
    }
}