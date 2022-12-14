package java1;

class alok_1 {


    int id;
    String1 name;int a;int b;int num;int r;int marks;
    public void print()
    {
        System.out.println("printing id number"+" "+id);
        System.out.println(name);
    }
    public void add()
    {
        int x=a+3;
        System.out.println((x));
    }

    public void table()
    {
        for(int k=0;k<10;k++)
        {
            System.out.println(num + "*" + (k + 1) + "=" + num * (k + 1));
        }
    }

    public void area()
    {
        double arg=3.14*r*r;
        System.out.println(arg);
    }
    public void result()
    {
        if(marks>80&&marks<100)
        {
            System.out.println("Excellent");
        }
        else
        {
            System.out.println("Prepare more");
        }
    }
}


public class alok_5 {
    public static void main(String1[] args) {

        alok_1 M=new alok_1();

        M.print();
        M.add();
        M.table();
        M.area();
        M.result();
    }
}