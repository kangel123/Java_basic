package project03_08;

public class CountingOfNumber {
	public static int Positive(int n) {
		if (n > 0)
			return 1;
		else
			return 0;
	}

	public static int Negative(int n) {
		if (n < 0)
			return 1;
		else
			return 0;
	}

	public static int Odd(int n) {
		if (n % 2 == 1)
			return 1;
		else
			return 0;
	}

	public static int Even(int n) {
		if (n % 2 == 1)
			return 0;
		else
			return 1;
	}

	public static int NumberOfAlphabet(String a, String[] str) {
		int count = 0;
		for (int n = 0; n < str.length; n++) {
			if (str[n].equals(a)) {
				count++;
			}
		}
		return count;
	}
}
