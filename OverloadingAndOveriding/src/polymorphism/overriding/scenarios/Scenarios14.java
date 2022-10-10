package polymorphism.overriding.scenarios;

class Super{
//	   public final void m2() {
//	      System.out.println("This is the method of the superclass");
//	   }
	}
	class Sub extends Super{
	   public final void m2() {
	      System.out.println("This is the method of the subclass");
	   }
	}
/**
 * @author vvyav
 *final method is not override in java  method overriding  and does not call this method.
 *and do not call directly in java
 */

public class Scenarios14 {
	Super s1=new Sub();
	//s1.m2();

}
