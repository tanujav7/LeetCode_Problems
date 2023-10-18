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
    
    List<Integer> list = new ArrayList<>();
    
    public boolean findTarget(TreeNode root, int target) {
        getValues_Inorder(root);
        
        int n = list.size();
        int i = 0, j = n-1;
        
        while(i<j){
            if(list.get(i)+list.get(j)==target)
                return true;
            
            else if(list.get(i)+list.get(j)<target)
                i++;
            
            else
                j--;
        }
        
        return false;
    }
    
   void getValues_Inorder(TreeNode node){
       if(node==null)
           return;
       
       getValues_Inorder(node.left);
       list.add(node.val);
       getValues_Inorder(node.right);
   }
}