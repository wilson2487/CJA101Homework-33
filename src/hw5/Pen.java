package hw5;


public  abstract class Pen {
	private String brand;
	protected double price;
	
	public Pen() {};
	public Pen(String brand,double price) {
		this.brand= brand;
		this.price= price;
	}
	void setBrand(String brand){
		this.brand= brand;
	}
	void setPrice(double price){
		this.price= price;
	}
	String getBrand() {
		return brand;
	}
	void  getPrice() {}
	abstract void write();
}
