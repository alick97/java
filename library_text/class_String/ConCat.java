/*************************************************************************
	> File Name: ConCat.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 18时56分19秒
 ************************************************************************/
/* 字符串连接的练习 */

class ConCat {
	public static void main(String[] args) {
		String longStr = "this could have been " +
			"a very long line that would have " +
			"wrapped around . but string concatenation " +
			"prevents this.";

		System.out.println(longStr);
		// 注意 + 字符串连接 
		System.out.println("four " + 2 + 2); // not 4 but 22
		System.out.println("four " +( 2 + 2)); 
	}
}
