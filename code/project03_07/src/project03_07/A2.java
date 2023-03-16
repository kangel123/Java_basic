package project03_07;

public class A2 {
	public static void main(String[] args) {
		int i = 2, j = 1;
		while (i < 10) {
			j = 2;
			while (j < 10) {
				switch (j) {
				case 2:
					System.out.println(i + "*2" + "=" + i * 2);
					break;
				case 3:
					System.out.println(i + "*3" + "=" + i * 3);
					break;
				case 4:
					System.out.println(i + "*4" + "=" + i * 4);
					break;
				case 5:
					System.out.println(i + "*5" + "=" + i * 5);
					break;
				case 6:
					System.out.println(i + "*6" + "=" + i * 6);
					break;
				case 7:
					System.out.println(i + "*7" + "=" + i * 7);
					break;
				case 8:
					System.out.println(i + "*8" + "=" + i * 8);
					break;
				case 9:
					System.out.println(i + "*9" + "=" + i * 9);
					break;
				default:
					break;
				}
				j++;
			}
			i++;
		}
	}
}