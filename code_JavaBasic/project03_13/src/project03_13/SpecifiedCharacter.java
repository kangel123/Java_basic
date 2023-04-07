package project03_13;

import java.util.Scanner;

public class SpecifiedCharacter {
	public String[] scanCharacter() {
		Scanner scan = new Scanner(System.in);
		String[] arr = scan.nextLine().split("");
		return arr;
	}

	public int countingCharcter(String[] arr1, String[] arr2) {
		int cnt = 0;
		int i, j;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (i == arr1.length)
					return cnt;
				
				if (!arr1[i].equals(arr2[j])) {
					break;
				} else if (arr1[i].equals(arr2[j]) && j == arr2.length - 1) {
					cnt++;
				} else {
					i++;
				}
			}
		}
		return cnt;
	}
}
