
public class Demo {

	public static void main(String[] args) {
		
		System.out.println("a="+Interface1.a);
		
		ChildClass c1=new ChildClass();
		c1.m1();
		c1.m2();
		
		Child2 c2=new Child2();
		c2.m1();
		c2.m2();
		c2.m3();
	}

}
