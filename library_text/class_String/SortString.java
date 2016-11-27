/*************************************************************************
	> File Name: SortString.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 20时50分42秒
 ************************************************************************/
// 利用String的compareTo 方法

class SortString {
	static String arr[] = {
        "now", "is", "the", "time", "for", "all", "good", "men",
		"to", "come", "to", "the", "aid", "of", "their", "country"
	};

	public static void main(String[] args) {
		boolean isok = true;
		for (int i = 0; i < arr.length; i++) {
			isok = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					String t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					isok = false;
				}
			}
			if (isok) {
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
