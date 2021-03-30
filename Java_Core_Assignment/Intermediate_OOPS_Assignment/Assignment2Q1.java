class SingletonInheritanceCheck{ 
	private static SingletonInheritanceCheck instance =null;
	public String check;
	private SingletonInheritanceCheck() {
		check = "hello";
	}
	public static SingletonInheritanceCheck getInstance() {
		if(instance != null) {
			instance = new SingletonInheritanceCheck();
		}
		return instance;
	}
	
}

public class Assignment2Q1 {

	public static void main(String[] args) {
		//SingletonInheritanceCheck sc = new SingletonInheritanceCheck();

	}

}         