import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
    	ArrayDeque<String> adq = new ArrayDeque<String>();
    	
    	adq.push("A");
    	adq.push("B");
    	
    	System.out.println(adq);
    	
    	while (!adq.isEmpty()) {
    		System.out.println(adq.poll());
    	}
    }
}
