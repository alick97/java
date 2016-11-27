/*************************************************************************
	> File Name: getCharsDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时16分28秒
 ************************************************************************/
class getCharsDemo {
	public static void main(String[] args) {
		char[] carry = new char[20];
		StringBuffer sb = new StringBuffer("ni hao");
		sb.getChars(3, sb.length(), carry, 0);
		System.out.println(carry);
	}
}
