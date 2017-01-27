import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
    	AbstractMap<String, Double> tm = new TreeMap<String, Double>();
    	
    	tm.put("Tom Smith", new Double(123.22));
    	tm.put("John Doe", new Double(3434.34));
    	tm.put("John Doe", new Double(34.34));
    	
    
    	Set<Map.Entry<String, Double>> set = tm.entrySet();
    	
    	for (Map.Entry<String, Double> me : set) {
    		System.out.print(me.getKey() + " : ");
    		System.out.println(me.getValue());
    	}
    	System.out.println();
    	
    	double balance = tm.get("John Doe");
    	tm.put("John Doe", balance + 1000);
    	System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    	
    }
}
