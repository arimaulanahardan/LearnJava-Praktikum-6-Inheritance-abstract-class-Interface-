package task2;

public class Main {
	public static void main(String[] args) {
		Shape a = new Shape();
		System.out.println(a.toString());
		Circle b = new Circle(12, "Red", true);
		System.out.println(b.toString());
		Rectangle c = new Rectangle(20, 40,"Blue", true);
		System.out.println(c.toString());
		Square d = new Square(10, "Yellow", false);
		System.out.println(d.toString());	
	}
}