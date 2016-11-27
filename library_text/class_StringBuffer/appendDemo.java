/*************************************************************************
	> File Name: appendDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时21分32秒
 ************************************************************************/
class appendDemo {
	public static void main(String[] args) {
		String s;
		int a = 42;
		StringBuffer sb = new StringBuffer(40);

		s = sb.append("a = ").append(a).append(" !").toString();
		System.out.println(s);

	}
}
