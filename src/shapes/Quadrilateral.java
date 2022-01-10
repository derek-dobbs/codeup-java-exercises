package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public Quadrilateral() {

    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

}
