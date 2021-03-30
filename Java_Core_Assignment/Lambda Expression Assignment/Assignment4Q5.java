import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

	public static void main(String[] args) {
		System.out.println(processWords(list));
	}
		 public static String processWords(List<String> list) {
			 StringBuilder sb = new StringBuilder();
			 Consumer<List<String>> select=lis->{
				 for (int i = 0; i < lis.size(); i++) {
		            	String wor = lis.get(i);
		            	sb.append(wor.charAt(0));
		            }
			 };
			 select.accept(list);
		       return sb.toString();
		 }
}
		 

