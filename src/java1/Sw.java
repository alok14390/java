package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sw {
    public static void main(String[] args) throws IOException {
        int s;
        int i;
        int j;
        System.out.println("enter two nos");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        s = Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        i = Integer.parseInt(br.readLine());
        j = Integer.parseInt(br.readLine());

        switch (s) {
            case 1:
                System.out.println("add two numbers"+(i+j));
                break;
            case 2:
                System.out.println("sub two numbers"+(i-j));
                break;
            case 3:
                System.out.println("multiply two nos"+(i*j));
                break;
            case 4:
                System.out.println("div two numbers"+(i/j));
                break;
            default:
                System.out.println("not applicable");
        }
    }
}






