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
		// TODO �Զ����ɵķ������
		GoodsInfoDaoImpl sel = new GoodsInfoDaoImpl();
		String name = null;
		double count = 0, sum = 0;

		Scanner ns = new Scanner(System.in);
		System.out.println("��������Ʒ������\n");
		int n = ns.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("��������Ʒ���ƺ�������\n");
			Scanner sc = new Scanner(System.in);
			name = sc.nextLine();
			count = sc.nextDouble();
			try {
				sum = sum + count * sel.selectGoodsInfoByName(name).getPrice();
			} catch (Exception e) {
				System.out.println("���������������");
			}
		}
		output(sum);
	}

	public static void output(double sum) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(new File("D:\\output.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("����ļ���������");
		}
		PrintStream p = new PrintStream(fs);
		p.print("��Ʒ���۽�");
		p.println(sum);
		p.close();
		System.out.println("����ļ��ɹ���");
	}
}
