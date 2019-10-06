public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getArea() {
        double area = PI * radius * radius;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double peri = 2 * PI * radius;
        System.out.println(peri);
        return peri;
    }
    
}