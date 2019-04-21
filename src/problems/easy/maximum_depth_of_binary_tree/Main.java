package problems.easy.maximum_depth_of_binary_tree;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		TreeNode wk = null;

		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = new TreeNode(3);
		//		wk.right.left = new TreeNode(3);
		//		res = new Main().maxDepth(wk);//false
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = new TreeNode(3);
		//		wk.right.right = new TreeNode(3);
		//		res = new Main().maxDepth(wk);//true
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = null;
		//		wk.left.right = new TreeNode(3);
		//		wk.right.left = new TreeNode(3);
		//		res = new Main().maxDepth(wk);//true
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(3);
		//		res = new Main().maxDepth(wk);//false
		//		System.out.println(res);

		wk = new TreeNode(2);
		wk.left = new TreeNode(3);
		wk.right = new TreeNode(3);
		wk.left.left = new TreeNode(4);
		wk.left.right = new TreeNode(5);
		wk.right.left = new TreeNode(4);
		wk.right.right = new TreeNode(5);
		res = new Main().maxDepth(wk);//false
		System.out.println(res);
	}

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}
		return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
	}

	public int maxDepthOrigin(TreeNode root) {

		if (root == null) {
			return 0;
		}
		return chkDepthOrigin(root.left, root.right, 1);
	}

	private int chkDepthOrigin(TreeNode left, TreeNode right, int depth) {
		if (left == null && right == null) {
			return depth;
		}
		int res = depth;
		//		if (left != null) {
		//			int wk = chkDepthOrigin(left.left, left.right, depth + 1);
		//			res = Math.max(wk, res);
		//		}
		//		if (right != null) {
		//			int wk = chkDepthOrigin(right.left, right.right, depth + 1);
		//			res = Math.max(wk, res);
		//		}
		return res;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
