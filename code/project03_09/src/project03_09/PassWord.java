package project03_09;

import java.util.Scanner;

public class PassWord {
	public static void ruleOfPassword() {
		System.out.println("# Password 규칙");
		System.out.println("1. 최소 10자리 이상");
		System.out.println("2. 특수문자는 ‘!, @, #, $, %, ^, &, *’만 사용 가능");
		System.out.println("3. 영어 대문자, 소문자, 숫자, 특수문자 중 2종류 조합");
		System.out.println("4. 연속으로 같은 문자, 숫자 사용 불가");
		System.out.println("5. 첫 문자는 반드시 영어 대문자 사용");
	}

	public static boolean makePassword() {
		System.out.print("Password 생성 : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(!rule1(str)) {
			System.out.println("FAIL");
			System.out.println("최소 10자리 이상 입력하시오.");
			return false;
		}
		if(!rule2(str)) {
			System.out.println("FAIL");
			System.out.println("특수문자는 ‘!, @, #, $, %, ^, &, *’만 사용 가능합니다.");
			System.out.println("");
			return false;
		}
		if(!rule3(str)) {
			System.out.println("FAIL");
			System.out.println("영어 대문자, 소문자, 숫자, 특수문자 중 2종류 조합하시오.");
			return false;
		}
		if(!rule4(str)) {
			System.out.println("FAIL");
			System.out.println("연속으로 같은 문자, 숫자 사용 불가입니다.");
			return false;
		}
		if(!rule5(str)) {
			System.out.println("FAIL");
			System.out.println("첫 문자는 반드시 영어 대문자 사용");
			return false;
		}
		System.out.println("PASS");
		return true;
	}

	public static boolean rule1(String str) {
		if (str.length() >= 10) {
			return true;
		}
		return false;
	}

	//	‘!, @, #, $, %, ^, &, *’ = 33,64,35,36,37,38,94,42
	public static boolean rule2(String str) {
		for (int i = 0; i < str.length(); i++) {
			if ((64 < (int) str.charAt(i) && (int) str.charAt(i) < 91)
					|| (96 < (int) str.charAt(i) && (int) str.charAt(i) < 123)
					|| (47 < (int) str.charAt(i) && (int) str.charAt(i) < 58)
					|| (35 <= (int) str.charAt(i) && (int) str.charAt(i) <= 38) || (int) str.charAt(i) == 33
					|| (int) str.charAt(i) == 64 || (int) str.charAt(i) == 94 || (int) str.charAt(i) == 42) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}

	public static boolean rule3(String str) {
		int l = 0, n = 0, m = 0, o = 0;
		for (int i = 0; i < str.length(); i++) {
			if (64 < (int) str.charAt(i) && (int) str.charAt(i) < 91)
				l = 1;
			if (96 < (int) str.charAt(i) && (int) str.charAt(i) < 123)
				n = 1;
			if (47 < (int) str.charAt(i) && (int) str.charAt(i) < 58)
				m = 1;
			if ((35 <= (int) str.charAt(i) && (int) str.charAt(i) <= 38) || (int) str.charAt(i) == 33
					|| (int) str.charAt(i) == 64 || (int) str.charAt(i) == 94 || (int) str.charAt(i) == 42)
				o = 1;
		}
		if ((l + n + m + o) >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean rule4(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean rule5(String str) {
		if(64 < (int)str.charAt(0) && (int)str.charAt(0) <91) {
			return true;
		}
		return false;
	}
}
