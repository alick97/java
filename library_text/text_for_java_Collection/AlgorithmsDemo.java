import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
    	LinkedList<Integer> l1 = new LinkedList<Integer>();
    	l1.add(-8);
    	l1.add(20);
    	l1.add(-20);
    	l1.add(8);
    	
    	Comparator<Integer> r = Collections.reverseOrder();
    	Collections.sort(l1, r);
    	
    	System.out.println("List sorted in reverse: ");
    	for (int i : l1) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	
    	Collections.shuffle(l1);
    	// 打乱顺序
    	System.out.println("List shuffled: ");
    	for (int i : l1) {
    		System.out.print(i + " ");
    	}
    	
    	System.out.println();
    	
    	System.out.println("Minimum: " + Collections.min(l1));
    	System.out.println("Maximum: " + Collections.max(l1));
    }
}
