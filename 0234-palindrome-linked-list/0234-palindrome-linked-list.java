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
        
        List<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        
        int length = 0;

        while(temp!=null){
            length++;
            list.add(temp.val);
            temp = temp.next;
        }
        
        int i = 0, j = length-1;
        
        while(i<j){
            if(list.get(i)!=list.get(j))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}