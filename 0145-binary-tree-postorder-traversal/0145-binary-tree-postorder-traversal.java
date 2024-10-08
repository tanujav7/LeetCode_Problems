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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> resList = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        
        if(root==null)
            return resList;
        
        s1.push(root);
        
        while(!s1.isEmpty()){
            TreeNode tempNode = s1.pop();
            
            if(tempNode!=null)
                s2.push(tempNode);
            
            if(tempNode.left!=null)
                s1.push(tempNode.left);
            
            if(tempNode.right!=null)
                s1.push(tempNode.right);
        }
        
        while(!s2.isEmpty())
            resList.add(s2.pop().val);
        
        return resList;
    }
}