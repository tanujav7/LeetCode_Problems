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
        
        int lengthA = 0, lengthB = 0;
        ListNode tempA = headA, tempB = headB;
        
        while(tempA!=null){
            lengthA++;
            tempA = tempA.next;
        }
        
         while(tempB!=null){
            lengthB++;
            tempB = tempB.next;
        }
        
        ListNode pA = headA, pB = headB;
        
        int diff = Math.abs(lengthA-lengthB);
        
        if(lengthA>lengthB){
            while(diff-->0)
                pA = pA.next;
        }
        
        else{
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