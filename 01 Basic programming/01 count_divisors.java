/*

You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

Input Format
The first and only line of input contains 3 space separated integers l, r and k.

Output Format
Print the required answer on a single line.

Constraints


SAMPLE INPUT 
1 10 1
SAMPLE OUTPUT 
10


*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
        
        Scanner sc = new Scanner(System.in);
       // String name = s.nextLine();                 // Reading input from STDIN
    //    System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

       int l=sc.nextInt();
       int r=sc.nextInt();
       int k=sc.nextInt();

        int count=0;

// if(l<r)
// {
//     int temp=l;
//     l=r;
// r=temp;
// }

for (int i=1;i<=r;i++)
{
    if(l%k==0)
    {
        count++;
        //i+=k-1;
    }
 l++;
}
System.out.println(count);


        // Write your code here

    }
}
