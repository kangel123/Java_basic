package project03_13;

import java.util.Scanner;

public class DescriptiveStatistics {

	public String[][] scanInformation() {
		Scanner scan = new Scanner(System.in);
		String[][] arr = new String[5][4];
		arr[0][0] = "이름";
		arr[0][1] = "국어";
		arr[0][2] = "영여";
		arr[0][3] = "수학";

		for (int i = 1; i < arr.length; i++) {
			System.out.println(i + "번째 사람");
			for (int j = 0; j < arr[i].length; j++) {
				switch (j) {
				case 0:
					System.out.print("이름 : ");
					break;
				case 1:
					System.out.print("국어 : ");
					break;
				case 2:
					System.out.print("영어 : ");
					break;
				case 3:
					System.out.print("수학 : ");
					break;
				default:
					break;
				}
				arr[i][j] = scan.next();
			}
		}
		scan.close();
		return arr;
	}
//
//	// 미완료
//	public String[][] allInformation(String[][] arr) {
//		int i, j, n, m, k=4;
	
//		i = arr.length;
//		j = arr[0].length;
//		String[][] arr1 = new String[i + k][j + k];
//		// Keep existing information
//		for (n = 0; n < i; n++) {
//			for (m = 0; m < j; m++) {
//				arr1[n][m] = arr[n][m];
//			}
//		}
//		System.out.println();
//		
//		
//		return arr1;
//	}
	
	public void printSumBySubject(String[][] arr) {
		for (int j = 1; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 1; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i][j]);
			}
			switch (j) {
			case 1:
				System.out.print("국어 총점 : ");
				break;
			case 2:
				System.out.print("영어 총점 : ");
				break;
			case 3:
				System.out.print("수학 총점 : ");
				break;
			default:
				break;
			}
			System.out.println(sum);
		}
	}

	public void printAverageBySubject(String[][] arr) {
		for (int j = 1; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 1; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i][j]);
			}
			switch (j) {
			case 1:
				System.out.print("국어 평균 : ");
				break;
			case 2:
				System.out.print("영어 평균 : ");
				break;
			case 3:
				System.out.print("수학 평균 : ");
				break;
			default:
				break;
			}
			System.out.println(sum / 4);
		}
	}

	public void printMaxBySubject(String[][] arr) {
		for (int j = 1; j < arr[0].length; j++) {
			int k = 0;
			for (int i = 1; i < arr.length; i++) {
				if (k < Integer.parseInt(arr[i][j])) {
					k = Integer.parseInt(arr[i][j]);
				}
			}
			switch (j) {
			case 1:
				System.out.print("국어 최대값 : ");
				break;
			case 2:
				System.out.print("영어 최대값 : ");
				break;
			case 3:
				System.out.print("수학 최대값 : ");
				break;
			default:
				break;
			}
			System.out.println(k);
		}
	}

	public void printMinBySubject(String[][] arr) {
		for (int j = 1; j < arr[0].length; j++) {
			double k = Double.POSITIVE_INFINITY;
			for (int i = 1; i < arr.length; i++) {
				if (k > Integer.parseInt(arr[i][j])) {
					k = Integer.parseInt(arr[i][j]);
				}
			}
			switch (j) {
			case 1:
				System.out.print("국어 최소값 : ");
				break;
			case 2:
				System.out.print("영어 최소값 : ");
				break;
			case 3:
				System.out.print("수학 최소값 : ");
				break;
			default:
				break;
			}
			System.out.println(k);
		}
	}

	public void printSumByPerson(String[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			int sum = 0;
			for (int j = 1; j < arr[i].length; j++) {
				sum += Integer.parseInt(arr[i][j]);
			}
			System.out.println(arr[i][0] + "의 총점 : " + sum);
		}
	}

	public void printAverageByPerson(String[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			int sum = 0;
			for (int j = 1; j < arr[i].length; j++) {
				sum += Integer.parseInt(arr[i][j]);
			}
			System.out.println(arr[i][0] + "의 평균 : " + sum / 3);
		}
	}

	public void printMaxByPerson(String[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			int max = 0;
			for (int j = 1; j < arr[i].length; j++) {
				if (max < Integer.parseInt(arr[i][j])) {
					max = Integer.parseInt(arr[i][j]);
				}
			}
			System.out.println(arr[i][0] + "의 최댓값 : " + max);
		}
	}

	public static void printMinByPerson(String[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			double min = Double.POSITIVE_INFINITY;
			for (int j = 1; j < arr[i].length; j++) {
				if (min > Integer.parseInt(arr[i][j])) {
					min = Integer.parseInt(arr[i][j]);
				}
			}
			System.out.println(arr[i][0] + "의 최솟값 : " + min);
		}
	}
}