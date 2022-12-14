package java1;

class tr{
private int id;
private String name;
        String regex="^[a-zA-Z]+$";
        String a="^[0-9]+$";


   public void setName(String s){

String h=Integer.toString(id);
if(s.matches(a)){

        h=s;
        System.out.println("correct name is"+h);
        }
else{
System.out.println("id is not correct");
        }

        }


        }
public class regularexp {

    public static void main(String[] args){

        tr t=new tr();
        t.setName("1234");
    }
}
