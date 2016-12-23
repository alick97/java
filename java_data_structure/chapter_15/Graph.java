/*************************************************************************
	> File Name: Graph.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月23日 星期五 19时15分32秒
 ************************************************************************/
// 图 接口

public interface Graph {
	public void add(Object label);

	public void addEdge(Object vtx1, Object vtx2, Object label);

	public Object remove(Object label);

	public Object removeEdge(Object vLabel1, Object vLabel2);

	public Object get(Object label);

	public Edge getEdge(Object label1, Object label2);

	public boolean contains(Object label);

	public boolean containsEdge(Object vLabel1, Objec vLabel2);

	public boolean visit(Object label);

	public boolean visitEdge(Edge e);

	public boolean isVisitEdge(Edge e);

	public void reset();

	public int size();

	public int degree(Object label);

	public int edgeCount();

	public Iterator iterator();

	public Iterator neighbors(Object label);

	public Iterator edges();

	public void clear();

	public boolean isEmpty();

	public boolean isDirected(); // 是否是有向图
}
