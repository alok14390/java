package java1;

public class Methodoverloading {




    public static void cal1()
    {
        System.out.println("alok");

    }
    public static void cal1(int z)
    {
        System.out.println(z);
    }
    public static void cal1(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        Methodoverloading a= new Methodoverloading();
        a.cal1();
        a.cal1(7);
        a.cal1("moolya");
    }
}
