//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

      //  Rectangle rectangle = new Rectangle(5, 3);
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5,3);
        //rectangle.exhibitArea();

        Circle circle = new Circle(5);
        circle.exhibitDiameter();
        circle.exhibitCircumference();
        circle.exhibitArea();

        AngelFinder angle = new AngelFinder(80,65);
        angle.exhibitAngleThree();

        InitialName myInitial = new InitialName("Halohai Aloha");
        myInitial.exhibitInitial();
        Geometry.compareAreaWithCircle(circle, rectangle);
    }


}