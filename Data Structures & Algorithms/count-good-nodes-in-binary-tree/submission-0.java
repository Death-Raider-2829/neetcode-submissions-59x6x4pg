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
    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int max = root.val;
        int[] ans={1};

        return helper(root,max,ans)-1;
    }

    public int helper(TreeNode root, int max, int[] ans) {
        if(root==null){
            return 0;
        }
        if (root.left==null && root.right==null) {
            if(root.val>=max){
                ans[0]++;
            }
            return ans[0];
        }

        if (root.val >= max) {
            max = root.val;
            ans[0]++;
        }

        helper(root.left,max,ans);
        helper(root.right,max,ans);

        return ans[0];
    }
}
