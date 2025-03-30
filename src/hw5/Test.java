package hw5;

public class Test {
	public static void main(String[] args) {
		Pen[] pen = new Pen[2];
		Pencil p = new Pencil("Pencil", 100);
		InkBrush i = new InkBrush("InkBrush", 100);
		pen[0] = p;
		pen[1] = i;
		for (int a = 0; a < 2; a++) {
			pen[a].write();
			pen[a].getPrice();
		}

	}
}
