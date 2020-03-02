package Lab3.Problem3;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		
		for (int i = arr.length; i >= 0; i--) {
			int newn = 0;
			
			for (int j = 1; j < n - 1; j++) {
				
				if (arr[j - 1] > arr[j]) {
					arr = swap(arr, j, j - 1);
					newn = i;
				}
			}

			n = newn;
		}
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int[] arr = new int[] { 5, 3, 7, 1, 2, 6,4,11,23,18,16,10,9 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSort(arr)));
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution speed: " + (endTime - startTime) + "ms\n");
	}

}
