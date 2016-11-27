/*************************************************************************
	> File Name: UseTrim.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 21时45分54秒
 ************************************************************************/
import java.io.*;

class UseTrim {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter 'stop' to quit.");
		System.out.println("Enter State: ");
		do {
			str = br.readLine();
			str = str.trim(); // remove whitespace

			if (str.equalsIgnoreCase("china"))
				System.out.println("ok , you are right .");
			else System.out.println(str);
		} while (!str.equalsIgnoreCase("stop")); 
	}
}
