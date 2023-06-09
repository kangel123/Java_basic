package project03_08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Project03_08_ver2 {
	public static void main(String[] args) {
//		P6();
//		P7();
//		P8();
//		P11();
//		P12();
//		P13();
//		P14();
//		P15();
//		A1();
//		A2();
//		A3();
	}

	// 달력 출력
	public static void P6() {
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		int i, j, year, month;

		year = scanner.nextInt(); // 년 입력
		month = scanner.nextInt(); // 월 입력

		calendar.set(year, month - 1, 1); // 컴퓨터에 저장된 월은 0~11까지 이므로 -1해서 캘린더 만들기

		int startDay = calendar.get(Calendar.DAY_OF_WEEK); // 해당 달의 1일의 요일
		int endDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	// 해당 달의 최대 일수
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");	// 요일
		
		// 해당 달의 1일의 요일 전에 대하여
		for (i = 1; i < startDay; i++) {
			System.out.print("\t");	// 비워둔다
		}
		
		// 달력 만들기
		for (j = 1; j <= endDay; i++, j++) {
			System.out.print(j + "\t");	// 날짜 출력
			if (i % 7 == 0) {	// 일요일이 되면
				System.out.println();	// 다음 줄로 넘긴다
			}
		}
	}

	// 
	public static void P7() {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		cal1.set(number1 / 10000, number1 % 10000 / 100 - 1, number1 % 100);
		cal2.set(number2 / 10000, number2 % 10000 / 100 - 1, number2 % 100);

		Date date1 = cal1.getTime();
		Date date2 = cal2.getTime();
		long result = Math.abs(date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24);

		System.out.println(result);
	}

	public static void P8() {
		Calendar cal1 = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int date = scanner.nextInt();
		cal1.set(number1 / 10000, number1 % 10000 / 100 - 1, number1 % 100);

		cal1.add(cal1.DAY_OF_MONTH, date);
		Date date1 = new Date(cal1.getTimeInMillis());

		System.out.println(simpleDateFormat.format(date1));
	}

	public static void P11() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float num = 0;
		System.out.println("#Current Converter");
		System.out.println("1. South Korean won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean won");
		System.out.println("3. Japanese Yen -> South Korean won");
		System.out.println("4. South Korean won -> Japanese Yen");
		System.out.println("5. Japanese Yen -> United States Dollar");
		System.out.println("6. United States Dollar -> Japanese Yen");
		i = scanner.nextInt();
		num = scanner.nextFloat();
		switch (i) {
		case 1:
			System.out.println(num * 0.00077);
			break;
		case 2:
			System.out.println(num * 1299.92);
			break;
		case 3:
			System.out.println(num * 10);
			break;
		case 4:
			System.out.println(num * 0.1);
			break;
		case 5:
			System.out.println(num * 0.0074);
			break;
		case 6:
			System.out.println(num * 136.02);
			break;
		}
	}

	public static void P12() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float num = 0;
		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		i = scanner.nextInt();
		num = scanner.nextFloat();
		switch (i) {
		case 1:
			System.out.println(num * 1.8 + 32);
			break;
		case 2:
			System.out.println((num - 32) * 5 / 9);
			break;
		}
	}

	// 문장을 분해,조합하여 해당 단어를 만들 수 있는 개수 구하기
	public static void P13() {
		int min = Integer.MAX_VALUE;	// 최소값 구하기 위해 최대값으로 저장
		HashMap<String, Integer> map1 = new HashMap<>();	// 문장
		HashMap<String, Integer> map2 = new HashMap<>();	// 단어

		Scanner scanner = new Scanner(System.in);
		String[] s1 = scanner.nextLine().split("");	// 문장을 나누어 배열에 저장
		String[] s2 = scanner.next().split("");	// 단어를 나누어 배열에 저장

		// 배열에 저장한 각각의 값들에 대해 HashMap에 저장
		for (String key : s1) {	
			map1.put(key, map1.getOrDefault(key, 0) + 1);
		}
		for (String key : s2) {
			map2.put(key, map2.getOrDefault(key, 0) + 1);
		}

		// 최소값 구하기
		for (String key : map2.keySet()) {
			if (map1.getOrDefault(key, 0) > 0) { // 해당 키가 존재하면
				int num = map1.get(key) / map2.get(key);

				// 최소값 바꾸기
				if (num < min) {
					min = num;
				}
			} else {	// 해당 키가 없는 경우
				min=0;	// 최소값은 0이다.
				break;	// 반복문을 계속 돌 필요가 없으므로 종료
			}			
		}
		System.out.println(min);	// 최소값 출력
	}

