/*

You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo .

Input Format:
The first line contains a single integer N denoting the size of the array. The next line contains N space separated integers denoting the elements of the array

Output Format:
Print a single integer denoting the product of all the elements of the array Modulo .

Constraints:


SAMPLE INPUT 
5
1 2 3 4 5
SAMPLE OUTPUT 
120
Explanation
There are 5 integers to multiply. Let's store the final answer in  variable. Since 1 is identity value for multiplication, initialize  as 1.

So the process goes as follows:

answer =1;
answer=answer*1 % (10 power 9 + 7)

*/


import java.util.*;
import java.lang.Math;

class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner s = new Scanner(System.in);
        //String name = s.nextLine(); 

    int num=s.nextInt();
double answer=1;
double mod=(Math.pow(10,9));
mod=mod+7;
int[] arr= new int[num];
    for(int i=0;i<num;i++)
    {
        arr[i]=s.nextInt();
answer=((answer*arr[i])%(mod));

    }
    System.out.println(Math.round(answer));

    }
}
