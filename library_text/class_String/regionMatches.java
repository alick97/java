/*************************************************************************
	> File Name: regionMatches.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 20时17分27秒
 ************************************************************************/
/* 字符串 匹配*/

class regionMatches {
	public static void main(String[] args) {
		System.out.println("true-> " + "abc".regionMatches(1, "bcs", 0, 2) );
		System.out.println("false-> " + "abc".regionMatches(1, "bcs", 0, 3) );
		System.out.println("true-> " + "abc".regionMatches(true, 1, "Bcs", 0, 2) );
		System.out.println("Foobar.endsWith bar :" + "Foobar".endsWith("bar"));
		System.out.println("Foobar . startsWith Foo :" + "Foobar".startsWith("Foo"));
		System.out.println("Foobar.startsWith bar :" + "Foobar".startsWith("bar", 3));
	}
}
