package hw1;

public class Hw1 {
	public static void main(String[] args) {
//		作業一
//		int sum = 6 + 12;
//		System.out.print(sum);
//		作業二		
//		int egg = 0;
//		int da = egg / 12;
//		int k = egg % 12;
//		System.out.print("總共" + da + "打" + k + "顆");
//		作業三
//		int a = 256559 ;
//		int day = (a / 86400 );
//		int hr = (a - day * 86400) / 3600;
//		int min = ((a - day * 86400) - hr * 3600)/ 60;
//		int s = ((a - day * 86400) - hr * 60)% 60;		
//		System.out.print(day + "天" + hr + "小時" + min + "分" + s + "秒");
//		作業四
//		final double n = 3.1415;
//		int r= 5;
//		double area = n * Math.pow(r, 2);
//		double circumference = 2 * n * r;
//		System.out.println("面積為:" + area + "周長為:" + circumference);
//		作業五
//		double p = 1500000;
//		double r = 0.02;
//		int t = 10;
//		double A = p * Math.pow(1 + r, t);
//		System.out.printf("10 年後本金加利息共有 %.2f 元%n", A);
//		作業六
		int num1 = 5;
		char num2 = '5';
		String num3 = "5";
		System.out.println(num1 + num1); // 兩個數據類型都是 int 所以會是 5 + 5 = 10
		System.out.println(num1 + num2); // num2 是字符 '5'，其 Unicode 值為 53 所以答案是 5 + 53 = 58
		System.out.println(num1 + num3); // num3 是字串 所以會是 "5"跟5拼接 = 55
	}
}
