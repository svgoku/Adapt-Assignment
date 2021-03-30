import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assignment4Q4 {

	public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		Iterator<String> iterator=employeeList.iterator();
		while(iterator.hasNext()) {
			String assignment4q4=iterator.next();
			if(assignment4q4.length()%2==0) {
				
			}
			else {
				iterator.remove();
			}
		}
		
		return employeeList;
	}

	public static void main(String[] args) {
		
		ArrayList<String> employees=new ArrayList<String>(Arrays.asList("Rahul","Rohann","Dev","Devesh"));
		ArrayList<String> a=removeOddLength(employees);
		employees.forEach(employye->System.out.println(employees));
		
		

	}

}
