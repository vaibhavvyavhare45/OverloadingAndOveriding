
package polymorphism.overriding.scenarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Scenarios7 {
	public static void main(String[] args)throws Exception {
		AAAB a=new BBBA();
		a.name();
	}

}
class AAAB{
	public void name()throws IOException{
		System.out.println("AAA");
		
	}
}
class BBBA extends AAAB{
	public void name()throws FileNotFoundException  {
		System.out.println("BBB");
	}
}
