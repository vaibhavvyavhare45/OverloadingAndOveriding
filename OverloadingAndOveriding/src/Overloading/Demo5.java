package Overloading;

public class Demo5 {
	private static void  m1(int q) {
		System.out.println("integer data:"+q);
	}
	private static void m1(String s) {
		System.out.println("object of data: 	"+s);
		
	}
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		m1(12);
		m1("vaibhav");
		
	}

}
