package day2.basics;

public class java_10 {

	public static void main(String[] args) {
		int a=15, b=30, c=10;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}
	}

}