//	// 
//	public static void P13() {
//		int i = 0, j = 0, count = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		String[] str1 = scanner.nextLine().split("");
//		String[] s = scanner.next().split("");
//		for (; j < str1.length; j++) {
//			if (str1[j].equals(s[i])) {
//				i++;
//			}
//			if (i == s.length) {
//				i = 0;
//				count++;
//			}
//
//		}
//		System.out.println(count);
//
//	}

	public static void P14() {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		String[] str1 = scanner.nextLine().split(" ");
		for (; i < str1.length; i++) {
			if (str1[i].equals("a") || str1[i].equals("an")) {
				if (str1[i + 1].charAt(0) == 'a' || str1[i + 1].charAt(0) == 'e' || str1[i + 1].charAt(0) == 'i'
						|| str1[i + 1].charAt(0) == 'o' || str1[i + 1].charAt(0) == 'u') {
					str1[i] = "an";
				}
			}
		}
		for (i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + " ");
		}
	}

	public static void P15() {
		float a = 0, b = 0, result;
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		if (str1.contains("+")) {
			a = Float.parseFloat(str1.substring(0, str1.indexOf("+")));
			b = Float.parseFloat(str1.substring(str1.indexOf("+") + 1, str1.length()));

			System.out.println(a + b);
		} else if (str1.contains("-")) {
			a = Float.parseFloat(str1.substring(0, str1.indexOf("-")));
			b = Float.parseFloat(str1.substring(str1.indexOf("-") + 1, str1.length()));

			System.out.println(a - b);
		} else if (str1.contains("*")) {
			a = Float.parseFloat(str1.substring(0, str1.indexOf("*")));
			b = Float.parseFloat(str1.substring(str1.indexOf("*") + 1, str1.length()));

			System.out.println(a * b);
		} else if (str1.contains("/")) {
			a = Float.parseFloat(str1.substring(0, str1.indexOf("/")));
			b = Float.parseFloat(str1.substring(str1.indexOf("/") + 1, str1.length()));

			System.out.println(a / b);
		}
	}

	public static void A1() {
		ArrayCalculation list1 = new ArrayCalculation();
		ArrayList<Integer> number = new ArrayList<>();
		int k;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a number (0:exit) : ");
			k = scanner.nextInt();
			if (k == 0) {
				System.out.println("exit");
				break;
			}
			number.add(k);
			System.out.println("Result : " + k + " - Mean " + list1.Mean(number) + ", Max " + list1.Max(number)
					+ ", Min " + list1.Min(number));
		}
	}

	public static void A2() {
		CountingOfNumber list1 = new CountingOfNumber();
		int k, p = 0, n = 0, o = 0, e = 0;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a number (0:exit) : ");
			k = scanner.nextInt();
			if (k == 0) {
				System.out.println("exit");
				break;
			}
			p += list1.Positive(k);
			n += list1.Negative(k);
			o += list1.Odd(k);
			e += list1.Even(k);

			System.out.println("P - " + p + ", N - " + n + ", O - " + o + ", E - " + e);
		}
	}

	public static void A3() {
		CountingOfNumber list1 = new CountingOfNumber();
		Scanner scanner = new Scanner(System.in);
		String[] str1 = scanner.nextLine().replace(" ", "").split("");
		ArrayList<String> sentense1 = new ArrayList<>();
		for (int i = 0; i < str1.length; i++) {
			if (!sentense1.contains(str1[i])) {
				sentense1.add(str1[i]);
				System.out.println(str1[i] + " - " + CountingOfNumber.NumberOfAlphabet(str1[i], str1));
			}

		}

	}
}
