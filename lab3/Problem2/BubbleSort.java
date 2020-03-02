package Lab3.Problem2;

import java.util.Arrays;

public class BubbleSort {
	
	//The array is already sort
	
		public static int[] bubbleSort(int[] arr) {
			boolean sorted = true;
			
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr.length - 1; j++) { //Run n-times 

					if (arr[j + 1] < arr[j]) {
						arr = swap(arr, j, j + 1);
						sorted = false;
					}
				}

				if (sorted) // The array is already sorted so it will be always true so the running time is O(n)
					break;
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
		int[] arr = new int[] { 1, 2, 3, 4, 5,6,7,9,10,11,16,18,23 };
		//int[] arr1 = new int[] { 5, 3, 7, 1, 2, 6,4,11,23,18,16,10,9};
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSort(arr)));
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution speed: " + (endTime - startTime) + "ms\n");
	}

}
