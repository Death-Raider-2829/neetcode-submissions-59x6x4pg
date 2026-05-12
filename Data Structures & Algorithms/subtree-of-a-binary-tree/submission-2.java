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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null) return false;
        if(subRoot==null) return true;

        if(root==null && subRoot==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode current=q.poll();
            if(current.val==subRoot.val){
                boolean check=check(current,subRoot);
                if(check) return true;
            }
            if(current.left!=null) q.add(current.left);
            if(current.right!=null) q.add(current.right);
        }
        return false;
    }

    boolean check(TreeNode first,TreeNode second){
        if(first==null && second==null) return true;

        if((first==null&& second!=null) || first!=null && second==null) return false;

        if(first.val!=second.val) return false;

        return check(first.left,second.left) && check(first.right,second.right);
    }
}
