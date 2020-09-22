//Abstraction:Showing Essential features and hiding background details
//1.Abstract class can contain variables,abstract methods,non abstract methods,constructors
//2.We can not instantiate object of abstract class.
//3.Using Abstract class we can achieve 0 to 100 % abstraction
abstract class Bank
{int a;
	Bank()
	{
		a=10;
	}
	//abstract double getRateOfInterest();
	void withdraw()
	{
		System.out.println("Using this you can withdraw money");
	}
}

 class BOI extends Bank
{
	 double getRateOfInterest()
		{
			return 13.2;
		}
	 void display()
	 {
		 System.out.println("a="+a);
	 }
}
 
 
 
 class SBI extends Bank
 {
 	 double getRateOfInterest()
 		{
 			return 15.2;
 		}
 	 void display()
 	 {
 		 System.out.println("a="+a);
 	 }
 }
 
 
 public class AbstractDemo {
		public static void main(String[] args) {
			//Bank b1=new Bank();
			BOI b1=new BOI();
			double rate=b1.getRateOfInterest();
			System.out.println("Rate of Interestof BOI="+rate);
			b1.withdraw();
			b1.display();
			
			SBI s1=new SBI();
			double rate1=s1.getRateOfInterest();
			System.out.println("Rate of Interestof SBI="+rate1);
			s1.withdraw();
			s1.display();
			
			
			
			
			
			
			
	}

}
