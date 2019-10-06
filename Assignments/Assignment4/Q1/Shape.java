public class Shape {
    private String name;
    private double perimeter;
    private double area;
    public static final double PI = 3.14;

    public Shape(){

    }

    public Shape(String name, double perimeter, double area){
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void draw() { 
        System.out.println("Drawing Shape");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}