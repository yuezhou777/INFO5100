public class ShapeTester {
    // Main operation class for testing
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        Square sq = new Square(4.0);

        r.getArea(); // 6.0
        r.getPerimeter(); // 10.0
        c.getArea(); // 50.26
        c.getPerimeter(); // 25.13
        sq.getArea(); // 16.0
        sq.getPerimeter(); // 16.0
        r.draw(); // "Drawing rectangle"
        c.draw(); // "Drawing Circle"
        s.draw(); // "Drawing Shape"
        sq.draw(); // "Drawing Square"

    }
}