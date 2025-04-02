package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);

			System.out.println("請輸入一個數");
			if (sc.hasNextInt()) {
				int x = sc.nextInt();
				System.out.println("請輸入一個數");
				if (sc.hasNextInt()) {
					int y = sc.nextInt();
					Calculater cal = new Calculater();
					try {
						cal.powerXY(x, y);

					} catch (CalException e) {
						System.out.println(e.getMessage());
					}
				} else {
					String y = sc.nextLine();
					System.out.println("第二個輸入格式錯誤");
				}

			} else {
				String x = sc.nextLine();
				System.out.println("輸入格式錯誤");
			}


	}

}
