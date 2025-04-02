package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class HW7_2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\CJA101_Workspace\\Homework-33\\src\\hw7\\Data.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		PrintStream ps = new PrintStream(fos);
		for(int i = 0 ; i < 10; i ++) {
			int a = (int)(Math.random() * 1000 + 1);
			ps.println(a );
		}
		ps.close();
		fos.close();
	}
}
