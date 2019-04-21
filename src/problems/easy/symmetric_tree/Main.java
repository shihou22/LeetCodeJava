package problems.easy.symmetric_tree;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean res = false;
		TreeNode wk = null;

		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = new TreeNode(3);
		//		wk.right.left = new TreeNode(3);
		//		res = new Main().isSymmetric(wk);//false
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = new TreeNode(3);
		//		wk.right.right = new TreeNode(3);
		//		res = new Main().isSymmetric(wk);//true
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(2);
		//		wk.left.left = null;
		//		wk.left.right = new TreeNode(3);
		//		wk.right.left = new TreeNode(3);
		//		res = new Main().isSymmetric(wk);//true
		//		System.out.println(res);
		//
		//		wk = new TreeNode(1);
		//		wk.left = new TreeNode(2);
		//		wk.right = new TreeNode(3);
		//		res = new Main().isSymmetric(wk);//false
		//		System.out.println(res);

		wk = new TreeNode(2);
		wk.left = new TreeNode(3);
		wk.right = new TreeNode(3);
		wk.left.left = new TreeNode(4);
		wk.left.right = new TreeNode(5);
		wk.right.left = new TreeNode(4);
		wk.right.right = new TreeNode(5);
		res = new Main().isSymmetric(wk);//false
		System.out.println(res);
	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		if (root.left == null && root.right == null) {
			return true;
		} else if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
			return false;
		}
		boolean res1 = root.left.val == root.right.val;
		boolean res2 = isSymmetricCenter(root.left, root.right);
		return res1 && res2;

	}

	private boolean isSymmetricCenter(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if ((left != null && right == null) || (left == null && right != null)) {
			return false;
		}
		boolean res1 = left.val == right.val;
		if (!res1) {
			return false;
		}
		if ((left.right != null && right.left == null) || (left.right == null && right.left != null)) {
			return false;
		}
		if ((left.left != null && right.right == null) || (left.left == null && right.right != null)) {
			return false;
		}
		boolean res2 = isSymmetricCenter(left.right, right.left);
		boolean res3 = isSymmetricCenter(left.left, right.right);
		return res1 && res2 && res3;
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