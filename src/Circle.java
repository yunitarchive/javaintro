public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double setDiameter(){
        return 2 * radius;
    }

    public double setCircumference()
    {
       return  setDiameter() * Math.PI;
    }

    public double setArea(){
        return Math.pow(2, radius) * Math.PI;
    }


    public void exhibitDiameter(){
        double diameter = setDiameter();
        System.out.println("The diameter of the circle is:" + diameter);
    }

    public void exhibitCircumference(){
        double circumference  =  setCircumference();
        System.out.println("The circumference  of the circle is:" + circumference);
    }

    public void exhibitArea(){
        double area  =  setArea();
        System.out.println("The area  of the circle is:" + area);
    }

}
