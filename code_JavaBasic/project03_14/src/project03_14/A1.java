package project03_14;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int cnt = 0;
		try {
			// 1
			System.out.println("Queue에 넣을 6개의 숫자를 입력하시오.");
			while (cnt < 6) {
				que.add(scan.nextInt());
				cnt++;
			}
			// 2
			System.out.println("찾을 숫자값를 입력하시오");
			int n = scan.nextInt();

			CountQueue thread = new CountQueue(n, que);
			thread.start();
		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

class CountQueue extends Thread {
	int n;
	Queue<Integer> que;

	public CountQueue(int n, Queue<Integer> que) {
		this.n = n;
		this.que = que;
	}

	public void run() {

		int count = 0;
		try {
			while (true) {
				count++;
				if (que.poll() == n)
					break;
			}
			System.out.println("해당 숫자값은 " + count + "번째에 출력됩니다.");
		} catch (NullPointerException e) {
			System.out.println("해당 숫자값은 없습니다.");
		} catch (Exception e) {
			System.out.println("error");
		}

	}
}
