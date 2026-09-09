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
    int currTotal = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root == null) {
            return false;
        }
        currTotal += root.val;

        if(root.left == null && root.right == null) {
            if(targetSum == currTotal) {
                return true;
            } else {
                currTotal -= root.val;
                return false;
            }
            
        }
        if(hasPathSum(root.left, targetSum)) {
            return true;
        }
        if(hasPathSum(root.right, targetSum)) {
            return true;
        }

        currTotal -= root.val;
        return false;
    }
       
}