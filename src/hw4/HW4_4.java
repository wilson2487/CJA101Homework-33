package hw4;

import java.util.Arrays;

public class HW4_4 {

	public static void main(String args[]) {
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		
		int [] win = new int[8];
		for(int i = 0; i < test.length; i++) {
//			先找第i列的最大數是多少
			int[] copy = Arrays.copyOf(test[i],test[i].length);
			Arrays.sort(copy);
			int max = copy[copy.length - 1];
			for(int o = 0; o < test[i].length; o++) {
//				在靠最大數找到是誰考的
				if(test[i][o] == max) {
//					考最高就+1
					win[o] += 1;
				}
			}
		}
		
		for(int i = 0; i < win.length; i++ ) {
			System.out.println("第"+ (i+1) + "號考了" + win[i]+ "次最高分" );
		}
	}
	

}
