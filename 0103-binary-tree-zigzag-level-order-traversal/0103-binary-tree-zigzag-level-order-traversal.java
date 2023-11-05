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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        if(root==null)
            return resList;
        int level = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = queue.remove();
                if(level%2!=0)
                    list.add(temp.val);
                else
                    list.add(0, temp.val);
                
                if(temp.left!=null)
                    queue.add(temp.left);
                 if(temp.right!=null)
                    queue.add(temp.right);
            }
            resList.add(list);
            level++;
        }
        
        return resList;
    }
}