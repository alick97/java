/*************************************************************************
	> File Name: replaceDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时42分27秒
 ************************************************************************/
class repalaceDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.replace(5, 7, "was");
		System.out.println(sb);
	}
}
