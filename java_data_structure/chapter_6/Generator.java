/*************************************************************************
	> File Name: Generator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 15时41分45秒
 ************************************************************************/
/* 生成器的接口 */

public interface Generator {
	public abstract void reset();
	// post: 重置

	public abstract int next();
    // post: 返回下一次要生成的值
	
	public abstract int get();
	// post: 返回当前生成的值
}
