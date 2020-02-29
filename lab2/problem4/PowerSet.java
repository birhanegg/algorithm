package zAlgorithm.lab2.problem4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {

	public static <T> List<Set<T>> powerSet(List<T> X) {
		List<Set<T>> P = new ArrayList<Set<T>>();
		Set<T> S = new HashSet<T>();
		P.add(S);
		if (X.isEmpty()) {
			return P;
		} else {
			while (!X.isEmpty()) {
				T f = X.remove(0);
				List<Set<T>> temp = new ArrayList<Set<T>>();
				for (Set<T> x : P) { 
					temp.add(x);
				}
				for (Set<T> x : temp) {
					S = new HashSet<T>();
					S.add(f);
					S.addAll(x);
					P.add(S);
				}
			}
		}
		return P;
	}

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(PowerSet.powerSet(list));

	}

}