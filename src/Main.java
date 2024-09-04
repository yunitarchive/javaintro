//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //Day 1 Exercise
        //  Rectangle rectangle = new Rectangle(5, 3);
        //No.1
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5,3);
        //rectangle.exhibitArea();
        //No.2
        Circle circle = new Circle(5);
        circle.exhibitDiameter();
        circle.exhibitCircumference();
        circle.exhibitArea();
        //No.3
        AngelFinder angle = new AngelFinder(80,65);
        angle.exhibitAngleThree();
        //No.4
        InitialName myInitial = new InitialName("Halohai Aloha");
        myInitial.exhibitInitial();
        Geometry.compareAreaWithCircle(circle, rectangle);

        //Day 2
        //No.1
        Temperature temp = new Temperature(39);
        temp.exhibitTemptCelcius();
        //No.2
        ConfCentiToKm converter = new ConfCentiToKm(100000);
        double kilometers = converter.convertToKm();
        System.out.println("The value in kilometers is: " + kilometers);
        //No.3
        OddEvenChecker checker = new OddEvenChecker(15);
        checker.exhibitOddEvenChecker();
        //No.4
        TextRemover newRemoveOne = new TextRemover("Hello");
        String resultRemoveOne = newRemoveOne.removeFirstTwoCharacters();
        System.out.println(resultRemoveOne);
    }


}