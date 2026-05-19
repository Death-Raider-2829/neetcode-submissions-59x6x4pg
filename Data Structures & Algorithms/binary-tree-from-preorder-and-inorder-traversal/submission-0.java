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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] index={0};
        return helper(preorder,inorder,0,preorder.length-1,index);
    }

    TreeNode helper(int[] preorder,int[] inorder,int start,int end,int[] index){
        if(start>end)return null;
        if(index[0]==preorder.length)return null;

        int ind=index[0]++;
        TreeNode current=new TreeNode(preorder[ind]);
        int indexInInorder=helper2(inorder,current.val);
        if(indexInInorder==-1) return null;

        current.left=helper(preorder,inorder,start,indexInInorder-1,index);
        current.right=helper(preorder,inorder,indexInInorder+1,end,index);

        return current;
    }

    int helper2(int[] inorder,int data){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==data){
                return i;
            }
        }
        return -1;
    }
}
