/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        return 0;
        
        return getLeftSum(root,false);
    }
    
    public int getLeftSum(TreeNode root,boolean isLeft){
        if(root.left==null&&root.right==null&&isLeft){
            return root.val;
        }
        int sum= 0;
        if(root.left!=null){
            sum+=getLeftSum(root.left,true);
        }
        
        if(root.right!=null){
            sum+=getLeftSum(root.right,false);
        }
        return sum;
    }
}