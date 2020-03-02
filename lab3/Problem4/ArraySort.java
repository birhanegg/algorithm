package Lab3.Problem4;

import java.util.Arrays;

public class ArraySort {
	
	static int[] sorter(int[] array){
		if (array == null || array.length == 0) return null;
		
		int[] sortedArray = new int[array.length];
		int temp = 0;
		int counter = 0;
		int onez = 0;
		int twoz = 0;
		
		for (int i = 0 ; i < array.length; i ++){//----------------------------This is O(n)
			temp = array[i];
			if (temp == 0){
				sortedArray[counter] = array[i];
				counter++;
			} else if (temp == 1){
				onez++;
			} else if(temp == 2){
				twoz++;
			}
		}
		
		for (int i = counter; i < counter+onez; i++) {//-----------------------This is O(onez+counter) Thus O(n)
			sortedArray[i] = 1;
		}
		
		counter += onez;
		for (int i = counter; i < counter+twoz; i++) {//-----------------------This is O(n-onez-counter) Thus O(n)
			sortedArray[i] = 2;
		}
		return sortedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int[] arr={0,1,2,1,2,0,2,1,0,1,0,2,0};
		int[] sorted = sorter(arr);
		System.out.println(Arrays.toString(sorted));
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution speed: " + (endTime - startTime) + "ms\n");
	}

}
