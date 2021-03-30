import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable {
	static void printList(List<Integer> list) {
		for(Integer i : list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Assignment4Q8 ob = new Assignment4Q8();
		Thread t = new Thread(ob);
		t.start();

	}

	@Override
	public void run() {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(8);
	list.add(15);
	list.add(20);
	Consumer<List<Integer>> consu = Assignment4Q8::printList;
	consu.accept(list);
		
	}

}
