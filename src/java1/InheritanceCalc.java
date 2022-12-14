package java1;

class alok
{
    public int cal(int x,int y)//parent
    {
        //int k=5;
        return x+y;
    }
}
class alok1 extends alok
{
    public int cal_adv(int x,int y){
        // int sum=k+6;
        alok1 S=new alok1();
        return x-y;
    }

}
class alok2 extends alok1{
    public int cal2(int x,int y)
    {
        return x*y;
    }
}
class alok3 extends alok2{
    public int cal3(int x,int y)
    {
        return x/y;
    }
}
public class InheritanceCalc {
    public static void main(String1[] args) {

        // alok1 M=new alok1();
        // alok2 M1=new alok2();
        alok3 M2 = new alok3();
        // alok1 S=new alok1();
        System.out.println(M2.cal(4, 5));
        //System.out.println(M2.cal_adv(4,5);
        System.out.println(M2.cal2(5, 7));
        System.out.println(M2.cal3(8, 2));
    }
}
