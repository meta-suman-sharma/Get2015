package binaryTree;

public class BinaryTree {

	Node root;
	Node binaryRoot;
	int preOrder[] = new int[10];
	int size = 0;
	int postOrder[] = new int[10];

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		//Inserting node in binary tree
		if (node == null) {
			node = new Node(data);
			System.out.println("data placed");
		} else {
			if (data <= node.nodeValue) {
				System.out.println("left");
				node.left = insert(node.left, data);
			} else {
				System.out.println("right");
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	public void inorderTraversal() {
		//public function for in order traversal
		inorderTraversal(root);
	}

	private void inorderTraversal(Node node) {
		//private function for in order traversal
		if (node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.println(node.nodeValue);
		inorderTraversal(node.right);
	}

	public void preorderTravarsal() {
		//public function for preorder traversal
		preorderTravarsal(root);
	}

	private void preorderTravarsal(Node node) {
		//private function for preorder traversal
		if (node == null) {
			return;
		}
		System.out.println(node.nodeValue);
		preOrder[size] = node.nodeValue;
		size++;
		preorderTravarsal(node.left);
		preorderTravarsal(node.right);
	}

	public void postorderTravarsal() {
		//public function for post order traversal
		postorderTravarsal(root);
	}

	private void postorderTravarsal(Node node) {
		//private function for post order traversal
		if (node == null) {
			return;
		}
		postorderTravarsal(node.left);
		postorderTravarsal(node.right);
		System.out.println(node.nodeValue);
		postOrder[size] = node.nodeValue;
	}

	public void insertImage(int data) {
		//public function for inserting image binary tree
		binaryRoot = insertImage(binaryRoot, data);
	}

	private Node insertImage(Node node, int data) {
		//private function for inserting image binary tree
		if (node == null) {
			node = new Node(data);
			System.out.println("Image data placed");
		} else {
			if (data <= node.nodeValue) {
				System.out.println("Image right");
				node.right = insertImage(node.right, data);

			} else {
				System.out.println("Image left");
				node.left = insertImage(node.left, data);
			}
		}
		return node;
	}

	public boolean checkMirrorImageCondition() {
		//public function for checking weather binary trees are mirror image or not
		return checkMirrorImageCondition(root, binaryRoot);
	}

	private boolean checkMirrorImageCondition(Node node, Node nodeImage) {
		//private function for checking weather binary trees are mirror image or not
		int flag = 0;
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			if (preOrder[i] == postOrder[j]) {
				j--;
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return true;

		return false;

	}

}
