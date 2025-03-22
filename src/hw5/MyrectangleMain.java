package hw5;

public class MyrectangleMain {
	public static void main(String[] args) {
//		第一種使用建構子無參數
		Myrectangle my1 = new Myrectangle();
		my1.setDepth(20);
		my1.setWidth(10);
		my1.getArea();
		
		System.out.println(my1.getArea());
		
//		第二種使用建構子有參數
		Myrectangle my2 = new Myrectangle(10,20);
		my2.getArea();
		System.out.println(my2.getArea());
	}
}
