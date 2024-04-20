package Lec31;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			View(root, 1, ll);
			return ll;
		}

		int max_depth = 0;

		public void View(TreeNode root, int curr_level, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (curr_level > max_depth) {
				ll.add(root.val);
				max_depth = curr_level;
			}
			View(root.right, curr_level + 1, ll);
			View(root.left, curr_level + 1, ll);

		}
	}
}
