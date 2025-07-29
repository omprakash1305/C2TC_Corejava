package interfaceExamples;

public class ItStudents implements College {
	
	@Override
	public void session() {
		System.out.println("IT Students is to reach the college before "+ starttime);
		System.out.println("And attend the Accenture CSR Program.");
	}
}
