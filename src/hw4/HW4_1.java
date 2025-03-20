package hw4;

public class HW4_1 {
//	計算平均值
	public  int avgSum(int [] x) {
		int sum = 0;
		for(int i = 0 ; i < x.length; i++) {
			sum += x[i];
		}
		int avg = sum / x.length;
		return avg ;
	}
	
	public static void main(String[] args) {
		int [] x = {29, 100,39,41,50,8,66,77,95,15};
		HW4_1 AVG = new HW4_1();	
		int avg = AVG.avgSum(x);
		System.out.println(avg);
//		大於平均值的數
		for(int i = 0 ; i < x.length; i++) {
			if (avg < x[i]) {
				System.out.print(x[i] + " ");
			}
		}
//		字串反轉
		String s = "Hello World";
		String reverse = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i); 
		}
		System.out.print(reverse);
		System.out.println();
//		字串比對
		String [] sarrey = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		
		int totala=0,totale=0,totali=0,totalo=0,totalu=0;
		for (int n=0;n < sarrey.length;n++){
			for (int i=0;i<sarrey[n].length();i++){
				char t = sarrey[n].charAt(i);
				switch (t) {
					case 'a':
						totala +=1;
						break;
					case 'e':
						totale +=1;
						break;
					case 'i':
						totali +=1;
						break;
					case 'o':
						totalo +=1;
						break;
					case 'u':
						totalu +=1;
						break;
				}
			}
		}
		int sum1 =totala+totale+totali+totalo+totalu;
		System.out.printf("a有%d個,e有%d個,i有%d個,o有%d個,u有%d個,共%d個",totala,totale,totali,totalo,totalu,sum1);
		
	}
}
