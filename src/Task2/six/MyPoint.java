package Task2.six;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((Math.max(this.x, x) - Math.min(this.x, x)), 2) + Math.pow((Math.max(this.y, y) - Math.min(this.y, y)), 2));
    }  //distance = sqrt(a^2 + b^2)

    public double distance(MyPoint myPoint) {
//        return Math.sqrt(Math.pow((Math.max(this.x, myPoint.x) - Math.min(this.x, myPoint.x)), 2) + Math.pow((Math.max(this.y, myPoint.y) - Math.min(this.y, myPoint.y)), 2));
        return Math.sqrt(Math.pow(this.x-myPoint.x, 2) + Math.pow(this.y-myPoint.y, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
