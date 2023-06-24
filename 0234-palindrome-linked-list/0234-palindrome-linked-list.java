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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tempNode = head;
        
        while(tempNode!=null){
            list.add(tempNode.val);
            tempNode = tempNode.next;
        }
        
        int i=0, j=list.size()-1;
        
        while(i<j){
            if(!list.get(i).equals(list.get(j)))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}