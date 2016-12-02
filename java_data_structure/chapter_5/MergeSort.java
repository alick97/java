/*************************************************************************
	> File Name: MergeSort.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 15时52分08秒
 ************************************************************************/
/* 归并排序 */

class MergeSort {
	private static void merge(int data[], int temp[], int low, int middle, int high) {
		// pre: data[middle..high] are ascending
		//      temp[low..middle - 1] are ascending
	    // temp的数据长度 要比 data 从middle开始的数据的数据长度小 或 等于
		// post: data[low..high] contains all values in ascending order
        int ri = low; // result index
		int ti = low; // temp index
		int di = middle; // destination index

		while (ti < middle && di < high) {
			if (data[di] < temp[ti]) {
				data[ri++] = data[di++];
			} else {
				data[ri++] = data[ti++];
			}
		}

		while (ti < middle) {
			data[ri++] = temp[ti++];
		}
	}


    private static void mergeSortRecursive(int data[], int temp[], int low, int high) {
		// pre: 0 <= low <= high < data.length
		// post: value in data[low..high] are in ascending order.

		int n = high - low + 1;
		int middle = low + n/2;
		int i;

		if (n < 2) return;

		for (i = low; i < middle; i++) {
			temp[i] = data[i];
		}

		// sort lower half of array
		// !!! notice parameter is [temp ,data] not [data, temp]
		mergeSortRecursive(temp, data, low, middle - 1);
		// sort upper half of array
		mergeSortRecursive(data, temp, middle, high);

		// merge halves together
		merge(data, temp, low, middle, high);
	}


	public static void sort(int data[], int n) {
		// pre: 0 <= n <= data.length
		// post: values in data[0..n-1] are in ascending order

		mergeSortRecursive(data, new int[n], 0 , n - 1);
	}

	public static void main (String[] args) {
		int[] arr = {
           1,9,7,4,5,3
		};

		MergeSort.sort(arr, arr.length);
		for (int x : arr) {
			System.out.print("  " + x);
		}
		System.out.println();
	}
}
