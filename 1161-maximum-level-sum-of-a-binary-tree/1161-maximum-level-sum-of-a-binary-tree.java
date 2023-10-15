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
    public int maxLevelSum(TreeNode root) {
        
       // List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        int max = Integer.MIN_VALUE;
        int level = 0;
        //if(root==null)
         //   return res;
        int k = 0;
        queue.add(root);
        
        while(!queue.isEmpty()){
            k++;
            int size = queue.size();
            int sum = 0;
            for(int i=0; i<size; i++){
                TreeNode temp = queue.remove();
                sum += temp.val;
                
                if(temp.left!=null)
                    queue.add(temp.left);
                
                if(temp.right!=null)
                    queue.add(temp.right);
                
            }
            
            if(sum>max){
                max = sum;
                level = k;
            }
        }
        
        return level;
    }
}