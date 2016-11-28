/*************************************************************************
	> File Name: StringFrequency.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 20时25分37秒
 ************************************************************************/

import java.util.*;
import java.io.*;

class StringFrequency {
	public static void main(String[] args) throws IOException {
		Vector vocab = new Vector(1000);
		//ReadStream  r = new ReadStream();
		BufferedReader  r = new BufferedReader( new InputStreamReader(System.in));
		int i;
		String word ;//= ;
		for (; (word =  r.readLine()) != null; ) {
			Association wordInfo;
			String vocabWord; // word in list

			for (i = 0; i < vocab.size(); i++) {
				wordInfo = (Association)vocab.get(i);

				vocabWord = (String) wordInfo.getKey();
				if (vocabWord.equals(word)) {
					Integer f = (Integer)wordInfo.getValue();
					wordInfo.setValue(new Integer(f.intValue() + 1));
					break;
				}
			}

			if (i == vocab.size()) {
				vocab.add(new Association(word, new Integer(1)));
			}
		}

		for (i = 0; i < vocab.size(); i++) {
			Association wordInfo = (Association)vocab.get(i);
			System.out.println("key: " + wordInfo.getKey() + " value: " + wordInfo.getValue());
		} 
	}
}


class Association {
	protected Object theKey;
	protected Object theValue;

	public Association(Object key, Object value) {
		assert key != null;
		theKey = key;
		theValue = value;
	}

	public Association(Object key) {
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
}
