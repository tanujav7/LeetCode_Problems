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
    public int pairSum(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        ListNode tempNode = head;
        
        while(tempNode!=null){
            list.add(tempNode.val);
            tempNode = tempNode.next;
        }
        
        //Two pointers
        int i=0, j=list.size()-1;
        int res = 0;
        
        while(i<=j){
            int sum = list.get(i)+list.get(j);
            res = Math.max(sum,res);
            i++;
            j--;
        }
        
        return res;
    }
}