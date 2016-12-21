/*************************************************************************
	> File Name: Elapsed.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 15时44分05秒
 ************************************************************************/
class Elapsed {
	public static void main(String[] args) {
		long start, end;
		// ji suan yun xing de shi jian
		System.out.println("Timing a for loop from 0 to 100000000");
        long nanoTimeStart = System.nanoTime();
		start = System.currentTimeMillis();
		for(long i = 0; i < 100000000; i++) {

		}
		end = System.currentTimeMillis();

		System.out.println("Eclapsed time: " + (end - start));
		System.out.println("nanoTime" + (System.nanoTime() - nanoTimeStart));
	}
}
