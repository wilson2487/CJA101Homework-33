package hw5;

public class Pencil extends Pen{
	public  Pencil(String brand,double price) {
		super(brand,price);
	}
	
    void getPrice() {
		System.out.println("Pencil價格為" + price * 0.9 );
	}
	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
