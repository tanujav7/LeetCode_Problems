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
    public TreeNode mergeTrees(TreeNode node1, TreeNode node2) {
        if(node1==null)
            return node2;
        
        Stack<TreeNode[]> stack = new Stack<>();
        
        TreeNode res = node1;
        
        stack.push(new TreeNode[]{node1, node2});
        
        
        while(!stack.isEmpty()){
            TreeNode arr[] = stack.pop();
            
            if(arr[0]==null || arr[1]==null)
                continue;
            
            arr[0].val = arr[0].val + arr[1].val;
            
            if(arr[0].left==null)
                arr[0].left = arr[1].left;
            
            else
                stack.push(new TreeNode[]{arr[0].left, arr[1].left});
            
             if(arr[0].right==null)
                arr[0].right = arr[1].right;
            
            else
                stack.push(new TreeNode[]{arr[0].right, arr[1].right});
            
        }
        
        return res;
    }
}