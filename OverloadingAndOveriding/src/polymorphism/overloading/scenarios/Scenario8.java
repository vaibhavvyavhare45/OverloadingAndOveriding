package polymorphism.overloading.scenarios;

public class Scenario8 {
	
	public void m1(Object o) {
		System.out.println("i am object");
	}
	public void m1(String s) {
		System.out.println("i am  String");///first preference to child 
	}
	
	public static void main(String[] args) {
		Scenario8 s=new Scenario8();
		s.m1(new Object());
		s.m1("vaibhav");
		s.m1(null);
		
		
		
	}

}
