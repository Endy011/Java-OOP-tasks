package Task4.five;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("green", false);
        shape.setFilled(true);
        System.out.println(shape.toString());
        Circle circle = new Circle("green", true, 3);
        System.out.println(circle.toString() + circle.getArea());
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle.toString() + rectangle.getArea());
        Square square = new Square("blue", false, 4);
        System.out.println(square.toString());
    }
}
