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
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode tempNode = queue.remove();
                if(level%2!=0)
                    list.add(tempNode.val);
                else
                    list.add(0, tempNode.val);
                if(tempNode.left!=null)
                    queue.add(tempNode.left);
                if(tempNode.right!=null)
                    queue.add(tempNode.right);
            }
            resList.add(list);
            level++;
        }
        
        return resList;
    }
}