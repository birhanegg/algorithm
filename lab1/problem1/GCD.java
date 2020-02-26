package zAlgorithm.lab1.problem1;

public class GCD {

	static int gcd(int m, int n) {
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	public static void main(String[] args) {

		System.out.println(gcd(12, 18));
		System.out.println(gcd(100, 98));
	}
}
