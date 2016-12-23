/*************************************************************************
	> File Name: GraphListVertex.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月23日 星期五 21时42分16秒
 ************************************************************************/
// 基于 邻接表的 图的节点

class GraphListVertex extends Vertex {
	protected Structure adjacencies; // adjacent edges 邻近的
	public GraphListVertex(Object key) {
		super(key);
		adjacencies = new SinalyLinkedList();
	}

	public void addEdge(Edge e) {
        if (!containsEdge(e)) {
			adjacencies.add(e);
		}
	}

	public boolean containsEdge(Edge e) {
		return adjacencies.contains(e);
	}

	public Edge removeEdge(Edge e) {
        return (Edge)adjacencies.remove(e);
	}

	public Edge getEdge(Edge e) {
		Iterator edges = adjacencies.iterator();
		while (edges.hasNext()) {
			Edge adjE = (Edge)edges.next();
			if (e.equals(adjE))
				return adjE;
		}
		return null;
	}

	public int degree() {
		return adjacencies.size();
	}

	public Iterator adjacentVertices() {
		return new GraphListAIterator(adjacentEdges(), label());
	}

	public Iterator adjacentEdges() {
		return adjacencies.iterator();
	}
}
