import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
    	TreeSet<String> ts = new TreeSet<String>();
    	
    	ts.add("H");
    	ts.add("e");
    	ts.add("l");
    	ts.add("l");// not add set just add unique
    	ts.add("o");
    	
    	System.out.println(ts);
    	System.out.println(ts.subSet("e", false, "o", true));
    }
}
