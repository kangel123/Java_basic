package project03_10;

import java.util.ArrayList;
import java.util.Scanner;

public class StringComparison {
	public static String scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("비교할 단어를 적으시오 : ");
		return scanner.next();
	}

	public boolean comparison(String str1, String str2) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1 = stringToList(str1);
		list2 = stringToList(str2);
		String a;
		
		if (list1.size() != list2.size())
			return false;
		for (int i = 0; i < list1.size(); i++) {
			a = list1.get(i);
			if (list2.contains(a)) {
				list2.remove(String.valueOf(a));
			} else {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<String> stringToList(String str) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			list.add(Character.toString(str.charAt(i)));
		}
		return list;
	}
}
