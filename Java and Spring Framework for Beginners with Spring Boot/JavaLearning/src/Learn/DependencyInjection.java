package Learn;

interface Shape {
	void draw();
}

// This class Drawing has a field named shape of type Shape, which can be set using 
// constructor injection (in the constructor) or setter injection (using a setter method). 
// This flexibility allows the Drawing class to work with any object that implements the Shape 
// interface. For instance, if you have classes like Circle, Square, or Triangle that implement 
// the Shape interface, you can create an instance of Drawing and pass any of these objects to it
class Drawing {
	private Shape shape;

	// Constructor injection
	public Drawing(Shape shape) {
		this.shape = shape;
	}

	// Setter injection
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		if (shape != null) {
			shape.draw();
		} else {
			System.out.println("No shape to draw!");
		}
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}

public class DependencyInjection {

	public static void main(String[] args) {
		Drawing drawing = new Drawing(new Circle());
		drawing.drawShape(); // Output: Drawing Circle

		drawing.setShape(new Square());
		drawing.drawShape(); // Output: Drawing Square
	}

}
