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
    public int kthSmallest(TreeNode root, int k) {
        int[] count={1};

        return helper(root,count,k);
    }

    int helper(TreeNode root,int[] count,int k){
        if(root==null)return -1;
        if(root.left==null && root.right==null){
            if(count[0]==k)return root.val;
            else count[0]++;
            return -1;
        }

        int val=helper(root.left,count,k);
        if(val!=-1)return val;
        if(count[0]==k)return root.val;
        count[0]++;
        val=helper(root.right,count,k);
        if(val!=-1)return val;

        return -1;
    }
}
