/*************************************************************************
	> File Name: PriorityQueue.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 10时51分08秒
 ************************************************************************/
// 优先级队列 接口

public interface PriorityQueue {
    public Comparable getFirst();
	public Comparable remove();
	public void add(Comparable value);
	public boolean isEmpty();
	public int size();
	public void clear();

}
