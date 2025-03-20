package hw4;

import java.util.Scanner;

public class HW4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數,分別代表西元yyyy年,mm月,dd日");
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

//		總共幾個月幾天
		int totalmxd = 0;
//		總共幾個月幾天再加上d
		int totalmxdd;

//		y1是閏年
		int[] y1 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// 		y2是平年
		int[] y2 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		閏年條件 是4的倍數且是100的倍數且是400的倍數 或 是4的倍數且不是100的倍數
		if ((y % 4 == 0 && y % 100 == 0 && y % 400 == 0) || y % 4 == 0 && y % 100 != 0) {
			if (y1[m] > d) {
				for (int i = m - 1; i > 0; i--) {
					totalmxd += y1[m];
				}
			} else {
				System.out.print("該月份不能大於" + y1[m] + "天");
			}
		} else {
			if (y2[m] > d) {
				for (int i = m - 1; i > 0; i--) {
					totalmxd += y2[m];
				}
			}
			else {
				System.out.print("該月份不能大於" + y2[m] + "天");
			}
		}
		totalmxdd = totalmxd + d;
		if(y1[m] < d || y2[m] < d) {
			
		}else {
			System.out.print("是該年的第" + totalmxdd + "天");
		}
		
	}
}
