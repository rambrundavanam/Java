package algorithms;

public class MergeSort {
	
	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	public static void merge(int[] array, int left, int mid, int right) {
		// sizes of sub arrays
		int n1 = mid + 1 - left;
		int n2 = right - mid;

		int[] Left = new int[n1];
		int[] Right = new int[n2];

		for (int i = 0; i < n1; i++) {
			Left[i] = array[left + i];
		}

		for (int i = 0; i < n2; i++) {
			Right[i] = array[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				array[k] = Left[i];
				i++;
			} else {
				array[k] = Right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = Left[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}
	
	public static void main(String args[]){
		int array [] = {100,122,23,21,44,1,221,45,26,14};
	mergeSort(array,0,array.length-1);
	for(int i : array){
		System.out.println(i);
	}
	}
}
