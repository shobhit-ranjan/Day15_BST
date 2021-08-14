
public class MainClass {

	public static void main(String[] args) {

		Tree<Integer> tree = new BST<>();
		tree.add(100);
		tree.add(101);
		tree.add(70);
		tree.add(11);
		tree.add(12);
		tree.add(134);
		tree.add(16);
		tree.add(144);
		tree.add(132);
		tree.inorder();
		tree.preorder();
		tree.search(100);

	}

}
