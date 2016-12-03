/*************************************************************************
	> File Name: ConstantGenerator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 15时55分47秒
 ************************************************************************/
 /* 常量生成器 */
public class ConstantGenerator extends AbstractGenerator {
	public ConstantGenerator(int c) {
        set(c);
	}

	public int next() {
		return get();
	}
}
