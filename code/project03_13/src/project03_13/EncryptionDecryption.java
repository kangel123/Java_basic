package project03_13;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptionDecryption {
	String[] original = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z" };
	String[] encrypted = { "z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i",
			"h", "g", "f", "e", "d", "c", "b", "a" };

	public String[] scanCharacter() {
		System.out.print("입력할 단어 (소문자 영어만 가능) : ");
		Scanner scan = new Scanner(System.in);
		String[] arr = scan.next().split("");

		return arr;
	}

	public String[] encryption(String[] arr) {
		int n = -1;
		for (int i = 0; i < arr.length; i++) {
			n = Arrays.asList(original).indexOf(arr[i]);
			arr[i] = encrypted[n];
		}
		return arr;
	}
	
	public String[] decryption(String[] arr) {
		int n = -1;
		for (int i = 0; i < arr.length; i++) {
			n = Arrays.asList(encrypted).indexOf(arr[i]);
			arr[i] = original[n];
		}
		return arr;
	}
}
