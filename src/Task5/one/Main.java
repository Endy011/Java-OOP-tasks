package Task5.one;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(15, 30);

        System.out.println(p1);
        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println(line.getLength());
        line.setBeginXY(0, 0);
        System.out.println(line.getBeginX() + " " + line.getBeginY());
        line.setEndXY(3, 4);
        System.out.println(line.getEndX() + " " + line.getEndY());
        System.out.println(line);
        System.out.println(line.getLength());
    }
}
