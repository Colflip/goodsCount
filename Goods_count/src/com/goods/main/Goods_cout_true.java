package com.goods.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Scanner;

import com.goods.dao.impl.GoodsInfoDaoImpl;

public class Goods_cout_true {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GoodsInfoDaoImpl sel = new GoodsInfoDaoImpl();
		String name = null;
		double count = 0, sum = 0;

		Scanner ns = new Scanner(System.in);
		System.out.println("请输入商品数量：\n");
		int n = ns.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("请输入商品名称和数量：\n");
			Scanner sc = new Scanner(System.in);
			name = sc.nextLine();
			count = sc.nextDouble();
			try {
				sum = sum + count * sel.selectGoodsInfoByName(name).getPrice();
			} catch (Exception e) {
				System.out.println("计算费用遇到错误！");
			}
		}
		output(sum);
	}

	public static void output(double sum) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(new File("D:\\output.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("输出文件遇到错误！");
		}
		PrintStream p = new PrintStream(fs);
		p.print("商品销售金额：");
		p.println(sum);
		p.close();
		System.out.println("输出文件成功！");
	}
}
