/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if(length==0){
            return null;
        }
        TreeNode root = new TreeNode(nums[length/2]);
        ArrayList<Integer> leftarray = new ArrayList<Integer>();
        ArrayList<Integer> rightarray = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i<(length/2)){
                leftarray.add(nums[i]);
            }else if(i>(length/2)){
                rightarray.add(nums[i]);
            }
        }
        
        root.left = sortedArrayToBST(leftarray.stream().mapToInt(i -> i).toArray());
        root.right = sortedArrayToBST(rightarray.stream().mapToInt(i -> i).toArray());
        return root;
        
    }
}