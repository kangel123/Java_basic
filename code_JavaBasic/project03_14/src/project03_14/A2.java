package project03_14;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class A2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int cnt = 0;

		// 1
		try {
			System.out.println("Stack에 넣을 6개의 숫자를 입력하시오.");
			while (cnt < 6) {
				stack.add(scan.nextInt());
				cnt++;
			}
			// 2
			System.out.println("찾을 숫자값를 입력하시오");
			int n = scan.nextInt();
			CountStack thread = new CountStack(n, stack);
			thread.start();
		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

class CountStack extends Thread {
	int n;
	Stack<Integer> stack;

	public CountStack(int n, Stack<Integer> stack) {
		this.n = n;
		this.stack = stack;
	}

	public void run() {
		int count = 0;
		try {
			while (true) {
				count++;
				if (stack.pop() == n)
					break;
			}
			System.out.println("해당 숫자값은 " + count + "번째에 출력됩니다.");
		} catch (EmptyStackException e) {
			System.out.println("해당 숫자값은 없습니다.");
		} catch (Exception e) {
			System.out.println("error");
		}

	}
}
