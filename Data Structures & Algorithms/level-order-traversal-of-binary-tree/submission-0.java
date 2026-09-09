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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deck = new ArrayDeque<>();
        if(root != null) {
            deck.add(root);
        }
        while(!deck.isEmpty()){
            List<Integer> grouping = new ArrayList<>();
            int size = deck.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = deck.removeFirst();
                grouping.add(node.val);
                if(node.left != null) {
                    deck.add(node.left);
                }
                if(node.right !=null) {
                    deck.add(node.right);
                }
            }
            result.add(grouping);
        }
        return result;
    }
}
