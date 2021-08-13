
interface Tree<T extends Comparable<T>> {

	void add(T data);

	void inorder();

	void preorder();

	boolean isEmpty();

}