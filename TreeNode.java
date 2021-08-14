
class TreeNode<T extends Comparable<T>> {

	T data;
	TreeNode<T> left, right;

	public TreeNode(T data) {

		this.data = data;
		left = null;
		right = null;
	}

}
