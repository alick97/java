/*************************************************************************
	> File Name: BubbleSort.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 14时42分35秒
 ************************************************************************/
/* 冒泡排序 */

class BubbleSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void sort(int[] arr, int n) {
		int numSorted = 0;
		int index;
		while (numSorted < n) {
			boolean isOk = true;
			for (index = 1; index < n - numSorted; index++) {
				if (arr[index - 1] > arr[index]) {
					swap(arr, index - 1, index);
					isOk = false;
				}
			}
			if (isOk) {
				break;
			}
			numSorted++;
		}
	}

	public static void main (String[] args) {
		int[] arr = {
           1,9,7,4,5,3
		};

		BubbleSort.sort(arr, arr.length);
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();
	}
}
