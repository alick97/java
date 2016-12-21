/*************************************************************************
	> File Name: StringConversions.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 18时49分05秒
 ************************************************************************/
/* binary , hexadecimal and octal . convert */

class StringConversions {
	public static void main(String[] args) {
		int num = 19648;
		System.out.println(num + " in binary: " + Integer.toBinaryString(num));
		System.out.println(num + " in octal: " + Integer.toOctalString(num));
		System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
		System.out.println(Integer.toHexString(num) + "hex ->  dec " + Integer.valueOf(Integer.toHexString(num), 16));
	}
}
