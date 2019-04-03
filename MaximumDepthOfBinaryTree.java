// LeetCode #104

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
    public int maxDepth(TreeNode root) {
        
        int depth = 0;
		
		if(root == null) 
			return depth;

		int leftCount = maxDepth(root.left);
		int rightCount = maxDepth(root.right);
		
		if(leftCount > rightCount)
			depth = leftCount + 1;
		else
			depth = rightCount + 1;
		
		return depth;
    
    /* Or after null check simply return :
    return 1 + Math.Max(maxDepth(root.left), maxDepth(root.right));
    */
    
    }
}
