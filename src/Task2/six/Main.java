package Task2.six;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p1.distance(p2));

        System.out.println(p1.distance());


    }
}
