/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        getLeafNodes(root1, list1);
        getLeafNodes(root2, list2);
        
        int j = 0;
        
        if(list1.size()!=list2.size())
            return false;
        
        for(int k : list1){
            if(k!=list2.get(j))
                return false;
            j++;
        }
        
        return true;
    }
    
    void getLeafNodes(TreeNode node, List<Integer> list){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null){
            list.add(node.val);
            return;
        }
        
        getLeafNodes(node.left, list);
        getLeafNodes(node.right, list);
    }
}