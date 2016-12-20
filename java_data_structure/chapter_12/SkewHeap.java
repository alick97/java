/*************************************************************************
	> File Name: SkewHeap.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 12时55分11秒
 ************************************************************************/
// 偏斜堆  堆的形态不一定是完全的树

public class SkewHeap {
    protected BinaryTree root;
	protected int count;

	public SkewHeap() {
        root = BinaryTree.EMPTY;
		count = 0;
	}

	public Comparable getFirst() {
		assert count > 0;
		return (Comparable)(root.value());
	}

	// classic
    protected static BinaryTree merge(BinaryTree left, BinaryTree right) {
        if (left.isEmpty())
			return right;
		if (right.isEmpty()) 
			return left;

		// 如果左边没有 左子堆 右边作为左边的 左子堆
		// 否则 ，交换左边堆的左右子堆 【递归】然后左边堆的左子堆和右边堆进行合并

        Comparable leftValue = (Comparable)(left.value());
		Comparable rightValue = (Comparable)(right.value());
		BinaryTree result;
		if (rightValue.compareTo(leftValue) < 0) {
			result = merge(right, left);
		}else {
			//  左边比右边的值小
			result = left;
			if (result.left().isEmpty()) {
				result.setLeft(right);
			} else {
				// 交换 【防止向一边偏移 退化】
				BinaryTree temp = result.right();
				result.setRight(result.left());
				result.setLeft(merge(temp, right));
			}
		}
		return result;
	}

    public void add(Comparable value){
        BinaryTree smallTree = new BinaryTree(value);
		root = merge(smallTree, root);
		count++;
	}

	public Comparable remove() {
		assert count > 0;
		Comparable result = (Comparable)(root.value());
		// classic
		root = merge(root.left(), root.right());
		count--;
		return result;
	}
}
