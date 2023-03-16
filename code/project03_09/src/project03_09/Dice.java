package project03_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Dice {
	public static int makeDice() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static ArrayList<Integer> sumOfDice(ArrayList<Integer> list, int n) {
		ArrayList<Integer> list2 = new ArrayList<>();

		if (n == 0)
			return list;
		if(list.size()==0) {
			for (int i = 1; i < 7; i++) {
				list.add(i);
			}
			return sumOfDice(list, n - 1);
		}
		
		for (int j = 0; j < list.size(); j++) {
			for (int i = 1; i < 7; i++) {
				list2.add(list.get(j) + i);
			}
		}
		
		return sumOfDice(list2, n - 1);
	}

	
	public static ArrayList<String> caseOfDice(ArrayList<String> list, int n) {
		ArrayList<String> list2 = new ArrayList<>();
		
		//종료 시
		if (n == 0) {
			for (int j = 0; j < list.size(); j++) {
				list2.add(list.get(j)+")");
			}
			return list2;
		}
		
		//시작 시
		if(list.size()==0) {
			for (int i = 1; i < 7; i++) {
				list.add("("+i);
			}
			return caseOfDice(list, n - 1);
		}
		
		// 2번 이상 시
		for (int j = 0; j < list.size(); j++) {
			for (int i = 1; i < 7; i++) {
				list2.add(list.get(j) +", " +i);
			}
		}
		return caseOfDice(list2, n - 1);
	}
	
	
	
	public static ArrayList<String> collectNumber(ArrayList<Integer> list, ArrayList<String> list2, int m) {
		ArrayList<String> list3 = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == m)
				list3.add(list2.get(i));
		}
		return list3;
	}
}
