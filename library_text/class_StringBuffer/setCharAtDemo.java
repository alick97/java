/*************************************************************************
	> File Name: setCharAtDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时11分37秒
 ************************************************************************/
class setCharAtDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("charAt(1) -> " + sb.charAt(1));


		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println(sb);
	}
}
