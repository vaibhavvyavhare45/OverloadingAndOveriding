package polymorphism.overloading.scenarios;

public class Scenario11 {
	public void m1(int i,float j) {
		System.out.println("i am good method");
	}
	public void m1(float j,int i) {
		System.out.println("i am very good");
	}
	
	public static void main(String[] args) {
		Scenario11 s1=new Scenario11();
		s1.m1(14, 15.2f);//exact match
		s1.m1( 15.2f,10);
		///s1.m1(10,10);//compiler time error  its ambiguous error
		///s1.m1(5.5f, 5.5f);//ce error  symbol not found compiler
		
		
		
		
		
	}

}
