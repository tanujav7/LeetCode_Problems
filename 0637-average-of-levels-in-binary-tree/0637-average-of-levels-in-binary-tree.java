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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> resList = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root==null)
            return resList;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0.0;
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                
                sum += current.val;
                
                if(current.left!=null)
                    queue.add(current.left);
                
                if(current.right!=null)
                    queue.add(current.right);
            }
            resList.add(sum/size);
        }
        
        return resList;
    }
}