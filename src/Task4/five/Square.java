package Task4.five;

public class Square extends Rectangle{
    private double side = 1.0;
    public Square(){
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" +
                super.toString() +
                ']';
    }
}
