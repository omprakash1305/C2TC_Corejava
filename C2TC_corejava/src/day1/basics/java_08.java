package day1.basics;

public class java_08 {

	public static void main(String[] args) {
		byte byteMax = 125;
		byte byteMin = -118;
		
		System.out.println("Min range of byte is" +
				byteMin+"Max range of byte is "+byteMax);
		
		
		short shortMax = 32757;
		short shortMin = -32738;
		System.out.println("Minshort range of byte is" +
				shortMin+"Maxshort range of byte is "+shortMax);
		
		
		int maxInt = 2147383647;
		int minInt = -2147453648;
		System.out.println("Minint range of byte is" +
				minInt+"Maxint range of byte is "+maxInt);
		
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Minlong range of byte is" +
				minLong+"Maxlong range of byte is "+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+" double value is "+d);
		
		
		boolean flag=false;
		System.out.println("boolean value is "+flag);
	}

}
