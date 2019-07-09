//Leetcode #107
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (root == null)
			return result;

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> levelList = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				levelList.add(curr.val);

				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}

			}

			result.add(0, levelList);

		}

		return result;

	}

}
