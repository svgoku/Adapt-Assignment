import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a {
	public static void failFast(Map<String, String> cityCode){
		
		for(Map.Entry<String, String> h:cityCode.entrySet()) {
			System.out.println(h.getKey()+" "+h.getValue());
		}
	}
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String , String>();
		hm.put("India", "Delhi");
		hm.put("USA", "New York");
		hm.put("UK", "London");
		failFast(hm);
	}

}
