package polymorphism.overriding.scenarios;

class Student {
	   private int rno;
	   private String name;
	   public Student(int r, String n) {
	      rno = r;
	      name = n;
	   }
	   public String toString() {//Object class toString method is override in own class
	      return rno + " " + name;
	   }
	}
	public class scenarios19 {
	   public static void main(String[] args) {
	      Student s = new Student(101, "Susan Bones");
	      System.out.println("The student details are:");
	      System.out.println(s);
	   }
	}

