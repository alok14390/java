package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic {
    public static void main(String[] args) throws IOException {
        int j;
        int i;

        System.out.println("Enter two number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        j = Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        i = Integer.parseInt(br.readLine());
        int sum = j + i;
        int sub = j - i;
        int mult = j * i;
        int div = j % i;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);


    }
}
