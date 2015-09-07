package Sorting;

import java.util.ArrayList;

public class ComparisonSorting extends Sorting {

	// class having two comparison method bubble sorting and quick sorting
	int size = 0;

	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

		// sort method choosing the sorting type according to user input
		size = arrayList.size();

		if (size <= 10)
			return bubbleSort(arrayList);
		else {	
			return quickSort(arrayList, 0, size-1);
		}
	}

	public ArrayList<Integer> quickSort(ArrayList<Integer> arrayList, int lb,
			int ub) {
		int partitionIndex = partition(arrayList, lb, ub);

		if (lb < partitionIndex - 1) {
			// Recursively call Quick sort to sort left part of the array
			quickSort(arrayList, lb, partitionIndex - 1);
		}

		if (ub > partitionIndex) {
			// Recursively call Quick sort to sort right part of the array
			quickSort(arrayList, partitionIndex+1, ub);
		}
		return arrayList;
	}

	private int partition(ArrayList<Integer> arrayList, int initialIndex,
			int lastIndex) {
		//Method to sort partitions
		int pivotIndex = initialIndex;
		int storeIndex = pivotIndex + 1;

		for (int i = pivotIndex + 1; i <= lastIndex; i++) {
			if (arrayList.get(i) < arrayList.get(pivotIndex)) {
				// swap element at position i and storeIndex
				Integer t = arrayList.get(i);
				arrayList.set(i, arrayList.get(storeIndex));
				arrayList.set(storeIndex, t);
				storeIndex++;
			}
		}
		//swapping
		Integer i = arrayList.get(pivotIndex);
		arrayList.set(pivotIndex, arrayList.get(storeIndex - 1));
		arrayList.set(storeIndex - 1, i);
		int partitionIndex = storeIndex - 1;
		return partitionIndex;

	}

	private ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList) {

		// Bubble sorting logic
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				// check which element greater at position j and j+1
				if (arrayList.get(j) > arrayList.get(j + 1)) {
					// swap element at position j and j+1
					int temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(j + 1));
					arrayList.set(j + 1, temp);
				}
			}
		}
		return arrayList;
	}

}
