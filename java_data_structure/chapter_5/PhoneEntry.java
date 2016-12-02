/*************************************************************************
	> File Name: PhoneEntry.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月02日 星期五 18时49分31秒
 ************************************************************************/
/* 对象排序*/

class PhoneEntry {
	String name;
	String title;
	int extension; // telephone number
	int room;
	String building;
	
	public PhoneEntry(String n, String t, int e, String b, int r) {
        name = n;
		title = t;
		extension = e;
		r = r;
		building = b;
	}

	public int compareTo(PhoneEntry other) {
		if (this.extension != other.extension)
		{
			return this.extension - other.extension;
		}
		else {
			return this.name.compareTo(other.name);
		}
	}

    public static void insertionSort(PhoneEntry[] data, int n) {
		int numSorted = 1;
		int index;
		while (numSorted < n) {
			PhoneEntry temp = data[numSorted];
			for (index = numSorted; index > 0; index-- ) {
				if (data[index - 1].compareTo(temp) > 0) {
					data[index] = data[index - 1];
				}
				else {
					break;
				}
			}

			data[index] = temp;
			numSorted++;
		}
	}

	public String toString() {
		return "name: " + name + "  title: " + title + " extension:  " + extension + " room: " + room + " building: " + building;
	}

	public static void main(String[] args) {
		PhoneEntry[] pv = new PhoneEntry[4];
		pv[0] = new PhoneEntry("cc", "tc", 10086, "build133" ,  12223433);
		pv[1] = new PhoneEntry("dd", "ds" ,10087, "build134" ,343432434);
		pv[2] = new PhoneEntry("Ac", "4c", 10086, "build143" ,656675767);
		pv[3] = new PhoneEntry("cB", "tc", 10085, "build133" ,123343456);


		PhoneEntry.insertionSort(pv, pv.length);

		for (int i = 0; i < pv.length; i++) {
			System.out.println(pv[i]);
			System.out.println();
		}
	}
}
