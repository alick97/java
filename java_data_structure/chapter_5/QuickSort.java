/*************************************************************************
	> File Name: QuickSort.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 16时26分01秒
 ************************************************************************/
/* 快速排序  */

class QuickSort {
	public static int partition(int[] data, int left, int right) {
		// pre: left <= right
		// post: data[left] placed in correct (returned ) location
		while (true) {
			while (left < right && data[left] < data[right]) {
				right--;
			}

			if (left < right) {
				swap(data, left++, right);
			}
			else {
				return left;
			}

			while (left < right && data[left] < data[right]) {
				left++;
			}

			if (left < right) {
				swap(data, left, right--);
			} else {
				return right;
			}
		}
	}


	public static void sort(int[] data, int n) {
		QuickSortRecurisive(data, 0, n -1);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	// [left, right]
	private static void QuickSortRecurisive(int[] data, int left, int right) {
		if (left >= right) {
			return;
		}
		int index = partition(data, left, right);
		QuickSortRecurisive(data, left, index -1);
		QuickSortRecurisive(data, index + 1, right);
	}

	public static void main (String[] args) {
		int[] arr = {
           1,9,7,4,5,3
		};

		QuickSort.sort(arr, arr.length);
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();
	}
}
