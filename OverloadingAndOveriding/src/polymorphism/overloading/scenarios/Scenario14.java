package polymorphism.overloading.scenarios;

public class Scenario14 {
	public void m1(int a, float b) {
		System.out.println("**********");
	}
	public void m1(float a,int b) {
		System.out.println("##########");
	}
	public static void main(String[] args) {
		Scenario14 s=new Scenario14();
		s.m1(10, 10.5f);
		//s.m1(10, 1.5);//compilation error
	}

}
