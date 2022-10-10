package polymorphism.overriding.scenarios;

/**
 * @author vvyav
 * private method can not inherited  and this private method doesn't call directly
 * private met
 *
 */
class Demo{
	
	private void m1(int d) {
		System.out.println("first element");
		
	}
}
class Test extends Demo{
	private void m1(int d) {
		System.out.println("Second element");
	}
}

public class Scenarios12 {
	public static void main(String[] args) {
		Demo d=new Test();
		//d.m1();//error
	}
	

}
