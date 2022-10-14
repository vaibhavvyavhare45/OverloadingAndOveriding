package polymorphism.overloading.scenarios;

public class Scenario10 {

	public void m1(int a) {
		System.out.println("i am int m1 method ");
	}

	public void m1(int... a) {
		System.out.println("i am var-arg method im a introduced jdk 1.5 version");
	}

	public static void main(String[] args) {
		Scenario10 s1 = new Scenario10();
		s1.m1();// in this case var-arg method is called becouse by the vararg method is count
				// the 0th number element to nth number
		s1.m1(10, 20);// that case also called the var-arg method in java
		s1.m1(null);// that method also called the var-arg method in java
		s1.m1(20);// that method is first called the single int param/exact param if you comment
					// out the method single param then second preference to the var-arg method in
					// b/z var-arg method is least priority
		

	}

}
