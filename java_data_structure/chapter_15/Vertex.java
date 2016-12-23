/*************************************************************************
	> File Name: Vertex.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月23日 星期五 19时23分48秒
 ************************************************************************/
// 图中的节点
//


abstract class Vertex {
	public Vertex(Object label);

	public Object label();

	public boolean visit();

	public boolean isVisited();

	public void reset();

	public boolean equals(Object o);
}
