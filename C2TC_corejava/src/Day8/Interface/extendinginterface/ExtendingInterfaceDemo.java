package Day8.Interface.extendinginterface;

public class ExtendingInterfaceDemo implements ChildInterface {
	
	
	
	public void print() { 
		System.out.println("print method");
	}

	
	public void show() {
		System.out.println("show Method");
	}
	
	public static void main(String[] args) {
        ExtendingInterfaceDemo obj = new ExtendingInterfaceDemo();
        obj.print();  
        obj.show();   
    }
	
}