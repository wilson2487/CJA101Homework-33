package hw9;



class CounterRunnable implements Runnable {
	String name;
	CounterRunnable(String name){
		this.name=name;
	}
	public void run() {
		for(int i = 1 ; i <= 10; i++) {
			int random = (int)(Math.random()* 2500 + 500);
			System.out.println(name+"吃了第"+i+"碗");
			try {
				Thread.sleep(random);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Hw9_1 {
	public static void main(String[] args) {
		
		CounterRunnable cr1 = new CounterRunnable("饅頭人");
		Thread tr1 = new Thread(cr1);
		CounterRunnable cr2	= new CounterRunnable("詹姆士");
		Thread tr2	=new Thread(cr2);
		
		System.out.println("比賽開始");
		tr1.start();
		tr2.start();
		
		try {
			tr1.join();
			tr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("比賽結束");
	}
}
