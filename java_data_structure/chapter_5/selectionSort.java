/*************************************************************************
	> File Name: selectionSort.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 14时59分34秒
 ************************************************************************/
/* 选择排序 */

class selectionSort {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void sort(int[] arr, int n) {
		// pre: 0 <= n<= data.length
		// post: values int data[0..n-1] are in ascending order
		int numUnsorted = n;
		int index;
		int max;
		while (numUnsorted > 0) {
			max = 0;
			for (index = 1; index < numUnsorted; index++) {
				if (arr[max] < arr[index]) max = index;
			}
			swap(arr, max, --numUnsorted);
		}
	}
	
	public static void main (String[] args) {
		int[] arr = {
           1,9,7,4,5,3
		};

		selectionSort.sort(arr, arr.length);
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();

	}

}
