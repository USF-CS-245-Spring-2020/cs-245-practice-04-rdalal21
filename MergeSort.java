public class MergeSort implements SortingAlgorithm {
	 
	public void sort(int[] a) {
		    sort(a, 0, a.length - 1);
		  }
	  private static void sort(int[] a, int start, int end) {

		    // find the middle point to divide the array into two halves
		    int mid = (start + end) / 2;
		    if (start < end) {
		      sort(a, start, mid); //call sort on first half
		      sort(a, mid + 1, end); //call sort on second half
		    }

		    // merge solved pieces to get solution
		    int i = 0, first = start, last = mid + 1;
		    int[] tmp = new int[end - start + 1];

		    while (first <= mid && last <= end) {
		      tmp[i++] = a[first] < a[last] ? a[first++] : a[last++];
		    }
		    while (first <= mid) {
		      tmp[i++] = a[first++];
		    }
		    while (last <= end) {
		      tmp[i++] = a[last++];
		    }
		    i = 0;
		    while (start <= end) {
		      a[start++] = tmp[i++];
		    }
		  }

		}
