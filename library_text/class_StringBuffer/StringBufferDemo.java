/*************************************************************************
	> File Name: StringBufferDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 19时02分50秒
 ************************************************************************/
class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());

		StringBuffer s = new StringBuffer();
		System.out.println("length: " + s.length() + "capacity: " + s.capacity());
		s.ensureCapacity(500);
		System.out.println("length: " + s.length() + "capacity: " + s.capacity());
		s.setLength(3);
		System.out.println("length: " + s.length() + "capacity: " + s.capacity());
	}
}
