package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW7_3 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("f1.txt");
		if(!f1.exists()) f1.createNewFile();
		File f2 = new File("f2.txt");
		HW7_3 h = new HW7_3();
		h.copyFile(f1, f2);
	}
	public void copyFile(File f1, File f2) throws IOException {
		FileReader fis = new FileReader(f1);
		BufferedReader br = new BufferedReader(fis);
		FileWriter ops = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(ops);
		String line = "";
		while ((line = br.readLine()) != null) {
			bw.write(line);
		}
		bw.close();
		ops.close();
		br.close();
		fis.close();

	}

}
