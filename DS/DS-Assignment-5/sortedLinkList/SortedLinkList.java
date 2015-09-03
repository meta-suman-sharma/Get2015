package sortedLinkList;

import java.util.LinkedList;

public class SortedLinkList {
	int index = 0;
	// using linkedList collection for storing values in sorted order
	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public void insertInToSortedLinkList(int index, int item) {
		// Insert element in sorted order
		if (index == linkedList.size()) {
			linkedList.add(item);
		} else if ((int) linkedList.get(index) < item
				&& (index + 1) <= linkedList.size()) {
			insertInToSortedLinkList(index + 1, item);
		} else {
			linkedList.add(index, item);
		}
	}

	public void displayList() {
		// Display linked List
		java.util.Iterator<Integer> iterator = linkedList.iterator();
		System.out.print("start");

		while (iterator.hasNext()) {
			int data = iterator.next();
			System.out.print("->" + data);
		}
		System.out.println("\n");
	}

}
