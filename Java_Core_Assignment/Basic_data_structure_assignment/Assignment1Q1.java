

	class ArmstrongorNot{
		public boolean armstrongCheck(int num) {
			int no_of_digits = String.valueOf(num).length();
	        int sum = 0;
	        int val = num;
	        for(int i=1;i<=no_of_digits;i++) {
	            int digit = val%10;
	            val = val/10;
	            sum = sum + (int)Math.pow(digit, no_of_digits);
	        }
	        if(sum == num) {
	            return true;
	        }else {
	            return false;
	        }
			
		}
		
	}
	public class Assignment1Q1 {

		public static void main(String[] args) {
			ArmstrongorNot asda = new ArmstrongorNot();
			System.out.println(asda.armstrongCheck(1653));
			

		}

}
