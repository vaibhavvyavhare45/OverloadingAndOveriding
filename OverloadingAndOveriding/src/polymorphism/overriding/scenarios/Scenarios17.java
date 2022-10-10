package polymorphism.overriding.scenarios;

class Parent1 {
	   private void display() {
	      System.out.println("Super class");    
	   }
	}
	public class Scenarios17 extends Parent1 {
	     void display() { // trying to override display() {
	      System.out.println("Sub class");
	   }
	   public static void main(String[] args) {
	      Parent1 obj = new Scenarios17();
	      //obj.display();
	   }
	}


