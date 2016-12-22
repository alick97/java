/*************************************************************************
	> File Name: Hashtable.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月22日 星期四 15时44分18秒
 ************************************************************************/
public class Hashtable {
	// Association 键值对
	protected static Association reserved = new Association("reserved", null);
	protected Association data[];
	protected int count;
	protected int capacity;
	protected final double loadFactor = 0.6;// 哈希表的装填因子

	public Hashtable(int initialCapacity) {
		assert initialCapacity > 0;
		data = new Association[initialCapacity];
		capacity = initialCapacity;
		count = 0;
	}

	public Hashtable() {
		this(997);
	}

    protected int loacte(Object key) {
		int hash = Math.abs(key.hashCode() % capacity);
		int firstReserved = -1;
		while (data[hash] != null) {
			// reserved 是已经删除的 这里只是更新记录值
			if (data[hash] == reserved) {
				if (firstReserved == -1) {
					firstReserved = hash;
				}
			} else {
				if (key.equals(data[hash].getKey())) {
					return hash;
				}
			}
			hash = (1 + hash) % capacity; // 线性探测
		}
        if (firstReserved == -1) {
			return hash;
		} else {
			return firstReserved;
		}
	}

    public Object put(Object key, Object value) {
		if (loadFactor * capacity <= (1 + count)) {
			extend(); // 重新构造大空间的哈希表
		}

		int hash = locate(key);
		Association a = data[hash];
		if (a == null || a == reserved) {
			data[hash] = new Association(key, value);
			count++;
			return null;
		} else {
			Object oldValue = a.getValue();
			a.setValue(value);
			return oldValue();
		}
	}

	public Object get(Object key) {
		int hash = locate(key);
		Association a = data[hash];
		if (a == null || a == reserved)
			return null;
		else 
			return data[hash].getValue();
	}

	public boolean containsValue(Object value) {
		Iterator i = iterator();
		while (i.hasNext()) {
			Object nextValue = i.next();
			if (nextValue != null && nextValue.equals(value)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsKey(Object key) {
		int hash = locate(key);
		return data[hash] != null && data[hash] != reserved;
	}

	public Object remove(Onject key) {
		int hash = locate(key);
		Association a = data[hash];
		if (a == null || a == reserved) {
			return null;
		}
		count--;
		Object oldValue = a.getValue();
		data[hash] = reserved;
		return oldValue;
	}

	public Structure values() {
		List result = new SinglyLinkedList();
		Iterator i = new ValueIterator(new HashtableIterator(data));
		while (i.hasNext()) {
			result.add(i.next());
		}

		return result;
	}
}

class ValueIterator extends AbstractIterator {
	protected Iterator slave;

	public ValueIterator(Iterator slave) {
		this.slave = slave;
	}

	public boolean hasNext() {
		return slave.hasNext();
	}

	public Object next() {
		Association pair = (Association)((AbstractIterator)slave).next();
		return pair.getValue();
	}
}

// 还有底层基于有序表的 data是有序表的map 等等 这里就不写了
