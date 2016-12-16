/*************************************************************************
	> File Name: InfiniteQuestions.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月15日 星期四 22时40分28秒
 ************************************************************************/
// 一个小游戏
// 《根据描述猜东西》
// 利用树 有机器学习功能
// 如                它有喇叭吗？
//            它是神奇的吗          计算机
//    麒麟               汽车

import java.io.*;

public class InfiniteQuestions {
	public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BinaryTree database = new BinaryTree("一个计算机");
		System.out.println("你想玩游戏吗? [yes/no]");
		while (br.readLine().equals("yes")) {
			System.out.println("正在思考....  我会猜到它的.[yes/no]");
			play(br, database);
			System.out.println("你还想要玩游戏吗? [yes/no]");
		}
	}

public static void play(BufferedReader br, BinaryTree database) throws Exception {
	if (!database.left().isEmpty()) {
		System.out.println(database.value());
		if (br.readLine().equals("yes")) {
			play(br, database.left());
		} else {
			play(br, database.right());
		}
	} else {
		System.out.println("它是 " + database.value() + "吗? [yes/no]");
		if (br.readLine().equals("yes")) {
			System.out.println("我猜到了！！！");
		} else {
			System.out.println("哎呀 请你告诉我它是什么呀");
			BinaryTree newObject = new BinaryTree(br.readLine());
			BinaryTree OldObject = new BinaryTree(database.value());
			System.out.println("那么什么问题可以区分 " + newObject.value() + " 和 " + OldObject.value() + "呢?");
			database.setLeft(newObject);
			database.setRight(OldObject);
			database.setValue(br.readLine());
		}
	}
}
}
