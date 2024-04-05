import java.util.ArrayList;
import java.util.List;


//Time complexity=O(n)

public class InorderTraversal {
	public static class TreeNode {

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

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inorderTraversalHelper(root, result);
		return result;
	}

	private static void inorderTraversalHelper(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}

		inorderTraversalHelper(root.left, result);
		result.add(root.val);
		inorderTraversalHelper(root.right, result);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);

		root.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> res = inorderTraversal(root);
		for (Integer integer : res) {
			System.out.print(integer + " ");
		}

	}
}