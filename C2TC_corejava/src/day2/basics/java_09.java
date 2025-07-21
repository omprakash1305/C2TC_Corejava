package day2.basics;

public class java_09 {
	public static void main(String[] args) {
		int beg=12;
		int end=24;

		for (int i = beg; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}
	}
}
