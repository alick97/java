/*************************************************************************
	> File Name: MapList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月22日 星期四 15时29分06秒
 ************************************************************************/
public class MapList {
	protected List data;
	public MapList() {
		data = new SinglyLinkedList();
	}

	public MapList(Map source) {
		this();
		putAll(source);
	}

	public Object put(Object k, Object v) {
		Association temp = new Association(k, v);
		Association result = (Association)data.remove(temp);
		data.add(temp);
		if (result == null) return null;
		else return result.getValue();
	}

	public Set keySet() {
		Set result = new SetList();
		Iterator i = data.iterator();
		while (i.hasNext()) {
			Assocaition a = (Association)i.next();
			result.add(a.getKey());
		}
		return result;
	}

	public Set entrySet() {
		Set result = new SetList();
		Iterator i = data.iterator();
        while (i.hasNext()) {
			Association a = (Association)i.next();
			result.add(a);
		}
		return result;
	}

	// Structure 自定义的数据结构的接口
    public Structure values() {
		Structure result = new SinglyLinkList();
		Iterator i = new ValueIterator(data.iterator());
		while (i.hasNext()) {
			result.add(i.next());
		}

		return result;
	}
}
