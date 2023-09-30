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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> leafNodes1 = new ArrayList<>();
        List<Integer> leafNodes2 = new ArrayList<>();
        
        getLeafNodes(root1, leafNodes1);
        getLeafNodes(root2, leafNodes2);
        
        return leafNodes1.equals(leafNodes2);
    }
    
    
        void getLeafNodes(TreeNode node, List<Integer> leafNodes){
        if(node!=null){
            if(node.left==null && node.right==null)
                leafNodes.add(node.val);
            getLeafNodes(node.left, leafNodes);
            getLeafNodes(node.right, leafNodes);
        }
    }
}