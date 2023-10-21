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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int leftValue = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            leftValue = 0;
            for(int i=0; i<size; i++){
                TreeNode tempNode = queue.remove();
                if(i==0)
                    leftValue = tempNode.val;
                if(tempNode.left!=null)
                    queue.add(tempNode.left);
                 if(tempNode.right!=null)
                    queue.add(tempNode.right);
            }
        }
        
        return leftValue;
    }
}