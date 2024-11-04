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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        if(root==null)
            return list;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                if(currentNode.val>maxVal)
                    maxVal = currentNode.val;
                
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                 if(currentNode.right!=null)
                    queue.add(currentNode.right);
            }
            list.add(maxVal);
        }
        
        return list;
    }
}