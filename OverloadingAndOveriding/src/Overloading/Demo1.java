package Overloading;

public class Demo1 {
	void display(Integer...a) {
		System.out.println("printing integer");
	}///internally autoboxing
	void display(Number...b) {
		System.out.println("printing number");
		
	}
	void display(Object o) {
		System.out.println("printing object");
	}
	void diplay(int...c) {
		System.out.println("printing int");
		
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
	//int a=10;
		//d.display(null);
		d.display(10,20,45);
		
		
	}

}
