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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max=helper(root,1,0,0);
        return max;
    }

    int helper(TreeNode root,int max,int left,int right){
        if(root==null){
            if((left+right>max)){
                return left+right;
            }
            else{
                return max;
            }
        }

        left++;
        max=helper(root.left,max,left,right);
        left--;
        right++;
        max=helper(root.right,max,left,right);
        right--;

        return max;
    }
}
