package project03_06;

import java.util.Scanner;

public class project03_06 {
	public static void main(String[] args) {
		P3();	// 거스름돈
//		P6();	// 간단한 계산기
//		P7();	// 특정 구구단
//		P8();	// 특정 구구단
	}
	
	// 거스름돈
	public static void P3(){
		int N, M;
		int money10000=0;	// 10000원
		int money5000=0;	// 5000원
		int money1000=0;	// 1000원
		int money500=0;	// 500원
		int money100=0;	// 100원
		int money50=0;	// 10원
		int money10=0;	// 10원
		
		Scanner scanner = new Scanner(System.in);
		N=scanner.nextInt();	// 총 금액
		M=scanner.nextInt();	// 지불액
		N-=M;	// 거스름돈
		System.out.println(N);
		
		// 10000원 단위의 거스름돈
		money10000 = N/10000;
		N %= 10000; 
		
		System.out.println("10000 - "+money10000);

		// 5000원 단위의 거스름돈
		money5000 = N/5000;
		N %= 5000; 
		System.out.println("5000 - "+money5000);

		// 1000원 단위의 거스름돈
		money1000 = N/1000;
		N %= 1000; 
		System.out.println("1000 - "+money1000);

		// 500원 단위의 거스름돈
		money500 = N/500;
		N %= 500; 
		System.out.println("500 - "+money500);

		// 100원 단위의 거스름돈
		money100 = N/100;
		N %= 100; 
		System.out.println("100 - "+money100);

		// 50원 단위의 거스름돈
		money50 = N/50;
		N %= 50; 
		System.out.println("50 - "+money50);

		// 10원 단위의 거스름돈
		money10 = N/10;
		N %= 10; 
		System.out.println("10 - "+money10);
	}
	
	// 간단한 계산기
	public static void P6() {
		int i, x,y;	//
		Scanner scanner = new Scanner(System.in);
		System.out.println("What operation do you want?");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");		

		i=scanner.nextInt();	// 연산자 선택
		x=scanner.nextInt();
		y=scanner.nextInt();
		switch(i) {
		case 1:	// 더하기
			System.out.println(x+y);
			break;
		case 2:	// 빼기
			System.out.println(x-y);
			break;
		case 3:	// 곱하기
			System.out.println(x*y);
			break;
		case 4:	// 나누기
			System.out.println(x/y);
			break;
		default:break;	// 그 외
		}
	}
	
	// 특정 구구단 출력 (if~else)
	public static void P7() {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		i = scanner.nextInt();	// 연산자 선택
		if(i==2) {	// 2단
			System.out.println("2 X 2"+"="+2*2);
			System.out.println("2 X 3"+"="+2*3);
			System.out.println("2 X 4"+"="+2*4);
			System.out.println("2 X 5"+"="+2*5);
			System.out.println("2 X 6"+"="+2*6);
			System.out.println("2 X 7"+"="+2*7);
			System.out.println("2 X 8"+"="+2*8);
			System.out.println("2 X 9"+"="+2*9);
		}else if(i==3) {	// 3단
			System.out.println("3 X 2"+"="+3*2);
			System.out.println("3 X 3"+"="+3*3);
			System.out.println("3 X 4"+"="+3*4);
			System.out.println("3 X 5"+"="+3*5);
			System.out.println("3 X 6"+"="+3*6);
			System.out.println("3 X 7"+"="+3*7);
			System.out.println("3 X 8"+"="+3*8);
			System.out.println("3 X 9"+"="+3*9);
		}else if(i==4) {	// 4단
			System.out.println("4 X 2"+"="+4*2);
			System.out.println("4 X 3"+"="+4*3);
			System.out.println("4 X 4"+"="+4*4);
			System.out.println("4 X 5"+"="+4*5);
			System.out.println("4 X 6"+"="+4*6);
			System.out.println("4 X 7"+"="+4*7);
			System.out.println("4 X 8"+"="+4*8);
			System.out.println("4 X 9"+"="+4*9);
		}else if(i==5) {	// 5단
			System.out.println("5 X 2"+"="+5*2);
			System.out.println("5 X 3"+"="+5*3);
			System.out.println("5 X 4"+"="+5*4);
			System.out.println("5 X 5"+"="+5*5);
			System.out.println("5 X 6"+"="+5*6);
			System.out.println("5 X 7"+"="+5*7);
			System.out.println("5 X 8"+"="+5*8);
			System.out.println("5 X 9"+"="+5*9);
		}else if(i==6) {	// 6단
			System.out.println("6 X 2"+"="+6*2);
			System.out.println("6 X 3"+"="+6*3);
			System.out.println("6 X 4"+"="+6*4);
			System.out.println("6 X 5"+"="+6*5);
			System.out.println("6 X 6"+"="+6*6);
			System.out.println("6 X 7"+"="+6*7);
			System.out.println("6 X 8"+"="+6*8);
			System.out.println("6 X 9"+"="+6*9);
		}else if(i==7) {	// 7단
			System.out.println("7 X 2"+"="+7*2);
			System.out.println("7 X 3"+"="+7*3);
			System.out.println("7 X 4"+"="+7*4);
			System.out.println("7 X 5"+"="+7*5);
			System.out.println("7 X 6"+"="+7*6);
			System.out.println("7 X 7"+"="+7*7);
			System.out.println("7 X 8"+"="+7*8);
			System.out.println("7 X 9"+"="+7*9);
		}else if(i==8) {	// 8단
			System.out.println("8 X 2"+"="+8*2);
			System.out.println("8 X 3"+"="+8*3);
			System.out.println("8 X 4"+"="+8*4);
			System.out.println("8 X 5"+"="+8*5);
			System.out.println("8 X 6"+"="+8*6);
			System.out.println("8 X 7"+"="+8*7);
			System.out.println("8 X 8"+"="+8*8);
			System.out.println("8 X 9"+"="+8*9);
		}else if(i==9) {	// 9단
			System.out.println("9 X 2"+"="+9*2);
			System.out.println("9 X 3"+"="+9*3);
			System.out.println("9 X 4"+"="+9*4);
			System.out.println("9 X 5"+"="+9*5);
			System.out.println("9 X 6"+"="+9*6);
			System.out.println("9 X 7"+"="+9*7);
			System.out.println("9 X 8"+"="+9*8);
			System.out.println("9 X 9"+"="+9*9);
		}else {	// 그 외
			System.out.println("X");
		}
		
	}
	
	// 특정 구구단 출력 (switch~case)
	public static void P8() {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		i = scanner.nextInt();	// 연산자 선택
		switch(i) {
		case 2:	// 2단
			for(j=2;j<10;j++) System.out.println(2+"X"+j+"="+2*j);
			break;
		case 3:	// 3단
			for(j=2;j<10;j++) System.out.println(3+"X"+j+"="+3*j);
			break;
		case 4:	// 4단
			for(j=2;j<10;j++) System.out.println(4+"X"+j+"="+4*j);
			break;
		case 5:	// 5단
			for(j=2;j<10;j++) System.out.println(5+"X"+j+"="+5*j);
			break;
		case 6:	// 6단
			for(j=2;j<10;j++) System.out.println(6+"X"+j+"="+6*j);
			break;
		case 7:	// 7단
			for(j=2;j<10;j++) System.out.println(7+"X"+j+"="+7*j);
			break;
		case 8:	// 8단
			for(j=2;j<10;j++) System.out.println(8+"X"+j+"="+8*j);
			break;
		case 9:	// 9단
			for(j=2;j<10;j++) System.out.println(9+"X"+j+"="+9*j);
			break;
		default:	// 그 외
			break;
			
		}
	}
}
