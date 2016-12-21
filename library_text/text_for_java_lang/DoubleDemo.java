/*************************************************************************
	> File Name: DoubleDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月28日 星期一 10时12分44秒
 ************************************************************************/
class DoubleDemo {
	public static void main(String[] args) {
		System.out.println(Double.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.POSITIVE_INFINITY); 

		Double dInfinity = new Double(Double.POSITIVE_INFINITY);
		System.out.println(dInfinity);

		Double d1 = new Double(3.14159);
		Double d2 = new Double("314159e-5");
		System.out.println(d1 + " = " + d2 +  " -> " + d1.equals(d2));
	}
}
