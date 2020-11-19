
abstract public class Shape {
int x;
Shape()
{x=90;
	System.out.println("THis is Shape() ");
}
	
	void display() //concrete
	{
		System.out.println("This is  Shape class");
	}
	void display2() //concrete
	{
		System.out.println("This is  Shape class");
	}
	abstract void area();
	abstract void m1();
}
