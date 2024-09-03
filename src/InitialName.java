public class InitialName {

    private String name;

    public InitialName(String name) {
        this.name = name;
    }


    public String getInitials() {



        return String.valueOf(name.charAt(0)).toUpperCase();
    }

    public void exhibitInitial() {
        String initials = getInitials();
        System.out.println("The initials of the name '" + name + "' is: " + initials);
    }


}