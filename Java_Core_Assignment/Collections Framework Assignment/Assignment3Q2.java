import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
	public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){ 
		Iterator<LinkedHashSet> i =linkedHashSet.iterator();
		while(i.hasNext()) {
			i.next();
		}
		return linkedHashSet;
	}
    public static HashSet unordered(HashSet hashSet){
    	Iterator<HashSet> i =hashSet.iterator();
    	while(i.hasNext()) {
    		i.next();
    	}
    	return hashSet;
    }

	public static void main(String[] args) {
		 HashSet<String> f1 = new HashSet<String>();
	        LinkedHashSet<String> f2 = new LinkedHashSet<String>();
	        for(String fruit: Arrays.asList("mango", "orange","apple", "banana")){
	            f1.add(fruit);
	            f2.add(fruit);
	        }
	        System.out.println(unordered(f1));
	        System.out.println(ordered(f2));
	}

}
