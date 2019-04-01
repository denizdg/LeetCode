// LeetCode # 101

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
    public  boolean isSymmetric(TreeNode root) {

        if(root == null)
			return true;
        
		return isMirror(root.left, root.right);
	}
	
	public  boolean isMirror(TreeNode rootLeft, TreeNode rootRight){
		if(rootLeft == null && rootRight == null)
			return true;

		if(rootLeft != null && rootRight != null && rootLeft.val == rootRight.val)
			return isMirror(rootLeft.left, rootRight.right) && isMirror(rootLeft.right, rootRight.left);
		
		return false;
	}
    
}
