package java1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse {



    public static void main(String[] args) throws IOException {
        int age;

        System.out.println("age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        age = Integer.parseInt(br.readLine());  // it will check the entered value is integer or not

        if (age <= 18) {
            System.out.println(" not eligible to vote");
        }
        else if (age >= 18) {
            System.out.println(" Eliglible to vote");
        }
        else {

            System.out.println("not applicable");
        }

    }
}
