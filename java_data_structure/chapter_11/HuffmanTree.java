/*************************************************************************
	> File Name: HuffmanTree.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016骞�12鏈�16鏃� 鏄熸湡浜� 12鏃�53鍒�04绉�
 ************************************************************************/
// 闇嶅か鏇兼爲
import java.io.*;
import java.util.LinkedList;
import java.util.Iterator;

class Leaf {
	protected int frequency; // 棰戠巼
    protected char ch;

	public Leaf(char c) {
		ch = c;
		frequency = 1;
	}

	public boolean equals(Object other) {
		return this.ch == ((Leaf)other).ch;
	}
}

public class HuffmanTree implements Comparable {
    private BinaryTree root;
	private int totalWeight; // weight of tree
	private Leaf leaf;

	public HuffmanTree(Leaf e) {
		totalWeight = e.frequency;
		root = new BinaryTree(this);
		leaf = e;
	}

	public HuffmanTree(int weight) {
		totalWeight = weight;
		root = new BinaryTree(this);
		leaf = null;
	}

	public BinaryTree root() {
		return root;
	}

	public HuffmanTree(HuffmanTree left, HuffmanTree right) {
		totalWeight = left.totalWeight + right.totalWeight;
		root = new BinaryTree(new HuffmanTree(totalWeight));
		leaf = null;
		root.setLeft(left.root());
		root.setRight(right.root());
	}

	public int compareTo(Object other) {
		if (this.totalWeight > ((HuffmanTree)other).totalWeight) {
			return 1;
		}
		else if(this.totalWeight < ((HuffmanTree)other).totalWeight) {
           return -1;
		} else {
			return 0;
		}
	}

	public boolean equals(Object other) {
		return this.totalWeight == ((HuffmanTree)other).totalWeight;
	}

	public void print() {
        print(root, "");
	}

	protected void print(BinaryTree r, String representation) {
        if (r == BinaryTree.EMPTY) {
			return;
		}

		if (r.left() == BinaryTree.EMPTY && r.right() == BinaryTree.EMPTY) {
			Leaf tl = ((HuffmanTree)r.value()).leaf;
			if (tl == null) {
				System.out.println("tl is null");
			}
			else
			System.out.println(tl.ch + " : " + representation + " : " + tl.frequency);
			return;
		}
		
		print(r.left(), representation + "0");
		print(r.right(), representation + "1");

	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList freq = new LinkedList();
		
			int ch;
		while ((ch = br.read()) != -1) {
			char c = (char)ch;
			Leaf query = new Leaf(c);
			if (freq.indexOf(query) == -1) {
				freq.add(query);
			} else {
                Leaf item = (Leaf)freq.remove(freq.indexOf(query));
				item.frequency++;
				freq.add(item);
			}
		}
		
		/*  debug
		for (char c = 'a'; c < 'c'; c++) {
			freq.add(new Leaf(c));
		}
		*/

		Iterator li = freq.listIterator();
        // OrderedList 鑷繁鐨勭被 鎺掑簭閾捐〃
		OrderedList trees = new OrderedList();
		while (li.hasNext()) {
			trees.add(new HuffmanTree((Leaf)li.next()));
		}

		Iterator ti = trees.iterator();
		while (trees.size() > 1) {
			ti = trees.iterator();
			HuffmanTree smallest = (HuffmanTree)ti.next();
			HuffmanTree small = (HuffmanTree)ti.next();

			trees.remove(smallest);
			trees.remove(small);
			trees.add(new HuffmanTree(smallest, small));
		}

		if(trees.size() > 0) {
		ti = trees.iterator();
		HuffmanTree enconding = (HuffmanTree)ti.next();
		enconding.print();
		}
	}

}
