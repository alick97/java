/*************************************************************************
	> File Name: SubStringCons.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月23日 星期三 14时39分59秒
 ************************************************************************/
class SubStringCons {
	public static void main(String[] args) {
		//byte ascii[] = {65, 66, 67, 68, 69, 70 };
		int ascii[] = {65, 66, 67, 68, 69, 70 };
//		String s1 = new String(ascii);
	//	System.out.println(s1);

		String s2 = new String(ascii, 2, 3);
		System.out.println(s2); // CDE
	}
}
