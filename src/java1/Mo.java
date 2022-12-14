package java1;

import java.util.Scanner;

public class Mo {


    public static void op(int i ,int j, int w){
        for( j=i;j>=1;j--){
            for (  w=1;w<=j;w++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void add(int i, int j) {
        {
            System.out.println("addition of two nos is" + (i + j));
        }
    }

    public static void sub(int i, int j) {

        System.out.println("subtraction of two nos is" + (i - j));
    }

    public static void mul(int i, int j) {
        System.out.println("multiplication of two nos is" + (i * j));

    }

    public static void div(int i, int j) {

        System.out.println("division of two nos is " + (i / j));
    }

    public static void si(String st, int w) {
        System.out.println(" my name is " + st + " and my age is " + (w));

    }

    public static void ss(String st, String scc) {
        System.out.println("my name is " + st + " my surname is " + scc);

    }

    public static void str(String st) {
        System.out.println("string lowercase is " + st.toLowerCase());
        System.out.println("string trim is " + st.trim());
        System.out.println("string replace is " + st.replace('A', 'c'));
        System.out.println("string length is " + st.length());
        System.out.println("string character is at " + st.charAt(1));
    }

    public static void ch(char c) {
        System.out.println(c);
    }

    public static void whileloop(int i) {
        i = 1;
        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void dowhile(int i) {
        i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
                i++;
            }
        }
        while (i <= 10);
    }


    public static void arr(int[] k) {
        System.out.println("integer array length is " + k.length);
        {
            for (int s = 0; s <= k.length - 1; s++) {
                System.out.println("integer array values are " + k[s]);

            }
        }
    }

    public static void arr1(String[] z) {
        System.out.println("String  array length is " + z.length);
        {
            for (int p = 0; p <= z.length - 1; p++) {
                System.out.println("string array values are " + z[p]);

            }
        }
    }

    public static void ifelse(int cost)
    {
        if (cost >= 100 && cost <= 150) {
            System.out.println("icecream");
        } else if (cost >= 150 && cost <= 200) {
            System.out.println("chicken kebab");
        } else if (cost >= 200 && cost <= 250) {
            System.out.println("mutton kebab");
        } else if (cost >= 250 && cost <= 300) {
            System.out.println("biryani");
        } else {
            System.out.println("mutton biryani");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//take the input from the user
        int i = sc.nextInt();//checks whether the input is int
        int j = sc.nextInt();
        int w=sc.nextInt();
        char c= sc.next().charAt(0);
        int cost=sc.nextInt();
        String st=sc.nextLine();
        String scc=sc.nextLine();//checks whether input is string
        Mo a = new Mo(); //
        int k[]={11,22,333};
        String z[]={"alok","alok1","alok2"};

        a.op(i,j,w);
        a.add(i,j);
        a.sub(i,j);
        a.mul(i,j);
        a.div(i,j);
        a.str(st);
        a.arr(k);
        a.arr1(z);
        a.ifelse(cost);
        a.si(st,w);
        a.ss(st,scc);
        a.ch(c);
        a.whileloop(i);
        a.dowhile(i);



    }

}