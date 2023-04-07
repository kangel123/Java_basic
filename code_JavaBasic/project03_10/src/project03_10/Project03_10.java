package project03_10;

import java.util.Scanner;

public class Project03_10 {

	public static void main(String[] args) {
//		A9();
//		A10();
		A11();
	}

	public static void A9() {
		TimeCalculator tc1 = new TimeCalculator();
		TimeCalculator tc2 = new TimeCalculator();
		
		Scanner scanner = new Scanner(System.in);
		tc1.setTime(scanner.nextInt());
		tc2.setTime(scanner.nextInt());
		scanner.close();
		
		int n = tc1.timeToSecond();
		int m = tc2.timeToSecond();
		System.out.println(Math.abs(n - m)+"s");
	}

	public static void A10() {
		StringComparison sc = new StringComparison();
		String str1, str2;
		str1 = sc.scan();
		str2 = sc.scan();	
		System.out.println(sc.comparison(str1, str2));
	}

	public static void A11() {
		SpeedCalculation sc1 = new SpeedCalculation();
		SpeedCalculation sc2 = new SpeedCalculation();
		SpeedCalculation sc3 = new SpeedCalculation();
		String n;
		
		Scanner scanner = new Scanner(System.in);
		sc1.setSpeed(scanner.nextFloat());
		sc2.setSpeed(scanner.nextFloat());
		sc3.setSpeed(scanner.nextFloat());
		scanner.close();
		n = sc1.maxSpeed(sc1.getSpeed(), sc2.getSpeed(), sc3.getSpeed());
		System.out.println(n);
	}

}
