package java1;

public class Array {



    public static void main(String[] args) {
        int[] i = new int[5];
        i[0] = 10;
        i[1] = 16;
        i[2] = 17;
        i[3] = 18;
        i[4] = 19;
        System.out.println(i.length);
        for (int j = 0; j <= i.length-1; j++) {
            System.out.println(i[j]);
        }
    }
}
