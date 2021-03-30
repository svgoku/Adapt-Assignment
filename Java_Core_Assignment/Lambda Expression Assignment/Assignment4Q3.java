import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Assignment4Q3 {
	static void modifyValue(int v, Function<Integer, Integer> function){ 
		int result = function.apply(v);
	    System.out.println(result);
	}
    static class Product {
    	private double price = 5.0;

    	  public void setPrice(double price) {
    	    this.price = price;
    	  }

    	  public void printPrice() {
    	    System.out.println(price);
    	  }
    }
    static void display(Supplier<Integer> arg) {
    	System.out.println(arg.get());
    }

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Here i am using Functional Interfaces known as Function");
	    modifyValue(num, val-> val + 10);
	    modifyValue(num, val-> val * 100);
	    System.out.println("Here i am using Functional Interfaces known as Suplier");
	    display(() -> num + 10);
        display(() -> num + 100);
	    System.out.println("Here i am using Functional Interfaces known as Consumer");
        Consumer<Product> updatePrice = p -> p.setPrice(150);
        Product p = new Product();
        updatePrice.accept(p);
        p.printPrice();
        System.out.println("Here i am using Functional Interfaces known as Predicate");
        Predicate<String> isALongWord = t -> t.length() > 10;
        String s = "Hello! how r u";
       
        if(s.equals(isALongWord)) {
        	System.out.println(s+"\nThe length of the String is: "+s.length());
        	
        }
        else {
        	System.out.println(s+"\nThe length of the String is: "+s.length());
        }
		
	}

}
