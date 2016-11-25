/*************************************************************************
	> File Name: atinLay.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月25日 星期五 22时03分26秒
 ************************************************************************/
/* 一般用途类：关联 */

public class atinLay {
	protected Object theKey;
	protected Object theValue;

	atinLay(Object key, Object value) {
		theKey = key;
		theValue = value;
	}

	atinLay(Object key) {
		this(key, null);
	}

	public Object getValue() {
		return theValue;
	}

	public Object getKey() {
		return theKey;
	}

	public Object setValue(Object value) {
        Object oldValue = theValue;
		theValue = value;
		return oldValue;
	}


	public static void main(String[] args) {
        atinLay dict[] = new atinLay[9];
		for (int i = 0; i < dict.length; i++) {
			dict[i] = new atinLay("a" + i, "the value is " + i);
		}

		for (int argn = 0; argn < args.length; argn++) {
			for (int dictn = 0; dictn < dict.length; dictn++) {
				if (dict[dictn].getKey().equals(args[argn])) {
					System.out.println(dict[dictn].getValue());
				}
			}
		}
	}
}
