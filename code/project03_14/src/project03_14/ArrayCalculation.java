package project03_14;

import java.util.ArrayList;

public class ArrayCalculation {
	public static int Max(ArrayList<Integer> a) {
		int k = 0;
		for (int i = 0; i < a.size(); i++) {
			if (k < a.get(i))
				k = a.get(i);
		}
		return k;
	}

	public static int Min(ArrayList<Integer> a) {
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < a.size(); i++) {
			if (min > a.get(i)) {
				min = a.get(i);
			}

		}
		return (int) min;
	}

	public static int Mean(ArrayList<Integer> a) {
		int k = 0;
		for (int i = 0; i < a.size(); i++) {
			k += a.get(i);
		}
		return k / a.size();
	}
}
