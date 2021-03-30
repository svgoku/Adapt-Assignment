class ResultDeclaration{
	
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
    	double s1= subject1Marks+subject2Marks+subject3Marks;
    	double s2= subject1Marks+subject2Marks;
    	double s3= subject2Marks+subject3Marks;
    	double s4= subject3Marks+subject1Marks;
    	if(s1>60)
    		return "passed";
    		//System.out.println("Passed");
    	else if(s2>60 || s3>60 || s4>60)
    		return "Promoted";
    		//System.out.println("Promoted");
    	else if(subject1Marks>60 || subject2Marks>60 || subject3Marks>60)
    		return "failed";
    		//System.out.println("Failed");
    	else
    		//System.out.println("Failed");
    		return "failed";
    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		ResultDeclaration r1 = new ResultDeclaration();
		System.out.println(r1.declareResults(10,30,40));
	}
}