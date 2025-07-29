package Day8.Abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		
		
		
		Shape shape;
		shape=new Square(15.5f);
		
		shape.calArea(); 
		shape.show();
		
		shape=new Rectangle(30,50);
		
		shape.calArea(); 
		shape.show();
		
		
		
		
		

	}

}