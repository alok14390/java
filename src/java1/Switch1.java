package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch1 {


    public static void main(String[] args) throws IOException {
        int num1,num2,ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ch=Integer.parseInt(br.readLine());
        num1=Integer.parseInt(br.readLine());
        num2=Integer.parseInt(br.readLine());
        switch (ch){
            case 1:
                System.out.println(num1+num2);
                break;
            case  2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("you are entered wrong number");
        }

    }
}