
public class QuickSort implements SortingAlgorithm {
	private int input[]; 
	private int length; 
	public void sort(int[] a) {
		//check for empty or null array
		if (a == null || a.length == 0) {
			return;
		}
		this.input = a;
		length = a.length;
		quickSort(0, length - 1);
	}
	private void quickSort(int low, int high) {
		int i = low;
		int j = high;
		//Get the pivot element from the middle of the list
		int pivot = input[low + (high - low) / 2];
		// make left <pivot and right >pivot
		while (i <= j) {
			//check until all values on left side array are lower than pivot
			while (input[i] < pivot) {
				 i++;
			}
			//check until all values on left side array are greater than pivot
			while (input[j] > pivot) {
                j--;
            }
			//compare values from both side of the list to see if need swap, if swapped move the iterator on both lists
			if (i <= j) {
                swap(i, j);
                i++;
                j--;
		}
		
	}
		// recursive operation to sort two sub arrays
		if (low < j) {
            quickSort(low, j);
		}
		if (i < high) {
			quickSort(i, high);
			}
		}
	//swap method to do the value swap
	private void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
		}
	}


