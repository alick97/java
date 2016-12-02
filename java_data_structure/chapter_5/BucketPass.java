/*************************************************************************
	> File Name: BucketPass.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 18时17分50秒
 ************************************************************************/
/*   基数排序   桶排序  */
import java.util.*;
class BucketPass {
	public static int digit(int n, int d) {
		// 返回对应位置的数
		// 0 表示个位
		while (d-- > 0) {
            n /= 10;
		}

		return n % 10;
	}

	public static void sort(int[] data, int d) {
		// 按照d位 排序
		// d >= 0 , 0 表示个位

		int i,j;
		int value;
		Vector[] bucket = new Vector[10];

		for (j = 0; j < 10; j++) {
			bucket[j]  = new Vector();
		}

		int n = data.length;
		for (i = 0; i < n; i++) {
			value = data[i];
			j = digit(value, d);
			bucket[j].add(new Integer(value));
		}
		i = n;
		for (j = 9; j >= 0; j--) {
			while (!bucket[j].isEmpty()) {
				i--;
				value = ((Integer)bucket[j].remove(bucket[j].size() - 1)).intValue();
				data[i] = value;
			}
		}

	}

	public static void main (String[] args) {
		int[] arr = {
           11,29,37,14,35,23
		};

		BucketPass.sort(arr, 0); // 个位
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();
		BucketPass.sort(arr, 1); // 十位
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();
	}
}
