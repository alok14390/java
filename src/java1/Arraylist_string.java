package java1;

import java.util.ArrayList;

public class Arraylist_string {


    public static void main(String[] args) {
        ArrayList<String1> fruits=new ArrayList<String1>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add(2,"grapes");

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());

    }
}