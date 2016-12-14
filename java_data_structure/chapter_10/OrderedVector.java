/*************************************************************************
	> File Name: OrderedVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月14日 星期三 19时36分05秒
 ************************************************************************/
// 有序向量 和 二分查找

import java.util.*;

public class OrderedVector {
	protected Vector data;

	public OrderedVector() {
		data = new Vector();
	}

	// 二分查找
	// 返回找到的位置 或 希望插入的位置
	public int indexOf(Comparable target) {
		Comparable midValue;
		int low = 0;
		int high = data.size(); // [)
		int mid = low + (high - low) / 2;
		while (low < high) {
			midValue = (Comparable)data.get(mid);
			if (midValue.compareTo(target) < 0) {
				low = mid + 1;
			} else {
				// >=
				high = mid;
			}

			mid = low + (high - low) / 2;
		}
		return low;
	}

	public void add(Object value) {
		int position = indexOf((Comparable)value);
		data.add(position, value);
	}

	public boolean contains(Object value) {
		int position = indexOf((Comparable)value);
		return (position < data.size()) && data.get(position).equals(value);
	}

	public Object remove(Object value) {
		if (contains(value)) {
            int position = indexOf((Comparable)value);
			Object target = data.get(position);
			data.remove(position);
			return target;
		}
		return null;
	}

	public Iterator iterator() {
		return data.iterator();
	}

	public boolean isEmpty() {
		return data.size() == 0;
	}

	public void clear() {
		data.setSize(0);
	}

	public int size() {
		return data.size();
	}
}
