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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;

        if(root.val==key){
            if(root.left==null && root.right==null)return null;
            if(root.left==null){
                root=root.right;
                return root;
            }
            if(root.right==null){
                root=root.left;
                return root;
            }

            else{
                TreeNode temp=root.right;
                root=root.left;
                TreeNode right=root;
                while(right.right!=null){
                    right=right.right;
                }
                right.right=temp;
                return root;
            }
        }

        root.left=deleteNode(root.left,key);
        root.right=deleteNode(root.right,key);

        return root;
    }
}