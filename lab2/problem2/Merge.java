package zAlgorithm.lab2.problem2;

import java.util.Arrays;

public class Merge {

	private static int[] merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, pos = 0;
		int[] arr = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j])
				arr[pos++] = arr1[i++];
			else
				arr[pos++] = arr2[j++];
		}

		while (i < arr1.length) {
			arr[pos++] = arr1[i++];
		}

		while (j < arr2.length) {
			arr[pos++] = arr2[j++];
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 8, 17 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };

		System.out.println(Arrays.toString(merge(arr1, arr2)));
		
		//output : [1, 2, 4, 4, 5, 8, 8, 11, 13, 17, 21, 23, 25]
	}

}
