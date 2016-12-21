/*************************************************************************
	> File Name: NaturalComparator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月14日 星期三 19时58分36秒
 ************************************************************************/
// 基于比较器的方法

import java.util.Comparator;
public class NaturalComparator implements Comparator {
	public int compare(Object a, Object b) {
		return ((Comparable) a).compareTo(b);
	}

	public boolean equals(Object b) {
		return (b != null) && (b instanceof NaturalComparator);
	}
}
