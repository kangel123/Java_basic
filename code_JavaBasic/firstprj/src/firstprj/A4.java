package firstprj;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// Constant
				System.out.println("Constant");
				System.out.println(2+"*"+10+"="+2*10);
				
				System.out.println();
				
				// Variable
				int i,j;
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
	}

}
