package hw3;

import java.util.Scanner;

public class hw3_2 {
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
//		int a = (int)Math.random()*10 ;
		int a = (int)(Math.random()*100) + 1 ;
		while (true) {
				System.out.println("請輸入一個1~100的數字");
				i = sc.nextInt();
				if(i > a) {
					System.out.println("太大囉");
				}
				else if (i < a) {
					System.out.println("太小囉");
				}
				else if (i == a){
					System.out.println("恭喜答對囉答案就是" + a);
					break;
				}
		}
		
	}
}
