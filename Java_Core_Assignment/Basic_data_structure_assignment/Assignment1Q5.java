class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double payableTax=0;
    	if( ctc < 180000) {
    		System.out.println("No tax you need to paid");
    	}
    	else if(ctc == 181001 || ctc <= 300000) {
    		
    			
    		payableTax= payableTax+ (0.1 * ctc);
    		System.out.println("You need to pay 0.1% tax from your ctc" );
    		
    	}
    	else if(ctc==300001 || ctc<=500000) {
    		
    		payableTax= payableTax+ (0.2 * ctc);
    		System.out.println("You need to pay 0.2% tax from your ctc");
    	}
    	else if(ctc==500001 || ctc<=1000000) {
    		
    		payableTax= payableTax+ (0.3 * ctc);
    		System.out.println("You need to pay 0.3% tax from your ctc");
    	}
    	
    	return payableTax;
    	
    }
    
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		TaxAmount ta = new TaxAmount();
		System.out.println(ta.calculateTaxAmount(500000));

	}

}
