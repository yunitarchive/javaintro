public class AngelFinder {
    private double angelOne;
    private double angelTwo;

    public AngelFinder (double angelOne, double angelTwo){
        this.angelOne = angelOne;
        this.angelTwo = angelTwo;
    }

    public double setAngelThree(){
        return 180 - angelOne - angelTwo;
    }
    public void exhibitAngleThree(){
        double angleThree = setAngelThree();
        System.out.println("The last angel  of the triangle is:" + angleThree);
    }
}
