package java1;

public class Stringarray {



    public static void main(String[] args) {
        String[] test = new String[5];
        test[0] = "al";
        test[1] = "al";
        test[2] = "al";
        test[3] = "al";
        test[4] = "al";
        System.out.println(test.length);
        for (int j = 0; j <= test.length-1; j++) {
            System.out.println(test[j]);
        }
    }
}
