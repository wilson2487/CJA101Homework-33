package hw8;

import java.math.BigInteger;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Hw8_1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(3.14);
		al.add(21l);
		al.add(new Short("100"));
		al.add(5.14);
		al.add(new String("Kitty"));
		al.add(100);
		al.add(new Object());
		al.add(new String("Snoopy"));
		al.add(new BigInteger("1000"));
	
		Iterator obj = al.iterator();
//		while (obj.hasNext()) {
//			System.out.println(obj.next());
//			
//		}
//		System.out.println("---------------------");
//		for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//		}
//		System.out.println("---------------------");
//		for(Object a : al) {
//			System.out.println(a);
//		}
//		
//		
//		System.out.println("---------------------");
		
		while (obj.hasNext()) {
            if (!(obj.next() instanceof Number)) {  // 只輸出數字類型
                obj.remove();
            }
        }
		System.out.println(al);
		
	}
}
