package polymorphism.overloading.scenarios;

public class Scenario9 {
	public void m1(String s) {
		System.out.println("i am a string ");
	}
	public void m1(StringBuffer sb) {
		System.out.println("i am a String Buffer ");
	}
	public static void main(String[] args) {
		Scenario9 s=new Scenario9();
		s.m1("vaibhav");
		s.m1(new StringBuffer("ganesh"));
		//s.m1(null);//the error shows the ambiguous error b/z they are sibling
		
	}

}
