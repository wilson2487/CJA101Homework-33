package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest3 {
	public static void main(String[] args) {
		Calculater c1 = new Calculater();
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		try {
			System.out.println("請輸入x：");
			// 嘗試讀取整數，已經透過例外處理驗證是否為整數了，所以不用再hasNextInt()
			try {
				x = sc.nextInt(); 
			} catch (InputMismatchException e) {
				throw new Exception("請輸入整數！");
			}
			System.out.println("請輸入y：");
			try {
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				throw new Exception("請輸入整數！");
			}

			c1.powerXY(x, y);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}