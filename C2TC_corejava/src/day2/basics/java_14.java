package day2.basics;
import java.io.*;
public class java_14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter The Name");
		name=br.readLine();
		int age;
		System.out.println("Enter the age");
		age=Integer.parseInt(br.readLine());
		float avg;
		System.out.println("Enter the Average");
		avg=Float.parseFloat(br.readLine());
		System.out.println("Name "+name+ " Age "+age+" Average "+avg);
	}

}
