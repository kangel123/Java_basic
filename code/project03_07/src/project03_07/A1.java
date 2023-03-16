package project03_07;

public class A1 {

	public static void main(String[] args) {
		int i, j;
		for (i = 2; i < 10; i++) {
			for (j = 2;; j++) {
				if (j < 10)
					System.out.println(i + "*" + j + "=" + i * j);
				else
					break;
			}
		}
	}
}
