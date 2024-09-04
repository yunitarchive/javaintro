public class TextRemover {
    private String inputString;

    public TextRemover(String inputString) {
        this.inputString = inputString;
    }

    public String removeFirstTwoCharacters() {
        if (inputString.length() <= 2) {
            return "";
        }
        return inputString.substring(2);
    }


}
