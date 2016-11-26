/*************************************************************************
	> File Name: Clock.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 15时07分17秒
 ************************************************************************/
/**
 * 测量代码的运行时间的类
 *
 */

public class Clock {
	protected boolean running;
	protected long start;
	protected long accum; // 总用时 单位 毫秒

	public Clock() {
		running = false;
		start = 0;
		accum = 0;
	}

	public void start() {
		running = true;
		start = System.currentTimeMillis();
	}

	public void stop() {
		running = false;
		accum += System.currentTimeMillis() - start;
	}

	public double read() {
		return (double)accum / (double)1000.0;
	}

	public void reset() {
		running = false;
		accum = 0;
	}

	public String toString() {
		return "<clock: " + read() +" seconds>";
	}


	public static void main(String[] args) {

		Clock c = new Clock();
		c.start();
		for (int i = 0; i < 1000000; i++) {
			
		}
		c.stop();
		System.out.println(c);
		c.reset();
		System.out.println(c);
	}
}



