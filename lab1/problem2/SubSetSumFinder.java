package zAlgorithm.lab1.problem2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSumFinder {

	public static void main(String[] args) {
		List<Integer> set = Arrays.asList(1, 2, 5, 8, 3, 4, 6, 7);
		int k = 21;
		System.out.println("The statement set have a subset that gives sum " + k + " is " + isSubSetSumFound(set, k));
	}

	static boolean isSubSetSumFound(List<Integer> set, int k) {
		List<Integer> nList = new ArrayList<>();
		if (set.isEmpty() || set == null) {
			return false;
		}

		for (int s : set) {
			if (s <= k) {
				if (s == k) {
					return true;
				}
				nList.add(s);
			}

		}

		for (int i = 0; i < nList.size(); i++) {
			int s = k - nList.get(i);
			List<Integer> nL = new ArrayList<>();
			for (int j = 0; j < nList.size(); j++) {
				if (j != i) {
					nL.add(nList.get(j));
				}
			}
			return isSubSetSumFound(nL, s);
		}
		return true;
	}
}
