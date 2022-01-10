package shapes;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }
}