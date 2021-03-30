import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
	 public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
		 Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext()) {
				
				int st = iterator.next();
				System.out.print(st);
				System.out.println("\n");}	
		return list;
	    }
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		failFast(list);
	}
}
