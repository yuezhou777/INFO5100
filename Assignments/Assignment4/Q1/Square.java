public class Square extends Shape {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public double getArea() {
        double area = side * side;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double peri = 4 * side;
        System.out.println(peri);
        return peri;
    }

}