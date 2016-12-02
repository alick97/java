/*************************************************************************
	> File Name: InsertionSort.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 15时11分27秒
 ************************************************************************/
/* 插入排序 */

public class InsertionSort {
	public static void sort(int[] arr, int n) {
		int numSorted = 1;
        int index;
		while (numSorted < n) {
			int temp = arr[numSorted];
			for (index = numSorted - 1; index >= 0; index--) {
				if (arr[index] > temp) {
					arr[index+1] = arr[index];
				} else {
					break;
				}
			}
			arr[index+1] = temp;
			numSorted++;
		}
	}

	public static void main (String[] args) {
		int[] arr = {
           1,9,7,4,5,3
		};

		InsertionSort.sort(arr, arr.length);
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();

	}
}
