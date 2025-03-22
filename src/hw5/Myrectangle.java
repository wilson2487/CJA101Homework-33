package hw5;

public class Myrectangle {
	double width;
	double depth;
	public Myrectangle() {
		
	};
	public Myrectangle(double width,double depth) {
		this.width = width;
		this.depth = depth;
	}
	void setWidth(double width) {
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;
	}
	double getArea() {
		return width * depth;
	}

}
