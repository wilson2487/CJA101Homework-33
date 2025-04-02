package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HW7_4 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Animal a1 = new Dog("dog1");
		Animal a2 = new Dog("dog2");
		Animal a3 = new Cat("cat1");
		Animal a4 = new Cat("cat2");
		Animal [] animals = new Animal[4];
		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		animals[3] = a4;
		File path = new File("C:\\data");
		if (!path.exists()) path.mkdir();
		File file = new File("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		for(int i = 0 ; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		System.out.println("檔案內容" + file.getName());
		
		try {
		    while (true) {
		        ((Animal) ois.readObject()).speak();
		    }
		} catch (EOFException e) {
		    // 正常結束，檔案讀取完畢
		    System.out.println("檔案讀取完畢！");
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    ois.close(); // 確保關閉流
		}
	}
}
