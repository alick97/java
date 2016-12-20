/*************************************************************************
	> File Name: VectorHeap.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 12时15分36秒
 ************************************************************************/
// 基于数组的 堆

import java.util.*;

public class VectorHeap {
	protected Vector data;

	public VectorHeap() {
		data = new Vector();
	}

	public VectorHeap(Vector v) {
        int i;
		data = new Vector(v.size());
		for (i = 0; i < v.size(); i++) {
			add((Comparable)v.get(i));
		}
	}

    protected static int parent(int i) {
		return (i - 1) / 2;
	}

	protected static int left(int i) {
		return 2*i + 1;
	}

	protected static int right(int i) {
		return 2 * (i + 1);
	}

	// 向上调整
	protected void percolateUp(int leaf) {
		assert leaf >= 0 && leaf < data.size();
		int parent = parent(leaf);
		Comparable value = (Comparable)data.get(leaf);
		while (leaf > 0 && value.compareTo((Comparable)data.get(parent)) < 0) {
			data.set(leaf, data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf, value);
	}

	public void add(Comparable value) {
        data.add(value);
		percolateUp(data.size() - 1);
	}

    // 向下调整
	protected void pushDownRoot(int root) {
		assert root >= 0 && root < data.size();
		int heapSize = data.size();
		Comparable value = (Comparable)data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize) {
				if (right(root) < heapSize && ((Comparable) data.get(childpos+1)).compareTo(((Comparable)data.get(childpos))) < 0) {
						childpos++;
				}

				if (((Comparable)data.get(childpos)).compareTo(value) < 0) {
					data.set(root, data.get(childpos));
					root = childpos;
				} else {
					data.set(root, value);
					return;
				}

			} else {
				data.set(root, value);
				return;
			}
		}
	}

	public Comparable remove() {
		assert !data.isEmpty();
		Comparable minVal =  getFirst();
		data.set(0, data.get(data.size() - 1));
		data.setSize(data.size() - 1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

	public Comparable getFirst() {
		assert !data.isEmpty();
		return (Comparable)data.get(0);
	}
}
