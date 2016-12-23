/*************************************************************************
	> File Name: Edge.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月23日 星期五 19时26分43秒
 ************************************************************************/
// 图中的 边

public class Edge {
	public Edge(Object vtx1, Object vtx2, Object label, boolean directed);

	public Object here(); // 第一个节点

	public Object there(); // 第二个节点

	public void setLabel(Object label);

	public Object label();

	public boolean visit();

	public boolean isVisited();

	public boolean isDirected();

	public void reset();

	public boolean equals(Object o);

}
