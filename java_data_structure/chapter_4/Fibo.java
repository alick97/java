/*************************************************************************
	> File Name: Fibo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月29日 星期二 21时43分34秒
 ************************************************************************/
// 斐波那契 数列 0,1,1,2,3,5,8
//
//



class Fibo {
	static public int fibo(int n) {
        assert n >= 0;
		if (n == 0) return 0;
        else if (n == 1) return 1;
		else return fibo(n - 2) + fibo(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(fibo(91));
	}
}
