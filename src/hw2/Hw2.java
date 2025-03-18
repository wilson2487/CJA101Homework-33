package hw2;

public class Hw2 {
	public static void main(String[] args) {
		//作業一
		int sum = 0;
		for (int i = 1; i <=1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
//		作業二
		int sum2 = 1;
		for(int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
//		作業三
		int sum3 = 1;
		int i = 1;
		while(i <= 10) {
			
			sum3 *= i;
			i++;
		}
		System.out.println(sum3);
//		作業四
		for (int o = 1; o <= 10; o++) {
			
			System.out.print((int)Math.pow(o, 2));
			System.out.print(' ');
		}
		System.out.println();
		
//		作業五
		int sum4 = 0;
		for (int o = 1; o <= 49; o++) {
			if(o / 10 != 4  && o % 10 != 4 ) {
				System.out.print(o);
				sum4 += 1;
			}
		}
		System.out.println();
		System.out.println(sum4);
//		作業六
		for (int o = 10; o >= 1; o--) {
			for (int y = 1; y <= o; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
//		作業七
		char a = 64;
		for (int o = 1; o <= 6; o++) {
			for (int j = 0; j < o; j++) {
//				char b = (char)(a + o);
//				System.out.print(b);
				System.out.printf("%c", a + o);
			}
			System.out.println();
		}
		
	}
		
}
