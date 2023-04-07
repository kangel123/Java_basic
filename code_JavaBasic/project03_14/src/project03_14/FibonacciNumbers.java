package project03_14;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumbers {
	public int F0 = 0;
	public int F1 = 1;

	public int inputNumber() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	// Until Fn is less than num
	public ArrayList<Integer> fibonacciUntilNumber(ArrayList<Integer> list, int num) {
		if (list.isEmpty()) {
			list.add(F0);
			list.add(F1);
		} else {
			F0 = list.get(list.size() - 2);
			F1 = list.get(list.size() - 1);
		}
		int F2 = F0 + F1;

		if (F2 > num) {
			return list;
		}
		list.add(F2);

		return fibonacciUntilNumber(list, num);
	}
	
	// Until Fn
	public ArrayList<Integer> fibonacciElementNumber(int num){
		ArrayList<Integer> list = new ArrayList<>();
		int F2;
		list.add(F0);
		if (num == 1)
			return list;

		list.add(F1);
		if (num == 2)
			return list;

		for (int i = 2; i < num; i++) {
			F2 = F0 + F1;
			list.add(F2);
			F0 = F1;
			F1 = F2;
		}
		return list;
	}
}
