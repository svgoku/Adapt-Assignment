class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double simple_interest=0;
    	
    	simple_interest=(principalAmount*time*interestRate)/100;
    	System.out.println("The simple interest is:" );
    	return simple_interest;
    }
    
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double amount=0;
    	amount=principalAmount*(Math.pow((1+(interestRate/100)),time));
    	double ci= amount-principalAmount;
    	System.out.println("The compount interest is:" );
    	return ci;
    }
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		SiCi scinterest = new SiCi();
		System.out.println("Calculating the simple interest");
		System.out.println(scinterest.simpleInterest(12345.12,2,8));
		System.out.println("\n");
		System.out.println("Calculating the compound interest");
		System.out.println(scinterest.compoundInterest(12345.23, 2, 9));

	}

}
