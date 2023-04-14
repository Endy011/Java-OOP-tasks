package Task2.nine;

import Task2.six.MyPoint;

public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 4);
        MyPoint point3 = new MyPoint(4, 3);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
