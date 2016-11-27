/*************************************************************************
	> File Name: StringJoinDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 16时31分02秒
 ************************************************************************/
/* 连接字符串*/

class StringJoinDemo {
	public static void main(String[] args) {
		String result = String.join(" ", "Alpha","Beta", "Gamma");
		System.out.println(result);

		result = String.join(", ", "John", "ID#: 567", "E-mail:www@bb.com");
		System.out.println(result);
	}
}
