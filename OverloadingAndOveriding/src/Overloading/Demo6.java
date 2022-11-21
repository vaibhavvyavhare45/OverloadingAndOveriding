package Overloading;

public class Demo6 {
	//implicit promotion and  and autoboxing  at a time not allowed
	public static void m1(Long a) {
		System.out.println("Long");
	}
	
//	public static void m1(Number a) {
//		System.out.println("No");
//	}
	
	
//	public static void m1(float b) {
//		System.out.println("****");
//	}
	
	public static void main(String[] args) {
		//m1(10,10.5);//CE error  define the literal because of it consider the double in java
		//m1(10,10.5f);//imp and auto
		int a = 10;
	//	m1(a);
	
	}

}
