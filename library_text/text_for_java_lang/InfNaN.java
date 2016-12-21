/*************************************************************************
	> File Name: InfNaN.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月28日 星期一 10时36分58秒
 ************************************************************************/
class InfNaN {
    public static void main(String[] args) {
		Double d1 = new Double(1/0.); // infinite
		Double d2 = new Double(0/0.); // NaN 非数字
		System.out.println(d1 + ": " + d1.isInfinite()+", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
	}
}
