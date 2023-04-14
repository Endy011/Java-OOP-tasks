package Task2.eight;

import Task2.six.MyPoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyCircle circle = new MyCircle();
        MyPoint myPoint = new MyPoint(2, 4);
        circle.setRadius(3);
        circle.setCenter(myPoint);
        circle.setCenterXY(3, 4);
        System.out.println(circle.getCenter());
        System.out.println(Arrays.toString(circle.getCenterXY()));
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        System.out.println(circle.getCenterX());
    }
}
