import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Assignment4Q7 {
	 public static String convertKeyValueToString(HashMap<String, Integer> map) {
		 StringBuilder res = new StringBuilder();
	    	for(HashMap.Entry<String,Integer> mp:map.entrySet()) {
	    		
	    		res.append(mp.getKey()+mp.getValue());
	    	}
	    	return res.toString();
	    }
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Mango", 123);
		hm.put("Banana", 345);
		hm.put("Apple", 567);
		hm.put("Grapes",789);
		System.out.println(convertKeyValueToString(hm));
		
	}

}
