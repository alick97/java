/*************************************************************************
	> File Name: Week.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 15时26分53秒
 ************************************************************************/
/***
 * 获取今天是星期几
 */



public class Week {
    public static int  getWeekOfToday () {
		// 1970-1-1 是 星期四
		long curMillis = System.currentTimeMillis();
		long dayMillis = 24 * 3600 * 1000;
		long day = curMillis / dayMillis;
		int curDay = (int)((day + 4) % 7);

		return curDay;
	}

	public static void main(String[] args) {
        String s = "";
		switch(getWeekOfToday()) {
			case 0:
				s = "星期天";
				break;
			case 1:
				s = "星期一";
				break;
			case 2:
				s = "星期二";
				break;
			case 3:
				s = "星期三";
				break;
			case 4:
				s = "星期四";
				break;
			case 5:
				s = "星期五";
				break;
			case 6:
				s = "星期六";
				break;
		}

		System.out.println("今天是" + s);
	}
}
