/*************************************************************************
	> File Name: Map.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月22日 星期四 15时20分15秒
 ************************************************************************/
import java.util.*;

public interface Map {
	public abstract int size();

	public abstract boolean isEmpty();

	public abstract boolean containsKey(Object k);

	public abstract boolean containsValue(Object v);

	public abstract Object get(Object k);

	public abstract Object put(Object k, Object v);

	public abstract Object remove(Object k);

	public abstract void putAll(Map other);

    public abstract void clear();

	public abstract Set keySet();

//	public abstract Structure values();

	public abstract Set entrySet();

	public abstract boolean equals(Object other);

	public abstract int hashCode();
}
