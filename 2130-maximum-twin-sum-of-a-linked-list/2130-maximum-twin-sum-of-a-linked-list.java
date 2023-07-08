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
        
        ListNode tempNode = head;
        List<Integer> list = new ArrayList<>();
        
        while(tempNode!=null){
            list.add(tempNode.val);
            tempNode = tempNode.next;
        }
        
        int i=0, j=list.size()-1;
        
        int res = 0;
        
        while(i<j){
            int sum = list.get(i) + list.get(j);
            res = Math.max(res,sum);
            i++;
            j--;
        }
        
        return res;
    }
}