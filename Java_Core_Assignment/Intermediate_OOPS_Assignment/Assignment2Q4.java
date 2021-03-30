abstract class numericals{
	int a;
}

abstract class Calculate extends numericals{
	public abstract void multiply();
}
public class Assignment2Q4 extends Calculate{
	@Override
	public void multiply() {
		System.out.print("the addition of two numbers is: "+(20+24));
	}

	public static void main(String[] args) {
		Calculate cal =new Assignment2Q4();
		cal.multiply();
		
	}

}
