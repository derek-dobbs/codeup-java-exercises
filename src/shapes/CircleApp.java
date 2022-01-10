package shapes;

import util.Input;

public class CircleApp {

    public static void CircleInfo () {
        Input input = new Input();

        do {
            Circle circle = new Circle(input.getDouble());
            System.out.printf("The area is: %f%n", circle.getArea());
            System.out.printf("The circumference is: %f%n", circle.getCircumference());
        } while (input.yesNo("Would you like information about another circle?"));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
