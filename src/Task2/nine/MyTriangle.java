package Task2.nine;

import Task2.six.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setX(x1);
        this.v1.setY(y1);
        this.v2.setX(x2);
        this.v2.setY(y2);
        this.v3.setX(x3);
        this.v3.setY(y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString();
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        if (v1.distance(v2) == v2.distance(v3) && v1.distance(v2) == v3.distance(v1)) {
            return "equilateral";
        } else if (v1.distance(v2) == v2.distance(v3) && v1.distance(v2) != v3.distance(v1)) {
            return  "isosceles";
        } else {
            return "scalene";
        }
    }
}
