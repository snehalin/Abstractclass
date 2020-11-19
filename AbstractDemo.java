///1.we can not instantiate object of abstract class
//Abstract class may or may not have abstract methods
//Abstract class can contain constructors, abstract and non abstract methods
//
public class AbstractDemo {

	public static void main(String[] args) {
	//Shape s1=new Shape();
		//Circle c1=new Circle();
		ChildCircle c1=new ChildCircle();
		c1.display();
		c1.area();
		c1.m1();
		
		Rectangle r1=new Rectangle();
		r1.m1();
		r1.area();
	}

}
