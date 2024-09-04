public class OddEvenChecker {
    private int number;

    public OddEvenChecker(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public void exhibitOddEvenChecker() {
        if (isEven()) {
            System.out.println("The " + number + " is even.");
        } else {
            System.out.println("The " + number + " is odd.");
        }
    }


}

