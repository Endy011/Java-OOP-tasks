package Task2.seven;

import Task2.six.MyPoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyLine line = new MyLine();
        MyLine line1 = new MyLine();
        MyPoint point = new MyPoint(5,6);
        MyPoint point1 = new MyPoint(3,4);
//        line.setBeginX(3);
//        line.setBeginY(4);
        line.setBegin(point);
        line1.setBegin(point1);
//        System.out.println(Arrays.toString(line.getBeginXY()));
        System.out.println(Arrays.toString(line.getBeginXY()));
        System.out.println(Arrays.toString(line1.getBeginXY()));
        System.out.println(line.getLength());
    }
}
