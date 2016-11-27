/*************************************************************************
	> File Name: equalsDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 20时06分15秒
 ************************************************************************/
// Demostrate equals() and equalsIgnoreCase()

class equalsDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "HELLO";
		String s4 = "Good-bye";
		System.out.println(s1 + " equals " + s2 + "->" + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + "->" + s1.equals(s3));
		System.out.println(s1 + " equals " + s2 + "->" + s1.equals(s2));
		System.out.println(s1 + " equals " + s4 + "->" + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s3 + "->" + s1.equalsIgnoreCase(s3));
	}
}
