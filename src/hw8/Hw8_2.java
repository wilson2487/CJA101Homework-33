package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_2 {

	public static void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		Set<Train> hs = new HashSet<>();
		hs.add(t1);
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		hs.add(t7);
		for(Train train : hs) {
			System.out.println(train);
		}
		Iterator obj = hs.iterator();
		while (obj.hasNext()) {

			System.out.println(obj.next());
		}
		ArrayList<Train> al = new ArrayList<>();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		al.add(t5);
		al.add(t6);
		al.add(t7);
		al.sort(null);
		for(int i = 0; i < al.size(); i ++) {
			System.out.println(al.get(i));
		}
		for(Train n: al) {
			System.out.println(n);
		}
		Iterator oal = al.iterator();
		while (oal.hasNext()) {

			System.out.println(oal.next());
		}
		TreeSet<Train> ts = new TreeSet<Train>();
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		ts.add(t6);
		ts.add(t7);
		for (Train train : ts) {
		    System.out.println(train);
		}

		Iterator ots = ts.iterator();
		while (ots.hasNext()) {

			System.out.println(ots.next());
		}
	}

}
