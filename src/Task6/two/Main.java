package Task6.two;

import Task6.one.Circle;
import Task6.one.Rectangle;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
    }
}
