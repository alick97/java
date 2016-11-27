/*************************************************************************
	> File Name: EqualsNotEqualTo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 20时32分10秒
 ************************************************************************/
class EqualsNotEqualTo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "Hello";
		String s4 = "ni hao";

		System.out.println(s1 + "equals " + s2 + "->" + s1.equals(s2));
		System.out.println(s1 + "== " + s2 +  "-> " + (s1 == s2));
		System.out.println(s3 == s1);
	}
}
