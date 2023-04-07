package project03_07;

public class A1 {

	// 구구단
	public static void main(String[] args) {
		int i, j;
		for (i = 2; i < 10; i++) {	// 2단부터 9단 까지
			for (j = 2;; j++) {
				if (j < 10)
					System.out.println(i + "*" + j + "=" + i * j);
				else
					break;
			}
		}
	}
}
