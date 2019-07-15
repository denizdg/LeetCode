//Leetcode #108

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
        if(nums == null || nums.length == 0)
			return null;
		
		return recursiveSortedArray(nums, 0, nums.length - 1);
    }
    
    public TreeNode recursiveSortedArray(int[] nums, int start, int end){
		
		if(start > end)
			return null;
		
		int mid = (start + end) / 2;
        //int mid = start + (end - start) / 2;
		
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = recursiveSortedArray(nums, start, mid - 1);
		root.right = recursiveSortedArray(nums, mid + 1, end);
		
		return root;
	}
}
