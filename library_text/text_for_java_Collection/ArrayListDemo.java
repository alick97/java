import java.util.ArrayList;

public class ArrayListDemo {
   public static void main(String[] args) {
	   ArrayList<String> al = new ArrayList<String>();
	   System.out.println("al.size(): "+al.size());
       al.add("c");
       al.add("a");
       al.add("e");
       al.add("b");
       al.add("d");
       al.add("f");
       al.add(1, "A");
       System.out.println("size: " + al.size());
       System.out.println("contents: " + al);
       String[] s = new String[7];
       al.toArray(s);
      for (String i : s) {
    	  System.out.println(i);
      }
       
   }
}
