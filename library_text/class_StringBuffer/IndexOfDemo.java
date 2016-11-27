/*************************************************************************
	> File Name: IndexOfDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时57分07秒
 ************************************************************************/
class IndexOfDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("one two one");
		int i;
		i = sb.indexOf("one");
		System.out.println("First index: " + i);

		i = sb.lastIndexOf("one");
		System.out.println("last index: " + i);
	}
}
