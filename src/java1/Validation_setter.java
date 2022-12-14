package java1;

 class ch {

    private int id; private int salary;
    public void setId(int x,int y)
    {
        id=x;salary=y;
//        System.out.println(id);
//        System.out.println(salary);
    }
    public int get()
    {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}
public class Validation_setter {

    public static void main(String[] args) {
        ch S=new ch();
        S.setId(2345,45000);
        System.out.println(S.get());
        System.out.println(S.getSalary());
    }


}
