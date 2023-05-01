package Task6.five;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);
        ResizableCircle circle1 = new ResizableCircle(2);
        System.out.println(circle1);
        circle1.resize(50);
        System.out.println(circle1);
    }
}
