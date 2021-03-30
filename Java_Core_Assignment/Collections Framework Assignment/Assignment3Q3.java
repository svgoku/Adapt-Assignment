import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
	public static List traverseReverse(ArrayList aList){
		 ListIterator<String> li = aList.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }
		return aList;
	}
	
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Mango");
	      aList.add("Papaya");
	      aList.add("Orange");
	      aList.add("Apple");
	      aList.add("Banana");
		 traverseReverse(aList);
				
	}
}
