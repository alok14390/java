package java1;

public class Array_1 {



    public static void main(String1[] args) {
        int i[]={2,3,4,5,7};//length of array 5
        // int sum=0; //sum=0,2
        int prod=1;
        for(int j=0;j<i.length;j++)//j=0,1,2,....>5 iterations
        {
            //sum=sum+i[j];
            prod=prod*i[j];
        }

        System.out.println(prod);
    }
}
