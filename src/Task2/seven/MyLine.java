package Task2.seven;

import Task2.six.MyPoint;

public class MyLine {
     private MyPoint begin;
     private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setX(x1);   //help
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }

    public MyLine() {
    }

    //    public MyLine(MyPoint begin, MyPoint end) {
//    } how do i do it

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }  // like this?????

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setX(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY(){
       return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int[] arr = {getBeginX(), getBeginY()};
        return arr;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        int[] arr = {getEndX(), getEndY()};
        return arr;
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    @Override
    public String toString() {
        return "MyLine[begin=("+ getBeginX() + ", " + getBeginY() + "), end=(" + getEndX() + ", " + getEndY() + ")]";
    }
}
