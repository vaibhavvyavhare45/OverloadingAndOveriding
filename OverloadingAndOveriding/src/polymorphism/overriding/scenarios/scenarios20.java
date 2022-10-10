package polymorphism.overriding.scenarios;

import java.util.Scanner;
class Employee {
   private String name;
   private int age;
   Employee(String name, int age){
      this.name = name;
      this.age = age;
   }
}
public class scenarios20 {
   public static void main(String[] args) {
      Employee emp1 = new Employee("Jhon", 19);
      Employee emp2 = new Employee("Jhon", 19);
      //Comparing the two objects
      boolean bool = emp1.equals(emp2);
      System.out.println(bool);
   }
}

