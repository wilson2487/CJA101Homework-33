package hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數
public class Hw3_3 {
	
	
	public static void lastNumber(int n) {
		
		int count = 0; //設置總共可選幾個數字
		int lastNumber[];
		if (n > 4) {
			lastNumber =  new int[44];
		}
		else {
			lastNumber = new int[35];
		}
		for (int o = 1; o <= 49; o++) {
			if(o % 10 != n && o / 10 != n) {
				lastNumber[count] = o;
				System.out.print(lastNumber[count] +" ");
				count++ ; //每選到數字一次就會加一
			}
		}
		System.out.println();
		System.out.print("總共有"+count+"數字可選 " + "  ");
//		 1. 過濾非 0 的數字
//		 int[] nonZeroArr = Arrays.stream(lastNumber).filter(num -> num != 0).toArray();
		 
		// 2. Fisher-Yates Shuffle 洗牌法隨機打亂陣列
		 Random random = new Random();
		 	for (int i = lastNumber.length - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1); // 隨機交換 i 和 j
	            int temp = lastNumber[i];
	            lastNumber[i] = lastNumber[j];
	            lastNumber[j] = temp;
	        }
	        // 3. 取前 6 個數字並複製一個新的陣列避免修改原始數據
	        int[] selectedNumbers = Arrays.copyOfRange(lastNumber, 0, 6);

	        // 4. 印出結果
	        System.out.println("隨機選取的的數字：" + Arrays.toString(selectedNumbers));
		 
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入你不想要的數字1~9");
		int number = sc.nextInt();
		
		Hw3_3.lastNumber(number);
	}
}
