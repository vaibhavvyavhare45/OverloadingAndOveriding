package polymorphism.overriding.scenarios;
class Aaa {
	   private void display() {
	      System.out.println("A.display");
	   }
	    public void callDisplay() {
	      System.out.println("A.callDisplay");
	      display();
	   }
	}

	class Bbb extends Aaa {
	   private void display() {
	      System.out.println("B.display");
	   }
	    public void callDisplay() {
	      System.out.println("B.callDisplay");
	      display();
	   }  
	}

	
	  

public class Scenarios13 {
	 public static void main(String[] args) {
	      Aaa a = new Bbb();
	      a.callDisplay();

	      Bbb b = new Bbb();
	      b.callDisplay();

	      Aaa a1 = new Aaa();
	      a1.callDisplay();
	   }

}
