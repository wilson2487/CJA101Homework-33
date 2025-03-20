package hw4;

import java.util.Scanner;

public class HW4_2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("請輸入你要借的金額");
	int number = sc.nextInt();
	int [][] empe = {{25,32,8,19,27},
					 {2500,800,500,1000,1200}};
	int total = 0;

	for(int i = 0; i < empe.length; i++) {
		for(int o = 0; o < empe[i].length; o++) {
			if(empe[i][o] >= number) {
				total++;
				System.out.print("員工編號為"+empe[0][o] + " ");
			}
		}
	}	
		System.out.println("共"+ total +"人");
		
		
		
		
	}
}


