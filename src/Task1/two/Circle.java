package Task1.two;

public class Circle {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
