/*************************************************************************
	> File Name: subStringDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时47分44秒
 ************************************************************************/
class subStringDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ni hao sunshine");
		String s = sb.substring(3, 6);
		System.out.println("s: " + s + " \n sb: " + sb);

		String ss = sb.substring(6);
		System.out.println("ss: " + ss + " \n sb: " + sb);

	}
}
