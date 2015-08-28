package binaryTree;

public class Node {
	int nodeValue;
	Node left;
	Node right;

	public Node() {
		//Default Constructor
		left = null;
		right = null;
	}

	public Node(int nodeValue) {
		//Parameterized constructor
		this.nodeValue = nodeValue;
		left = null;
		right = null;
	}

}
