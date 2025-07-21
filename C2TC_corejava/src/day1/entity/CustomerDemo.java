package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
	
		customer c1=new customer();
		c1.setCid(101);
		c1.setCname("raj");
		c1.setCcity("Pondy");
		System.out.println(c1.getCid());
		System.out.println(c1.getCname());
		System.out.println(c1.getCcity());
		
		customer c2=new customer();
		c2.setCid(101);
		c2.setCname("raji");
		c2.setCcity("VPM");
		System.out.println(c2.getCid());
		System.out.println(c2.getCname());
		System.out.println(c2.getCcity());
	}

}
