/*************************************************************************
	> File Name: ChangeCase.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 16时25分15秒
 ************************************************************************/
/*  转换 大小 写*/

class ChangeCase {
	public static void main(String[] args) {
		String s = "This is a test.";
		System.out.println("Original: " + s);

		String upper = s.toUpperCase();
		String lower = s.toLowerCase();

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}
}
