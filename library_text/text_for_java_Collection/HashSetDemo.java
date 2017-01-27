import java.util.*;

public class HashSetDemo {
    public static void main(String[] aegs) {
    	//HashSet<String> hs = new HashSet<String>();
    	HashSet<String> hs = new LinkedHashSet<String>();
    	hs.add("Beta");
    	hs.add("Alpha");
    	hs.add("Eta");
    	hs.add("Gamma");
    	hs.add("Epsilon");
    	hs.add("Omega");
    	hs.add("Omega");// not add
    	
    	System.out.println(hs);
    	System.out.println(hs.contains("Omega"));
    }
}
