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
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        int lengthA = 0;
        int lengthB = 0;
        
        //Find the length of List A
        while(tempA!=null){
            lengthA++;
            tempA = tempA.next;
        }
        
       //Find the length of List B
        while(tempB!=null){
            lengthB++;
            tempB = tempB.next;
        }
        
        int diff = Math.abs(lengthA-lengthB);
        
        ListNode pA = headA;
        ListNode pB = headB;
        
        //Move the pointer pA/pB
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