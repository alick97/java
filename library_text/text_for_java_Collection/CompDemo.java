import java.util.*;

class MyComp implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		return bStr.compareTo(aStr); // 
	}
}
public class CompDemo {
    public static void main(String[] args) {
    	//TreeSet<String> ts = new TreeSet<String>(new MyComp()); 
    	TreeSet<String> ts = new TreeSet<String>((String aStr, String bStr) -> bStr.compareTo(aStr) ); 
         ts.add("A");
        ts.add("B");
        ts.add("C");
        for (String element : ts) {
        	System.out.println(element);
        }
        
        TreeSet<String> ts1 = new TreeSet<String>(new MyComp().reversed());// 反相器
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        for (String element : ts1) {
        	System.out.println(element);
        }
    }
}
