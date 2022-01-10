package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
        return 4 * super.length;
    }
}
