/*************************************************************************
	> File Name: MyVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 21时36分25秒
 ************************************************************************/
class MyVector {
	protected Object elementData[];
	protected int elementCount;
	protected int capacityIncrement; // 容量每次增长的大小 0则2倍的增长

	public MyVector() {
		this(10, 0);
	}

	public MyVector(int initialCapacity) {
		this(initialCapacity, 0);
	}

	public MyVector(int initialCapacity, int capacityIncr) {
		assert capacityIncr >= 0;
		capacityIncrement = capacityIncr;
		elementData = new Object[initialCapacity];
		elementCount = 0;
	}

	public Object get(int index) {
		return elementData[index];
	}

	public Object set(int index, Object obj) {
		Object previous = elementData[index];
		elementData[index] = obj;
		return previous;
	}

	public void add(Object obj) {
		ensureCapacity(elementCount + 1);
		elementData[elementCount] = obj;
		elementCount++;
	}

	public void add(int index, Object obj) {
		int i;
		for (i = elementCount;  i > index; i--) {
			elementData[i] = elementData[i-1];
		}

		elementData[index] = obj;
		elementCount++;
	}

	public Object remove(int where) {
		Object result = get(where);
		elementCount--;
		while (where < elementCount) {
			elementData[where] = elementData[where + 1];
			where++;
		}

		elementData[elementCount] = null;
		return result;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return elementCount;
	}


	public void ensureCapacity(int minCapacity) {
		if (elementData.length < minCapacity) {
			int newLength = elementData.length;
			if (capacityIncrement == 0) {
				if (newLength == 0) newLength = 1;
				while (newLength < minCapacity) {
					newLength *= 2;
				}
			}
			else {
				while (newLength < minCapacity) {
					newLength += capacityIncrement;
				}
			}
		Object[] newElementData = new Object[newLength];
		int i;
		for (i = 0; i < elementCount; i++) {
			newElementData[i] = elementData[i];
		}

		elementData = newElementData;
	}
}

	public static void main(String[] args) {
		MyVector v = new MyVector(2);
		v.add(new Integer(1));
		v.add(new Integer(2));
		v.add(new Integer(3));

		v.remove(1);

	}
}
