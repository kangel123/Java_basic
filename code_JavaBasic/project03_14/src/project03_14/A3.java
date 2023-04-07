package project03_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<>();
		HashSet<Integer> score = new HashSet<>();

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("name");
			for (int i = 0; i < 10; i++) {
				name.add(scan.next());
			}
		} catch (InputMismatchException e) {
			System.out.println("Only String");
		} catch (Exception e) {
			System.out.println("error");
		}

		try {
			System.out.println("score");
			for (int i = 0; i < 10; i++) {
				score.add(scan.nextInt());
			}
		} catch (InputMismatchException e) {
			System.out.println("Only Int");
		} catch (Exception e) {
			System.out.println("error");
		}

		ArrayList<String> list1 = new ArrayList<>(name);
		try {
			Collections.sort(list1);
			for (String num : list1)
				System.out.print(num + " ");
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("range error(1)");
		} catch (Exception e) {
			System.out.println("error");
		}

		try {
			Collections.reverse(list1);
			for (String num : list1)
				System.out.print(num + " ");
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("range error(2)");
		} catch (Exception e) {
			System.out.println("error");
		}

		ArrayList<Integer> list2 = new ArrayList<>(score);
		try {
			Collections.sort(list2);
			for (int num : list2)
				System.out.print(num + " ");
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("range error(3)");
		} catch (Exception e) {
			System.out.println("error");
		}

		try {
			Collections.reverse(list2);
			for (int num : list2)
				System.out.print(num + " ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("range error(4)");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
