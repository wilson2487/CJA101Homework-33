package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {
	public static void main(String[] args) throws IOException {
		int i = 0;
		int countline = 0;
		int sum = 0;
		String str = "";
		File f1 = new File("C:\\CJA101_Workspace\\Homework-33\\src\\hw7\\Sample.odt");
		FileReader fr = new FileReader(f1);
		BufferedReader bf = new BufferedReader(fr);

		while ((str = bf.readLine()) != null) {
			countline++;
			sum += str.length();
		}
		System.out.println("Sample檔案總共有" + f1.length() + "位元");
		System.out.println("Sample檔案總共有" + sum + "字元");
		System.out.println("Sample檔案總共有" + countline + "列資料");
		bf.close();
		fr.close();

	}
}
