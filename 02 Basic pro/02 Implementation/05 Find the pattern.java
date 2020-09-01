//Find the sum of min and max of set of numbers 


import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

        int t=s.nextInt();

        long[] arr=new long[t];
        long min=0;
        long max=0;
           for(int i=0;i<t;i++)
            {

                arr[i]=s.nextLong();

            }

            Arrays.sort(arr);

             min=arr[0];
             max=arr[arr.length-1];

             System.out.println(min+max);




    }
}
