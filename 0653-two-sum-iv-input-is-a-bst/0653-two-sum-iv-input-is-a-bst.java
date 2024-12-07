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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int x) {
        inorderTraversal(root);
        
        int i=0, j=list.size()-1;
        
       if(list.size()==1 && list.get(0)!=x){
            return false;
        }
        
        
        while(i<j){
            if(list.get(i) + list.get(j) == x)
                return true;
            
            else if(list.get(i) + list.get(j) < x)
                i++;
            
            else
                j--;
        }
        
        return false;
    }
    
    void inorderTraversal(TreeNode node){
        if(node==null)
            return;
        
        inorderTraversal(node.left);
        list.add(node.val);
        inorderTraversal(node.right);
    }
}