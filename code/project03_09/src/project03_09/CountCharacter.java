package project03_09;

import java.util.Scanner;

public class CountCharacter {
	public static String inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input sentence : ");
		return scanner.nextLine();
	}

	public static int[] consonAndVowel(String str) {
		int consonant = 0, vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) == 65 || (int) str.charAt(i) == 69 || (int) str.charAt(i) == 73
					|| (int) str.charAt(i) == 79 || (int) str.charAt(i) == 85 || (int) str.charAt(i) == 97
					|| (int) str.charAt(i) == 101 || (int) str.charAt(i) == 105 || (int) str.charAt(i) == 111
					|| (int) str.charAt(i) == 117) {
				vowel++;
			} else if ((64 < (int) str.charAt(i) && (int) str.charAt(i) < 91)
					|| (96 < (int) str.charAt(i) && (int) str.charAt(i) < 123)) {
				consonant++;
			}
		}
		int[] result = { consonant, vowel };
		return result;
	}
}
