package Task6.three;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
    }
}
