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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        
        int sum=0, carry=0;
        
        while(l1!=null || l2!=null || carry>0){
            
            int sum1 = (l1==null) ? 0 : l1.val;
            int sum2 = (l2==null) ? 0 : l2.val;
            
            sum = sum1 + sum2 + carry;
            
            currentNode.next = new ListNode(sum%10);
            currentNode = currentNode.next;
            
            carry = sum/10;
            
            if(l1!=null)
                l1 = l1.next;
            
            if(l2!=null)
               l2 = l2.next;
            
        }
        
      //  return dummyHead.next;
        
        return reverseList(dummyHead.next);
    }
    
    ListNode reverseList(ListNode head){
        
        ListNode currentNode = head;
        ListNode previousNode = null, nextNode = null;
        
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        
        return previousNode;
    }
}