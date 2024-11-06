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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        if(root==null)
            return resList;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                list.add(currentNode.val);
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                 if(currentNode.right!=null)
                    queue.add(currentNode.right);
            }
            resList.add(list);
        }
        
        Collections.reverse(resList);
        
        return resList;
    }
}