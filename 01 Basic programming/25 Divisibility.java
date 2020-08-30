/*
You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by .

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer  denoting the size of array 
Second line:  space-separated integers.
Output format

If the number is divisible by , then print . Otherwise, print .

Constraints

SAMPLE INPUT 
5
85 25 65 21 84
SAMPLE OUTPUT 
No
Explanation
Last digit of  is .
Last digit of  is .
Last digit of  is .
Last digit of  is .
Last digit of  is .
Therefore the number formed is  which is not divisible by 10.

*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int last=0;
        int[] data = new int[t];
        for(int i=0; i<t; i++){
            data[i] = s.nextInt();

            last=(data[i]%10);
        }
       if(last%10==0)
       {
            System.out.println("Yes");
       }

        else{
        System.out.println("No");
        }
        
    }
}
