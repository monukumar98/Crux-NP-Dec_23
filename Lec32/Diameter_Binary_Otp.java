package Lec32;

public class Diameter_Binary_Otp {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;
		}

		public DiameterPair diameter(TreeNode root) {
			if (root == null) {
				return new DiameterPair();
			}
			DiameterPair ldp = diameter(root.left);
			DiameterPair rdp = diameter(root.right);
			DiameterPair sdp = new DiameterPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			int sd = ldp.ht + rdp.ht + 2;
			sdp.d = Math.max(sd, Math.max(rdp.d, ldp.d));
			return sdp;

		}

		class DiameterPair {
			int ht = -1;
			int d = 0;
		}
	}
}
