/*************************************************************************
	> File Name: Matrix.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 23时04分23秒
 ************************************************************************/
/*  矩阵类 */
import java.util.*;

class Matrix {
	protected int height;
	protected int width;
	protected Vector rows;

	public Matrix(int h, int w) {
		assert h >= 0&& w >= 0;
		height = h;
		width = w;

		rows = new Vector(height);
		for (int r = 0; r < height; r++) {
			Vector theRow = new Vector(width);
			rows.add(theRow);

			for (int c = 0; c < width; c++) {
				theRow.add(null);
			}
		}
	}


	public Object get(int row, int col) {
		assert row >= 0 && row < height;
		assert col >= 0 && col < width;
		Vector theRow = (Vector)rows.get(row);
		return theRow.get(col);
	}

	public void set(int row, int col, Object value) {
		assert row >= 0 && row < height;
		assert col >= 0 && col < width;
		Vector theRow = (Vector)rows.get(row);
		theRow.set(col, value);
	}

	public void addRow(int r) {
		assert r >= 0 && r <= height;
        height++;
		Vector theRow = new Vector(width);
		for (int c = 0 ; c < width; c++) {
			theRow.add(null);
		}

		rows.add(r, theRow);
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < rows.size(); i++) {
			Vector vRow = (Vector)rows.get(i);
			for (int j =0 ; j < vRow.size(); j++)
			{
				result += " " + vRow.get(j);
			}
		}

		return result;
	}
	public static void main(String[] args) {
		Matrix m = new Matrix(1,2);
         m.set(0,0,new Integer(0));
		 System.out.println("--------------------------");
		 System.out.println(m);
         m.set(0,1,new Integer(1));
		 System.out.println("--------------------------");
		 System.out.println(m);
		 m.addRow(1);
		 m.set(1,0,new Integer(0));
		 System.out.println("--------------------------");
		 System.out.println(m);
		 System.out.println(m.get(0,0)); 



	}
}
