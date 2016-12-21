/*************************************************************************
	> File Name: PBDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 20时57分53秒
 ************************************************************************/
class PBDemo {
	public static void main(String[] args) {
		try {
			ProcessBuilder proc = new ProcessBuilder("java","whiletrue");
		Process p = proc.start();
		Thread.sleep(10000000);
	    p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing java whiletrue.");
		}
	}
}
