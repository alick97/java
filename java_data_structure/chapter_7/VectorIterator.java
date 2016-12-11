/*************************************************************************
	> File Name: VectorIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 16时03分06秒
 ************************************************************************/
/* 向量迭代器*/

class VectorIterator extends AbstractIterator {
	protected Vector theVector;
	protected int current;

	public VectorIterator(Vector V) {
		theVector = v;
		reset();
	}

	public void reset() {
		current = 0;
	}

	public boolean hasNext() {
		return current < theVector.size();
	}

	public Object get() {
		return theVector.get(current);
	}

	public Object next() {
		return theVector.get(current++);
	}


}
