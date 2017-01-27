// 测试 集合中保存的数据是用户自己的类
import java.util.*;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n, String s, String c, String st, String cd) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
	
	public String toString() {
		return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
	}
}
public class TestMailList {
    public static void main(String[] args) {
    	LinkedList<Address> ml = new LinkedList<Address>();
    	ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL","11221"));
    	ml.add(new Address("J.W. dsadad", "11 Oak Ave", "Urbana", "IL","11221"));
    	
    	for (Address element : ml) {
    		System.out.println(element);
    		System.out.println("----------");
    	}
    	System.out.println();
    }
}
