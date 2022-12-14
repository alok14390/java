package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Molwui
{

    public static void add(int i,int j)

    {
        System.out.println(i+j);
    }
    public static void sub(int i,int j)

    {
        System.out.println(i-j);
    }
    public static void mul(int i,int j)

    {
        System.out.println(i*j);
    }
    public static void div(int i,int j)

    {
        System.out.println(i/j);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        int i = Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        int j = Integer.parseInt(br.readLine());
        Molwui n=new Molwui();
        n.sub(i,j);

    }
}