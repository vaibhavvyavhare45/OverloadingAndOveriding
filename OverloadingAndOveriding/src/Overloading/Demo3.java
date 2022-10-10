
package Overloading;

public class Demo3 {
	public void m1(float a,float b){
		System.out.println("zero");
	}
	public void m1(long c,double d) {
		System.out.println("first");
	}
public static void main(String[] args) {
	Demo3 d2=new Demo3();
	d2.m1(15.5f, 0.5f);//not ambiguty
	//d2.m1(15.5, 0.5);//ambiguty error
	
}
}
