package polymorphism.overriding.scenarios;

interface MyInterface{  
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface");
	   }
	}
	


	/**
	 * @author vvyav
	 *An interface in Java is similar to class but, 
	 *it contains only abstract methods and fields which are final and static.

		Since Java8 static methods and default methods are introduced in interfaces.
		 Unlike other abstract methods these are the methods can have a default implementation.
		  If you have default method in an interface, it is not mandatory to override (provide body) 
		  it in the classes that are already implementing this interface.
	 */
	public class Scenarios15 implements MyInterface{
		   public static void main(String args[]) {
			   Scenarios15 obj = new Scenarios15();
		      obj.display();
		   }
		}

