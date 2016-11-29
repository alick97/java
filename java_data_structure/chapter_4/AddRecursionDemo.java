/*************************************************************************
	> File Name: AddRecursionDemo.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月29日 星期二 21时01分13秒
 ************************************************************************/
import java.util.*;

class AddRecursionDemo {

	private Vector v = new Vector();

    public void add(int index, Object value) {
		if (index >= v.size()) {
			v.add(value);
		}
		else {
			Object previous = v.get(index);
			this.add(index+1, previous);
			v.set(index, value);
		}
	}


	public static void main(String[] args) {
        AddRecursionDemo ard = new AddRecursionDemo();
		ard.add(0, 1);
		ard.add(0, 2);
		ard.add(0, 3);

	}
}
