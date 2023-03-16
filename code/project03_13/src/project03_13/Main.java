package project03_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		A1();
//		A2();
//		A3();
//		A4();
//		A5();
		A6();
	}

	public static void A1() {
		DescriptiveStatistics ds = new DescriptiveStatistics();
		String[][] arr = new String[4][4];
		arr = ds.scanInformation();

		System.out.println("\n과목별 정보");
		ds.printSumBySubject(arr);
		ds.printAverageBySubject(arr);
		ds.printMaxBySubject(arr);
		ds.printMinBySubject(arr);

		System.out.println("\n사람별 정보");
		ds.printSumByPerson(arr);
		ds.printAverageByPerson(arr);
		ds.printMaxByPerson(arr);
		ds.printMinByPerson(arr);
	}

	public static void A2() {

		SpecifiedCharacter cc = new SpecifiedCharacter();
		String[] arr1 = cc.scanCharacter();
		String[] arr2 = cc.scanCharacter();
		System.out.println(cc.countingCharcter(arr1, arr2));

	}

	public static void A3() {
		EncryptionDecryption e = new EncryptionDecryption();
		String[] arr1 = e.scanCharacter();
		String[] arr2 = e.encryption(arr1);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}

	public static void A4() {
		EncryptionDecryption e = new EncryptionDecryption();
		String[] arr1 = e.scanCharacter();
		String[] arr2 = e.decryption(arr1);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}

	public static void A5() {
		SplitAndSort sas = new SplitAndSort();
		ArrayList<String> list = new ArrayList<>();

		list = sas.scanAndSplit();
		Collections.sort(list);
		Collections.reverse(list);
		for (String num : list) {
			System.out.print(num + " ");
		}
	}

	public static void A6() {
		FibonacciNumbers fn = new FibonacciNumbers();
		ArrayList<Integer> list = new ArrayList<>();
		int num = fn.inputNumber();
		
		list = fn.fibonacciElementNumber(num);
		for (int j : list) {
			System.out.print(j + " ");
		}
		
	}
}
