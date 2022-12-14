package java1;
class alok4 {
    private int num;
    private String name;
    String regex = "^[a-zA-Z]+$";

    public void setName(String str) {
        if (str.matches(regex)) {
            name = str;
            System.out.println(name);
        } else {
            System.out.println("name not valid");
        }
    }
}
public class get_validation {


    public static void main(String1[] args) {
        alok4 M = new alok4();
        M.setName("alok");
    }
}
