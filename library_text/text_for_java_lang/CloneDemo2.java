/*************************************************************************
	> File Name: CloneDemo2.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 16时06分26秒
 ************************************************************************/
//克隆

// 危险性 深浅拷贝的问题 多个引用同一个对象


class TestClone2 implements Cloneable {
	int a;
	double b;

	public TestClone2 clone() {
		try {
			return (TestClone2) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("Cloning not allowed.");
			return this;
		}
	}
}

class CloneDemo2 {
	public static void main(String[] args) {
		TestClone2 x1 = new TestClone2();
		TestClone2 x2;

		x1.a = 10;
		x1.b = 20.1;

		x2 = x1.clone();

		System.out.println(x1.a + " "+ x1.b);
		System.out.println(x2.a + " "+ x2.b);
	}
}
