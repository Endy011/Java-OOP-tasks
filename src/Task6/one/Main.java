package Task6.one;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.4);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("green", false, 3, 4);
        System.out.println(rectangle);
        Square square = new Square(2.5, "blue", false);
        System.out.println(square);

    }
}
