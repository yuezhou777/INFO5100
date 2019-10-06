public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double getArea() {
        double area = width * height;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double peri = 2 * (width + height);
        System.out.println(peri);
        return peri;
    }    

}