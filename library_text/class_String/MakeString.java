/*************************************************************************
	> File Name: MakeString.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月23日 星期三 14时35分38秒
 ************************************************************************/
class MakeString {
	public static void main(String[] args) {
		char c[] = { 'J', 'a', 'v', 'a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		System.out.println(s1 + '\n' + s2);
	}
}
