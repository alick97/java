/*************************************************************************
	> File Name: insertDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时25分14秒
 ************************************************************************/
class insertDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("I Java!");

		sb.insert(2, "like ");
		System.out.println(sb);

		StringBuffer ss = new StringBuffer("I am cc ,");
		ss.insert(ss.length(), sb);
		System.out.println(ss);
	}
}
