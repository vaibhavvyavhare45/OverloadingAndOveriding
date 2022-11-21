package polymorphism.overriding.scenarios;

enum Size{
	SMALL{
		public String toString() {
			return "the size is small";
		}
	},
	LARGE{
		public String toString() {
			return "the size is large";
		}
	};
}


public class Scenario21 {
	public static void main(String[] args) {
		System.out.println(Size.LARGE.toString());
	}

}
