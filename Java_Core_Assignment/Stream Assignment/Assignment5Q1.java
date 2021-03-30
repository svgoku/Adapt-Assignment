import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString()
	{
		return "Fruit name=" + "'"+name + "'"+", calories=" + calories + ", price=" + price + ", color=" +  "'"+color+"'" ;
		
	}
}
class Sorting implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		 if(o1.getPrice()<o2.getPrice()) {
	        	return 1;
	        }else
	        	return -1;
	    }	
}
public class Assignment5Q1 {
	    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
	    	
	    	ArrayList<Fruit> sortedorder;
	     	List<Fruit>calFruits = Fruits.stream().sorted((f1,f2)->f1.getColor().compareTo(f2.getColor())).collect(Collectors.toList());
	     	sortedorder=new ArrayList<>(calFruits);
	     	return sortedorder;
	    }
	    public static ArrayList<Fruit> lowCaloryFruits(ArrayList<Fruit> fruits){
	    	ArrayList<Fruit> fs = new ArrayList<>();
	    	fs = (ArrayList<Fruit>)fruits.stream().filter(i->i.getCalories()<100)
	    			.sorted((f1,f2)->f2.getCalories()-f1.getCalories())
	    			.collect(Collectors.toList());
	    	fs.stream().sorted();
	    	return fs;
	    }

	    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
	    	ArrayList<Fruit> redFruits;
	    	List<Fruit> tf = fruits.stream().filter(i->i.getColor().equalsIgnoreCase("Red"))
	    	.sorted((f1,f2)->f1.getPrice()-f2.getPrice()).collect(Collectors.toList());
	    	redFruits = new ArrayList<>(tf);
	    	return redFruits;
	    }

	public static void main(String[] args) {
	    	Fruit f1=new Fruit("Orange",70,50,"Orange");
	    	Fruit f2=new Fruit("Apple",120,100,"Red");
	    	Fruit f3=new Fruit("Banana",115,60,"Yellow");
	    	Fruit f4=new Fruit("Kiwi",98,85,"Green");
	    	Fruit f5=new Fruit("WaterMelon",80,45,"Red");
	    	Fruit f6=new Fruit("Cheery",200,120,"Red");
	    	
	    	ArrayList<Fruit> calFruits=new ArrayList<Fruit>();
	    	calFruits.add(f1);
	    	calFruits.add(f2);
	    	calFruits.add(f3);
	    	calFruits.add(f4);
	    	calFruits.add(f5);
	    	calFruits.add(f6);
	    	
	    	System.out.println("Descending order Of Low Calories Fruits");
	    	ArrayList<Fruit> fs = lowCaloryFruits(calFruits);
	    	fs.stream().forEach(i->System.out.println(i));
	    	
	    	System.out.println();
	    	
	    	System.out.println("Fruits with Sorted colour ");
	    	ArrayList<Fruit> fs1 = sort(calFruits);
	    	fs1.stream().forEach(i->System.out.println(i));
	    	
	    	System.out.println();
	    	
	    	System.out.println("Fruits sorted according to price and colour");
	    	ArrayList<Fruit> fs2 = filterRedSortPrice(calFruits);
	    	fs2.stream().forEach(i->System.out.println(i));
	    	System.out.println();
	    	
	}

}
