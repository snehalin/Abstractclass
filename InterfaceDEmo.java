//Interface provides 100% abstraction
//to achieve Multiple Inheritance
/*syntax
 interface InterfaceName
 {
	 void m1();
	 void m2();
	 void m3();
 }
        Abstract Class            Interface
 1.abstract keyword requires      By default all methods are public and abstract
 2.Can have constructor,         No Constructor
 	non abstract methods         No non abstract methods till java version 1.8
 3.Instance var                  By default  public static final var
 */
public class InterfaceDEmo {

	public static void main(String args[])
	{
		Child2 ob=new Child2();
		ob.m33();//Child2
		Child3 ob1=new Child3();
		ob1.m33();// NewInterface
		NewInteface.m4();
	}
}
