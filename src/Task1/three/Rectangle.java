package Task1.three;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {}

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
