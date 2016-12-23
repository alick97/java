/*************************************************************************
	> File Name: GraphicMatrix.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月23日 星期五 19时31分08秒
 ************************************************************************/
// 基于邻接矩阵 的 图
//
//

class GraphicMatrix implements Grap {
	protected int size();
	protected Edge data[][];
	protected Map dict;
	protected List freeList;// 没有使用的节点
	protected boolean directed;
	
	protected GraphicMatrix(int size, boolean dir) {
		this.size = size;
		directed = dir;
		data = new Edge[size][size];
		dirc = new Hashtable(size);
		freeList = new SinglyLinkedList();
		for (int row = size -1; row >= 0; row--) {
			freeList.add(new Integer(row));
		}
	}

	public GraphicMatrix(int size) {
		super(size, true);// 有向图
	}

	public void add(Object label) {
		if (dict.containsKey(label))
			return;
		assert !freeList.isEmpty();
		int row = ((Integer)freeList.removeFirst()).intValue();

		dict.put(label, new GraphMatrixVertex(label, row));
	}

	public Object remove(Object label) {
		GraphMatrixVertex vert;
		vert = (GraphMatrixVertex)dict.remove(label);
		if (vert == null) return null;

		int index = vert.index();

		for (int row = 0; row < size; row++) {
		    //行列都删除
			data[row][index] = null;
			data[index][row] = null;
		}

		freeList.add(new Integer(index));
        return vert.label();
	}

	public void addEdge(Object vLabel1, Object vLabel2, Object label) {
		GraphMatrixVertex vtx1, vtx2;
		vtx1 = (GraphMatrixVertex)dict.get(vLabel1);
		vtx2 = (GraphMatrixVertex)dict.get(vLabel2);

		Edge e = new Edge(vtx1.label(), vtx2.label(), label, false);
		data[vtx1.index()][vtx2.index()] = e;
		data[vtx2.index()][vtx1.index()] = e;
	}
	//
/*  有向图的 addEdge
	public void addEdge(Object vLabel1, Object vLabel2, Object label) {
		GraphMatrixVertex vtx1, vtx2;
		vtx1 = (GraphMatrixVertex) dict.get(Label1);
		vtx2 = (GraphMatrixVertex) dict.get(label2);

		Edge e = new Edge(vtx1.label(), vtx2.label(), label, true);
		data[vtx1.index()][vtx2.index()] = e;
	}
*/
// 无向图 的删除
	public Object removeEdge(Object vLabel1, Object vLabel2) {
		int row = ((GraphMatrixVertex)dict.get(vLabel1)).index();
		int col = ((GraphMatrixVertex)dict.get(vLabel2)).index();

		Edge e = data[row][col];
		data[row][col] = null;
		data[col][row] = null;
		if (e == null) {
			return null;
		} else {
			return e.label();
		}
	}

	public boolean visit(Object label) {
		Vertex vert = (Vertex) dict.get(label);
		return vert.visit();
	}

	public Iterator iterator() {
		return dict.keySet().iterator();
	}

	public Iterator neighbors(Object label) {
		GraphMatrixVertex vert;
		vert = (GraphMatrixVertex)dict.get(label);
		List list = new SinglyLinkedList();
		for (int row = size - 1; row >= 0; row--) {
			Edge e = data[vert.index()][row];
			if (e != null) {
				if (e.here().equals(vert.label())) {
					list.add(e.there());
				} else {
					list.add(e.here());
				}
			}
		}
		return list.iterator();
	}

	public Iterator edges() {
		List list = new SinglyLinkedList();
		for (int row = size - 1; row >= 0; row--) {
			for (int col = size -1 ; col >= row; col--) {
				Edge e = data[row][col];
				if (e != null)
					list.add(e);
			}
		}
		return list.iterator();
	}
}
