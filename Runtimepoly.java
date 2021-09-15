class Shape {
	void draw() {
	System.out.println("drawing");
	}
}

class Circle extends Shape {
	void draw() {
	System.out.println("drawing circle");
	}
}

class Triangle extends Shape {
	void draw() {
	System.out.println("drawing triangle");
	}
}

class Square extends Shape {
	void draw() {
	System.out.println("drawing square");
	}
}

class Runtimepoly {
	public static void main (String[] args) {
	Shape s;
	s = new Circle();
	s.draw();
	s = new Triangle();
	s.draw();
	s = new Square();
	s.draw();
	}
}