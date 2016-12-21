/*************************************************************************
	> File Name: RTTI.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 16时23分54秒
 ************************************************************************/
// class 类的练习

class X {
	int a,b;
}

class Y extends X {
	double c;
}

class RTTI {
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Class<?> clObj;
		clObj = x.getClass();
		System.out.println("x is object of type: " + clObj.getName());

		clObj = y.getClass();
		System.out.println("y is object of type: " + clObj.getName());

		clObj = clObj.getSuperclass();
		System.out.println("y's superclass is " + clObj.getName());
	}
}
