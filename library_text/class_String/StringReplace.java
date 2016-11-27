/*************************************************************************
	> File Name: StringReplace.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 21时28分32秒
 ************************************************************************/
class StringReplace {
	public static void main(String[] args) {
		String org = "This is a test. This is , too.";
		String search = "is";
		String sub = "was";
		String result = "";
		int i;

		do {
			System.out.println(org);
			i = org.indexOf(search);
			if (i != -1) {
				result = org.substring(0, i);
				result += sub;
				result = result + org.substring(i + search.length());
				org = result;
			}
		} while (i != -1);


		String s = "Hello".replace('l', 'w');
		System.out.println(s);
		String s1 = "Hello".replace("l", "l-l-");
		System.out.println(s1);
	}
}
