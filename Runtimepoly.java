class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

class Runtimepoly {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
        s = new Square();
        s.draw();
    }
}