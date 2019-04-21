package problems.easy.same_tree;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean res = false;
		TreeNode wk = null;
		TreeNode wk2 = null;
		wk = new TreeNode(1);
		wk.left = new TreeNode(2);
		wk.right = new TreeNode(3);
		wk2 = new TreeNode(1);
		wk2.left = new TreeNode(2);
		wk2.right = new TreeNode(3);
		res = new Main().isSameTree(wk, wk2);//true
		System.out.println(res);

		wk = new TreeNode(1);
		wk.left = new TreeNode(2);
		wk2 = new TreeNode(1);
		wk2.right = new TreeNode(2);
		res = new Main().isSameTree(wk, wk2);//false
		System.out.println(res);

		wk = new TreeNode(1);
		wk.left = new TreeNode(2);
		wk.right = new TreeNode(3);
		wk2 = new TreeNode(1);
		wk2.left = new TreeNode(3);
		wk2.right = new TreeNode(2);
		res = new Main().isSameTree(wk, wk2);//true
		System.out.println(res);
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		} else if ((p != null && q == null) || (p == null && q != null)) {
			return false;
		}

		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

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