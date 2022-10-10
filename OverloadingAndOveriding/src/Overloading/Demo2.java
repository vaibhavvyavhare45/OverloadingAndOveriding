package Overloading;

public class Demo2 {
	public void disp(double c,long num) {
		System.out.println("print the fist");	
	}
	public void disp(float a,double c) {
		System.out.println("print the second");	
	}
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.disp(51d, 50l);
		//d1.disp(51, 50);
		//d1.disp(52, 'y');
	}

}
