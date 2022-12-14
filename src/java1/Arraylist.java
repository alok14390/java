package java1;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        {
            // length of the
            // ArrayList
            int n = 4;

            // Declaring the ArrayList with
            // initial size n
            ArrayList<Integer> j = new ArrayList<Integer>(n);

            // Appending new elements at
            // the end of the list
            for (int e = 1; e<=n; e++)
                j.add(e);

            // Printing elements
            System.out.println(j);

            // Remove element at index 3
            j.remove(3);

            // Displaying the ArrayList
            // after deletion
            System.out.println(j);

            //Displaying arraylist is empty or not
            j.isEmpty();
            System.out.println();


        }
    }
}