package polymorphism.overloading.scenarios;

class Animal {

}

class Monkey extends Animal {

}

public class Scenario12 {
	public void m1(Animal a) {
		System.out.println("i am animal method");
	}

	public void m1(Monkey k) {
		System.out.println("i am monkey method");
	}

	public static void main(String[] args) {
		Scenario12 s = new Scenario12();
		Animal a = new Animal();
		s.m1(a);
		Monkey k = new Monkey();
		s.m1(k);
		Animal a1 = new Monkey();

		s.m1(a1);	// in this case of method ovrloading is reference base not runtime object base
					// method overloadind is base on compile time and reference type polymorphism
					// static binding polymorphism.

	}
}
