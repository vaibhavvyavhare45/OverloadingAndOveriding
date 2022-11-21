package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class A1 {
	  public void m1() throws IOException {
		System.out.println("???");
		
	}
}

public class Test1 extends A1 {
	 public void  m1() throws  FileNotFoundException {
		System.out.println("****");
		
	}

	public static void main(String[] args) throws IOException {
		Test1 t = new Test1();
		t.m1();
	}

}
