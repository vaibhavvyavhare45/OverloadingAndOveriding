package polymorphism.overriding.scenarios;

interface MyInterface1{  
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface");
	   }
	}
	public class Scenarios16 implements MyInterface{
	   public void display() {
	      System.out.println("display method of class");
	   }
	   public static void main(String args[]) {
		   Scenarios16 obj = new Scenarios16();
	      obj.display();
	   }
	}

