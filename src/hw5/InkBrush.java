package hw5;

public class InkBrush extends Pen {
	public  InkBrush(String brand,double price) {
		super(brand,price);
	}
	void getPrice() {
		System.out.println("InkBrush價格為" + price* 0.8 );
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
