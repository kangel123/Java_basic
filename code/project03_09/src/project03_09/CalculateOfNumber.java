package project03_09;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateOfNumber {
	public static ArrayList<Integer> getMultiples(int i, int j) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int n = 1; n * j <= i; n++) {
			list.add(n * j);
		}
		return list;
	}

	public static int sumOfList(ArrayList<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}

	public static int inputOfNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static float inputOfGrade(ArrayList<Integer> list, int sumUnit) {
		double j;
		double sumGrade=0;
		for  (int i=0; i<list.size();i++) {
			System.out.print("Enter grade(unit "+(i+1)+" : "+list.get(i)+") :");
			Scanner scanner = new Scanner(System.in);
			switch (scanner.next()) {
			case "A+" : sumGrade+=(list.get(i)*4.5);break;
			case "A0" : sumGrade+=(list.get(i)*4);break;
			case "A" : sumGrade+=(list.get(i)*4);break;
			case "B+" : sumGrade+=(list.get(i)*3.5);break;
			case "B0" : sumGrade+=(list.get(i)*3);break;
			case "B" : sumGrade+=(list.get(i)*3);break;
			case "C+" : sumGrade+=(list.get(i)*2.5);break;
			case "C0" : sumGrade+=(list.get(i)*2);break;
			case "C" : sumGrade+=(list.get(i)*2);break;
			case "D+" : sumGrade+=(list.get(i)*1.5);break;
			case "D0" : sumGrade+=(list.get(i)*1);break;
			case "D" : sumGrade+=(list.get(i)*1);break;
			case "F" : sumGrade+=(list.get(i)*0.5);break;
			default: return 0;
			}
		}

		return (float)sumGrade/sumUnit;
	}

}
