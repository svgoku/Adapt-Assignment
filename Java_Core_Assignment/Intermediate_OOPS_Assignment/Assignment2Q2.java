import java.util.ArrayList;


class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}
public class Assignment2Q2 {
	static int salary = 10000;
    public int getSalary(int salary){
    	this.salary=salary;
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int sum = 0;
        for(int i = 0; i < employeeSalaries.size(); i++)
               sum += employeeSalaries.get(i);
        return sum;
    }

	public static void main(String[] args) {
		Manager manager=new Manager();
    	int msal=manager.getSalary(salary);
    	System.out.println("Employee Salary: "+msal);
    	
    	Labour labour=new Labour();
    	int lsal=labour.getSalary(salary);
    	System.out.println("Labour Salary: "+lsal);
    	
    	ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
    	employeeSalaries.add(msal);
    	employeeSalaries.add(lsal);
    	Assignment2Q2 assignment=new Assignment2Q2();
    	System.out.println("Total Employee Salary: "+assignment.totalEmployeesSalary(employeeSalaries));
		

	}

}
