/*************************************************************************
	> File Name: AbstractGenerator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 15时46分20秒
 ************************************************************************/
abstract public class AbstractGenerator implements Generator {
	// 生成器的抽象类 
	
    protected int current; // 保存 最后生成的值
    
	public AbstractGenerator(int initial) {
		current = initial;
	}

	public AbstractGenerator() {
		this(0);
	}

	public void reset() {

	}

	public int set(int next) {
		int result = current;
		current = next;
		return result;
	}

	public int get() {
		return current;
	}

}
