/*************************************************************************
	> File Name: CloneDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 16时06分26秒
 ************************************************************************/
//克隆

// 危险性 深浅拷贝的问题 多个引用同一个对象


class TestClone implements Cloneable {
	int a;
	double b;

	TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("Cloning not allowed.");
			return this;
		}
	}
}

class CloneDemo {
	public static void main(String[] args) {
		TestClone x1 = new TestClone();
		TestClone x2;

		x1.a = 10;
		x1.b = 20.1;

		x2 = x1.cloneTest();

		System.out.println(x1.a + " "+ x1.b);
		System.out.println(x2.a + " "+ x2.b);
	}
}
