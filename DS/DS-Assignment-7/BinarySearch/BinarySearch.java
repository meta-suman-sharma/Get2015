package BinarySearch;

public class BinarySearch {
	int binaryArray[];
	int index = -1;

	public BinarySearch(int noOfElement) {
		//constructor
		binaryArray = new int[noOfElement];
	}

	void addInArray(int item[]) {
		//method adding elements to array
		binaryArray = item;
	}

	int leftOccuranceByBinarySearch(int elementSearching, int startingIndex,
			int LastIndex) {
		//method searching an element in array by binary search 
		if (startingIndex <= LastIndex) {

			int mid = (startingIndex + LastIndex) / 2;

			if (binaryArray[mid] == elementSearching) {
				index = mid;
		        //finding most left  occurred searched element by recursion
			//	leftOccuranceByBinarySearch(elementSearching, startingIndex,mid - 1);
			//finding most left  occurred searched element by Loop 
			while(binaryArray[index-1]==elementSearching  )
				{
					index--;
					if(index==0)
					{
						break;
					}
					
				}

			} else if (binaryArray[mid] < elementSearching)

				leftOccuranceByBinarySearch(elementSearching, mid + 1,
						LastIndex);
			else

				leftOccuranceByBinarySearch(elementSearching, startingIndex,
						mid - 1);
		}
		return index;
	}

}
