  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Person{
    private String name;
    private int height;
    private double weight;
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person Name is: "+name+", height is: "+height+", weight is: "+weight;
	}
}
public class Assignment3Q1 {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		person.add(new Person("Tom",170,65.5));
		person.add(new Person("Jerry",160,55.3));
		person.add(new Person("Tom",180,60.4));
		person.add(new Person("Tom",169,69.7));
		
		Collections.sort(person,new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return Double.compare(o1.getWeight(), o2.getWeight());
				
			}
			});
		 System.out.println(person);
		
	}

}


