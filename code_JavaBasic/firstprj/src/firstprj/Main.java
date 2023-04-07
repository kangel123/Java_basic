package firstprj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		// A1
		System.out.println("kim \nlee \njohn \nmike \ndaddy");
		
		System.out.println();
		
		// A2
		System.out.println("Feb.");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println("\t1\t2\t3\t4\t5\t6");
		System.out.println("7\t8\t9\t10\t1\t12\t13");
		System.out.println("14\t15\t16\t17\t18\t19\t20");
		System.out.println("21\t22\t23\t24\t25\t26\t27");
		System.out.println("28");
		
		// A3
		int i,j;
		for(i=2;i<10;i++) {
			for(j=2;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		
		System.out.println();
				
		// A4
		// Constant
		System.out.println("Constant");
		System.out.println(2+"*"+10+"="+2*10);
		
		System.out.println();
		
		// Variable
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Variable");
		System.out.print("곱할 숫자1 : ");
		i = scanner.nextInt();
		System.out.print("곱할 숫자2 : ");
		j = scanner.nextInt();
		System.out.println("결과 : "+i+"*"+j+"="+i*j);
		
		System.out.println();
		
		//Data type
		int a = 10;
		String b = "Hello World";		
		char c1 = 'a'; //문자
		char c2 = 97; //아스키코드
		boolean d = true;
		
		System.out.println("Data type");
		System.out.println("숫자(int) : "+a);
		System.out.println("문자열(String) : "+b);
		System.out.println("문자(char) : "+c1+"(문자로 표현),"+ c2+"(아스키코드로 표현)");
		System.out.println("불(boolean) : "+d);

		System.out.println();
		
		//if switch
		int x, y, z=0;
		
		System.out.println("if switch");
		System.out.print("x : ");
		x = scanner.nextInt();
		System.out.print("y : ");
		y = scanner.nextInt();
		
		if(x>y) {
			z=1;
		}else if(x==y) {
			z=2;
		}else {
			z=3;
		}
		
		switch(z) {
			case 1: System.out.println("x가 y보다 크다"); break;
			case 2: System.out.println("x와 y는 같다"); break;
			case 3: System.out.println("x가 y보다 작다"); break;
			default: System.out.println("문제오류"); break;
		}
		
		System.out.println();
		
		// A5
		System.out.println("My name is JinWoo Kim.\n"
				+ "I double majored in Mathematics and Computer Engineering at Yonsei University.\n"
				+ "I am interested in big data\n");
		
		// A6
		System.out.println("");
	}
}
