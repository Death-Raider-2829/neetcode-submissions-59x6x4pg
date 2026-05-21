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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter={0};

        helper(root,diameter);
        return diameter[0];
    }

    int helper(TreeNode root,int[] diameter){
        if(root==null) return 0;

        int left=helper(root.left,diameter);
        int right=helper(root.right,diameter);

        int max=diameter[0];
        if(max<left+right) diameter[0]=left+right;
        return Math.max(left,right)+1;
    }
}
