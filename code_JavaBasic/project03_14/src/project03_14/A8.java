package project03_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			String word1 = scan.next();
			String word2 = scan.next();
			System.out.println(countString(word1));
			System.out.println(countString(word2));
			System.out.println(comparingString(word1, word2));
		} catch (InputMismatchException e) {
			System.out.println("error : 입력 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error : 인덱스 범위 초과 오류");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static int countString(String str) {
		return str.length();
	}

	public static int comparingString(String str1, String str2) {
		int count = 0;
		String[] arr1=str1.split("");
		String[] arr2=str2.split("");

		boolean pass= false;
		for (int i = 0; i < arr1.length;i++) {
			for(int j =0 ;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					arr1[i]="";
					arr2[j]="";
					count++;
				}
			}
		}
		return count;
	}

}
