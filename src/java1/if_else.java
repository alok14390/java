package java1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class if_else {



    public static void main(String1[] args) throws IOException {
        int a;  int b;
        System.out.println("Enter any two Numbers");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());

//              if(age>=18){
//            System.out.println("elegible to vote");
//        }
//      else if(age<=12){
//            System.out.println("you are a baby");
//        }
//      else {
//            System.out.println("not elegible");
//        }
        if(a>b){
            System.out.println(a-b);
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else if(a<b){
            System.out.println(a*b);
        }
        else{
            System.out.println("fail");
        }
    }
}
