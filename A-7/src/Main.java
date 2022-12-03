//import pack.Addition;
//import pack.Subtraction;
import pack.*;

public class Main{
	public static void main(String[] args){
		int a = 19;
		int b = 12;
		Addition ob = new Addition();
		Subtraction ob1 = new Subtraction();
		ob.print(a, b);
		ob1.sub(a, b);
	}
}
