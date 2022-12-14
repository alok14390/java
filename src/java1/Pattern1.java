package java1;

public class Pattern1 {


    public static void main(String[] args) {
        int i = 4;
        for (int n = i; n >= 1; n--)
        {
            for (int j = 1 ; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
