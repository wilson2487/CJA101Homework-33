package hw3;

import java.util.Scanner;

public class hw3_1 {
//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
	public static void printTar(double i,double o, double p) {
		if (i == o && o == p) {
			System.out.println("正三角型");
		}
		else if ((i == o && i != 0 && o != p)|| (i == p && i != 0 && p != o)|| o == p && p != 0 && p != i) {
			System.out.println("等腰三角形");
		}
		else if (i == 0 || o == 0 || p == 0) {
			System.out.println("不是三角形");
		}
		else if (Math.pow(i,2) + Math.pow(o,2) == Math.pow(p,2) || Math.pow(i,2) + Math.pow(p,2) == Math.pow(p,2) || Math.pow(p,2) + Math.pow(o,2) == Math.pow(o,2)) {
			System.out.println("直角三角形");
		}
		else {
			System.out.println("其他三角形");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三個數字");
		double i, o, p ;
		 i = sc.nextInt();
		 o = sc.nextInt();
		 p = sc.nextInt();
		 hw3_1.printTar(i, o, p);
	}
}
