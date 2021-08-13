
public class BST<T extends Comparable<T>> implements Tree<T> {

	TreeNode<T> root;

	BST() {
		this.root = null;
	}

	@Override
	public void inorder() {
		System.out.println("Inorder is");
		inorderTraverse(root);
		System.out.println();

	}

	private void inorderTraverse(TreeNode<T> root) {
		if (root == null)
			return;
		inorderTraverse(root.left);
		System.out.println(root.data + "  ");
		inorderTraverse(root.right);

	}

	@Override
	public void preorder() {
		System.out.println("preorder is");
		System.out.println(root.data + " ");
		inorderTraverse(root.left);
		inorderTraverse(root.right);

	}

	@Override
	public boolean isEmpty() {

		return root == null;
	}

	@Override
	public void add(T data) {

		root = addNodeIntoTree(root, data);

	}

	private TreeNode<T> addNodeIntoTree(TreeNode<T> root, T data) {

		if (root == null) {
			return new TreeNode<T>(data);
		} else if (data.compareTo(root.data) > 0) {
			root.right = addNodeIntoTree(root.right, data);

		} else {
			root.left = addNodeIntoTree(root.left, data);
		}
		return root;

	}

}
