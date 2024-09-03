public class Geometry {
    public static void compareAreaWithCircle(Circle circle, Rectangle rectangle) {

        double circleArea = circle.setArea();
        double rectangleArea = rectangle.calculateArea();

        if (rectangleArea > circleArea) {
            System.out.println("The rectangle has a larger area.");
        } else if (rectangleArea < circleArea) {
            System.out.println("The circle has a larger area.");
        } else {
            System.out.println("The rectangle and circle have the same area.");
        }
    }
}
