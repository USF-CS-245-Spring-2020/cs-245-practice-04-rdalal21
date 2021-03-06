public class InsertionSort implements SortingAlgorithm {
	public void sort(int[] a) {
	    int n = a.length;  
        for (int j = 1; j < n; j++) {  
            int key = a[j];  
            int i = j-1;  
            // Move element of array[0..,j-1], that are greater than key to one position ahead of current position
            while ( (i > -1) && ( a[i] > key ) ) {  
                a[i+1] = a[i];  
                i--;  
            }  
            a[i+1] = key;  
        }  
    }  
		
}

