package polymorphism.overriding.scenarios;

class Parent2 {
	   static void display() {
	      System.out.println("Super class");    
	   }
	}
	public class Scenarios18 extends Parent2 {
//	   void display() // trying to override display() {
//	      System.out.println("Sub class");
//	   }
	   public static void main(String[] args) {
	      Parent2 obj = new Scenarios18();
	      obj.display();
	   }
	}


