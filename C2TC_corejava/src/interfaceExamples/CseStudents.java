package interfaceExamples;

public class CseStudents implements College {
	
	@Override
	public void session() {
		System.out.println("CSE Students is to reach the college before "+ starttime);
		System.out.println("And attend the TNS CG CSR Program.");
	}
}
