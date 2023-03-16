package project03_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Project03_09 {

	public static void main(String[] args) {
		A1();
//		A2();
//		A3();
//		A4();
//		A5();
//		A6();
//		A7();
//		A8();
	}

	public static void A1() {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		Dice dice = new Dice();
		int n=dice.makeDice();
		int m=dice.makeDice();
		list1=dice.sumOfDice(list1, n);
		list2=dice.caseOfDice(list2, n);
		result=dice.collectNumber(list1, list2, m);
		for(int i=0 ;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}

	public static void A2() {
		BankingSystem bs = new BankingSystem();
		int money = 0;
		for (int i = 0; i < 3; i++) {
			bs.showMenu();
			money = bs.runBanking(money);
			System.out.println(money);
		}
	}

	public static void A3() {
		CalculateOfNumber calculater = new CalculateOfNumber();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n, m, sum;
		float result;

		n = scanner.nextInt();
		m = scanner.nextInt();
		list = calculater.getMultiples(n, m);
		sum = calculater.sumOfList(list);
		System.out.print("Sum : " + sum + "\nList : " + list);
	}

	public static void A4() {
		EncryptionCode ec = new EncryptionCode();

		for (int i = 0; i < 2; i++) {
			ec.showMenu();
			System.out.println(ec.chooseMenu());
			System.out.println();
		}
	}

	public static void A5() {
		PassWord pw = new PassWord();
		do {
			pw.ruleOfPassword();
		} while (!pw.makePassword());
	}

	public static void A6() {
		CountCharacter cc = new CountCharacter();
		String str;
		int[] result = new int[2];
		for (int i = 0; i < 2; i++) {
			str = cc.inputString();
			result = cc.consonAndVowel(str);
			System.out.println("Num. of Consonant : " + result[0]);
			System.out.println("Num. of Vowels : " + result[1]);
		}
	}

	public static void A7() {
		CalculateOfNumber calculater = new CalculateOfNumber();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Float> list2 = new ArrayList<>();
		int count, n, sum = 0;
		float result;

		System.out.print("Number of subjects : ");
		count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print("Enter unit " + (i + 1) + " : ");
			n = calculater.inputOfNumber();
			sum += n;
			list1.add(n);
		}
		while (true) {
			result = calculater.inputOfGrade(list1, sum);
			if (result != 0) {
				break;
			} else {
				System.out.println("\nEntered grade incorrectly\n" + "Enter grade again");
			}
		}
		System.out.println(result);
	}
	
	public static void A8() {
		EncodingSystem es = new EncodingSystem();

		for (int i = 0; i < 2; i++) {
			es.showMenu();
			System.out.println(es.chooseMenu());
			System.out.println();
		}
	}
}
