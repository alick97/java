/*************************************************************************
	> File Name: deleteDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时35分44秒
 ************************************************************************/
class deleteDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.delete(4, 7);
		System.out.println(sb);

		sb.deleteCharAt(0);
		System.out.println(sb);
	}
}
