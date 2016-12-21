/*************************************************************************
	> File Name: MemoryDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 19时36分42秒
 ************************************************************************/
// Demonstrate totalMemory().freeMemory() and gc().
//                                             garbage
//
import java.io.*;

class T {
	Integer a;
	T(int a) {
		this.a = a;
	}

	public String toString() {
		return a + "";
	}
}


class MemoryDemo {
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		T tArray[] = new T[1000];
		System.out.println("Total memory is: " + r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial free memory: " + mem1);
		for (int i= 0; i < 1000; i++) {
			tArray[i] = new T(i); // allocate integers
		}

		Thread.sleep(1000);
		mem2 = r.freeMemory();
//     在 java中 执行别的程序		
		Process p = null;
		try {
//			p = r.exec("ls -al ");
            p = r.exec("netstat -aux");
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing top");
		}
        System.out.println("p.exitValue(): " +p.exitValue());
		System.out.println("Free memory after allocation: " + mem2);
		System.out.println("Memory used by allocation: " + (mem1 - mem2));
		for (int i= 0; i < 1000; i++) 
			tArray[i] = null;

		r.gc();
		mem2 = r.freeMemory();
		System.out.println("Free memory after collecting discarded Integers: " + mem2 );
	}
}
