package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
			int x = 0;
			int y = 0;
			Calculater cl = new Calculater();
			System.out.println("請輸入第一個數");
			try {
				x = sc.nextInt();
				
			} catch (InputMismatchException e ) {
				System.out.println("格式不同");
			}
			try {
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("格式不同");
			}
			cl.powerXY(x, y);
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}
}
