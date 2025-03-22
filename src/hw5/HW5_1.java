package hw5;

public class HW5_1 {
//	長方形
    static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++ ) {
			for(int o = 0; o < width; o++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
    
//    10個亂數與平均值
	static void randAvg() {
		int sum = 0;
		int avg;
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 101);
			sum +=r;
			System.out.print(r + " ");	
		}
		System.out.println("平均為"+sum / 10);
	}

//	Overloading
	static int maxElement(int[][] arr){
		int max = 0;
		for(int i =0; i < arr.length; i ++) {
			for (int o = 0; o < arr[i].length; o++) {
				if(arr[i][o] > max)
					max = arr[i][o];
			}
		}
		return max;
	}
	static double maxElement(double[][] arr){
		double max = 0;
		for(int i =0; i < arr.length; i ++) {
			for (int o = 0; o < arr[i].length; o++) {
				if(arr[i][o] > max)
					max = arr[i][o];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		starSquare(4,5);
		randAvg();
		int[][] arr = {{1,6,3},{9,5,2}};
		double[][] arr2 = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		System.out.println(maxElement(arr));
		System.out.println(maxElement(arr2));
	}
}
