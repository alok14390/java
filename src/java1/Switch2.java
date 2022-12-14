package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Switch2 {


    public static void main(String[] args) throws IOException {
        int s;

        System.out.println("enter the no");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        s = Integer.parseInt(br.readLine());  // it will check the entered value is integer or not


        switch (s % 2) {
            case 0:
                System.out.println("no is even");
                break;
            case 1:
                System.out.println("no is odd");
                break;

        }
    }

}






