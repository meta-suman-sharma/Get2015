package binaryTree;

import java.util.Scanner;

public class BinaryMainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree();
		BinaryTree binaryImageTree = new BinaryTree();

		int dataOfTree;

		while (true) {
			//Performing binary tree operation 
			System.out.println("\n***Menu***\n1. Create Binary Tree"
					+ "\n2. Create another binary tree for image condition"
					+ "\n3. Inorder Traversal"
					+ "\n4. Preorder Traversal"
					+ "\n5. Post order Traversal"
					+ "\n6. Check Mirror image or not" + "\n7. Exit");
			System.out.println("Enter Your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				//Create binary tree
				System.out.print("Enter a value : ");
				dataOfTree = sc.nextInt();
				binaryTree.insert(dataOfTree);
				break;

			case 2:
				//Create another binary tree for checking image condition
				System.out.print("Enter a value : ");
				dataOfTree = sc.nextInt();
				binaryImageTree.insertImage(dataOfTree);
				break;

			case 3:
				//In Order Traversal
				binaryTree.inorderTraversal();
				break;

			case 4:
				//Preorder Traversal
				binaryTree.preorderTravarsal();
				break;

			case 5:
				binaryTree.postorderTravarsal();
				break;

			case 6:
				//Post order Traversal
				boolean status = binaryTree.checkMirrorImageCondition();
				if (status) {
					System.out.println("Both trees are  Image to each other");
				} else {
					System.out.println("Trees are not Image to each other");
				}
				break;

			case 7:
				//exit application
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

}
