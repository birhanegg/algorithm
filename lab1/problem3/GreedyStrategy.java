package zAlgorithm.lab1.problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 11;
		int sum = 0;
		List<Integer> filterSets = new ArrayList<>();
		List<Integer> sets = Arrays.asList(1, 2, 3, 4, 5);

		Collections.sort(sets);

		for (int i = 0; i < sets.size(); i++) {
			sum += sets.get(i);
			if (sum < k)
				filterSets.add(sets.get(i));
			else
				break;
		}
		StringBuilder str = new StringBuilder();
		for (Integer filterset : filterSets) {
			str.append("," + filterset);
		}
		System.out.print("[" + str.substring(1, str.length()) + "]");
	}
}