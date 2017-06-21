package caiquangame;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CaiQuan {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("######0.00");

		String[] str = new String[]{"剪刀","石头","布"};
		
		int cnt = 0;
		int win = 0;

		System.out.println("************************");
		System.out.println("*                      *");
		System.out.println("*        猜拳游戏                    *");
		System.out.println("*                      *");
		System.out.println("************************");

		while (true) {

			cnt++;

			System.out.println("1、剪刀");
			System.out.println("2、石头");
			System.out.println("3、布");
			System.out.print("请输入：");

			Scanner input = new Scanner(System.in);
			int n = input.nextInt();

			double rand = Math.random() * 3 + 1;
			int m = (int) rand;
			System.out.println("你的：" + str[n - 1] + " 计算机：" + str[m - 1]);
			if (m == n) {
				System.out.println("平局");
			} else if ((n == 1 && m == 3) || (n == 2 && m == 1)
					|| (n == 3 && m == 2)) {
				win++;
				System.out.println("真棒！你胜了");
			} else {
				System.out.println("不要气馁！总会赢的");
			}

			System.out.println("你是否继续：1.是\t2.否");
			System.out.print("请输入：");
			int f = input.nextInt();

			if (f != 1) {
				double rate = win * 1.0 / cnt * 100;
				System.out.println("玩了" + cnt + "局");
				System.out.println("赢了" + win + "局，" + "胜率：" + df.format(rate)
						+ "%");
				System.out.println("游戏结束...");
				break;
			}
		}

	}
}
