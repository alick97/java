import java.util.*;

public class LinkListDemo {
   public static void main(String[] args) {
	   LinkedList<String> l1 = new LinkedList<String>();
	   
	   l1.add("F");
	   l1.add("B");
	   l1.add("V");
	   l1.add("V");
	   l1.add("N");
	   l1.add("M");
	   
	   l1.addLast("L");
	   l1.addLast("A");
	   
	   l1.add(0, "0");
	   
	   System.out.println(l1);
	   
	   l1.removeLast();
	   l1.remove("N");
	   System.out.println(l1);
	   
	   l1.set(2, l1.get(2) + " changed");
	   
	   System.out.println(l1);
   }
}
