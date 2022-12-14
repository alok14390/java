package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse1 {


    public static void main(String1[] args) throws IOException {
        int marks;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        marks=Integer.parseInt(br.readLine());
        if(marks>80 && marks<=100){
            System.out.println("Excellent");
        }
        else if (marks<=80 && marks>=70) {
            System.out.println("Good");
        }
        else if (marks<70 && marks>=55) {
            System.out.println("Average");
        }
        else if (marks<55 ){
            System.out.println("Poor");
        }
        else{
            System.out.println("invalid");

        }
    }
}

