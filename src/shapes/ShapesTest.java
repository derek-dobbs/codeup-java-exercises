package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//

        Quadrilateral userShape = new Rectangle(5, 5);
        System.out.println(userShape.getArea());
        System.out.println(userShape.getPerimeter());

        userShape = new Square(5);

        System.out.println(userShape.getArea());
        System.out.println(userShape.getLength());
        System.out.println(userShape.getPerimeter());
    }
}
