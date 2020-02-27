package zAlgorithm.lab1.problem1;

public class GCD {

	static int gcd(int m, int n) {
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

        static int gcd_iteration(int number1, int number2) {
		int result = 1;
		int smaller = number2 > number1 ? number1 : number2;
		for (int i = 2; i <= smaller / 2; i++) {
			if (number2 % i == 0 && number1 % i == 0)
				result = i;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(gcd(12, 18));
		System.out.println(gcd(100, 98));
	}
}
