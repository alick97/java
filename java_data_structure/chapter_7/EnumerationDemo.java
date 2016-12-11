/*************************************************************************
	> File Name: EnumerationDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 15时37分15秒
 ************************************************************************/
import java.util.*;
class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Hello");
		v.add("world");

		Enumeration i = (Enumeration)v.elements();
		while (i.hasMoreElements()) {
			// error
			//v.add(1, "silly");
			//
			System.out.print(i.nextElement() + " ");
		}
		System.out.println();
	}
}
