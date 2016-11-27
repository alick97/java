/*************************************************************************
	> File Name: getCharDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 19时13分20秒
 ************************************************************************/
class getCharDemo {
	public static void main(String[] args) {
		String s = "This is a demo of getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];

		s.getChars(start, end, buf, 0 );
		System.out.println(buf);
		String s1 = "abc你好";
		byte[] b = new byte[20];
		b = s1.getBytes();

		System.out.println(b);

		try {
			String news = new String(b, "GBK");
			System.out.println(news);
			String news2 = new String(b, "UTF-8");
			System.out.println(news2);
		} catch(Exception e) {

		}


		char[] c2 = new char[100];
		c2 = s1.toCharArray();
		System.out.println(c2);
		
	}
}
