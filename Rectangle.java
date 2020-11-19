
public class Rectangle extends Shape {
int l,b;
Rectangle()
{
	l=10;
	b=30;
}
	
	void area() {
		System.out.println("Area="+(l*b));
		
	}

	@Override
	void m1() {
		System.out.println("In Rectangle m1()");
		
	}

}
