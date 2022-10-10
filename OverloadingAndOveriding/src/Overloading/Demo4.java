package Overloading;

public class Demo4 {
	private static void m1(int a) {
		System.out.println("argument: "+a);
	}

	private static void m1(int a,int b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Demo4 d=new Demo4();
		m1(10);
		m1(12,15);
	}
	
}
