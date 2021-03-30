import java.util.HashMap;
import java.util.Map;
class Employee {
    private String name;
    private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int hashcode() {
    	return 13;
    }
	public boolean equal(Object o)
	{
		return true;
	}
}
public class Assignment3Q5 {
	
	public static void main(String[] args) {
		Map<Employee,String> hmap = new HashMap<>();
		 Employee one = new Employee("Employee1",1);  
	      Employee two = new Employee("Employee2",2); 
		hmap.put(one, one.getName());
		hmap.put(two, two.getName());
		
		one.setName("Employee1");
		two.setName("Employee2");

        System.out.println(hmap.get(one)); 
  
        System.out.println(hmap.get(two));
        
        Employee three = new Employee("Employee3",3);
        hmap.put(three, three.getName());
        three.setName("asdasdas");
        System.out.println(hmap.get(three));
        

	}

}
