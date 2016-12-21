/*************************************************************************
	> File Name: IsDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 19时07分44秒
 ************************************************************************/
/* character test*/
class IsDemo {
	public static void main(String[] args) {
		char a[] = {
            'a', 'b', '5', '?', 'A', ' '
		};

		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i]))
				System.out.println(a[i] + " is a digit.");
			if (Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			if (Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is  whitespace.");
			if (Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is uppercase.");
			if (Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is lowerCase.");
		}
	}
}
