
public class Assignment4Q1 {
	
		 public double addition(int num1,int num2){
			 Arithmetic ae =(a,b)->a+b;
			 return ae.arith(13,5);
		 }
		  public double subtraction(int num1,int num2){
			  Arithmetic ae1 =(a,b)->a-b;
				 return ae1.arith(13,5);
		  }
		  public double multiplication(int num1,int num2){
			  Arithmetic ae2 =(a,b)->a*b;
				 return ae2.arith(13,5);
				 
			 }
			    public double division(int num1,int num2){
			    	Arithmetic ae3 =(a,b)->a/b;
					 return ae3.arith(13,5);
			    }

	public static void main(String[] args) {
		Assignment4Q1 a=new Assignment4Q1();
		System.out.println(a.addition(13, 5));
		System.out.println(a.subtraction(13, 5));
		System.out.println(a.multiplication(13, 5));
		System.out.println(a.division(13, 5));
	}
		

	

}
interface Arithmetic{
	int arith(int x , int y);
}
