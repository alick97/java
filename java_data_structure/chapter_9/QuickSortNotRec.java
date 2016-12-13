/*************************************************************************
	> File Name: QuickSortNotRec.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 16时52分40秒
 ************************************************************************/
// 快排 的 非递归
// 利用自己实现 模拟桟帧

public class QuickSortNotRec {
	protected static class callFrame {
		public int pivot; // 分割的界线
		public int low;
		public int high;
		public int PC;// 第几次处理

		public callFrame(int l, int h) {
			pivot = l;
			low = l;
			high = h;
			PC = 1;
		}
	}

	public static void quickSortIterative(int data[], int n) {
		StackVector callStack = new StackVector();
		callStack.push(new callFrame(0, n - 1));
		while (!callStack.isEmpty()) {
			callFrame curr = (callFrame)callStack.get();
			if (curr.PC == 1) {
				//处理 左边
                if (curr.low >= curr.high) {
				 callStack.pop();
				 continue;
				}
				curr.pivot = partition(data, curr.low, curr.high);
				curr.PC++;
				callStack.push(new callFrame(curr.low, curr.pivot - 1));
			} else if (curr.PC == 2) {
				curr.PC++;
				// 处理右边
				callStack.push(new callFrame(curr.pivot + 1, curr.high));
			} else {
				callStack.pop();
				continue;
			}
		}
	}


	public static int partition(int[] data, int left, int right) {
        int key = data[right];
		while (left < right) {
            while (left < right &&data[left] <= key) {
				left++;
			}
			data[right] = data[left];
			 while (left < right && data[right] >= key) {
				 right--;
			 }

			 data[left] = data[right];
		}
		data[right] = key;
		return right;
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 - i;
		}

		quickSortIterative(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		System.out.println();

	}
}
