/*
Aditya is fond of ladders. Everyday he goes through pictures of ladders online but unfortunately today he ran out of ladder pictures online. Write a program to print “ladder with N steps”, which he can use to get his daily dose of ladder love.

INPUT:
Input contains integer N, the number of steps in the ladder

OUTPUT:

Print the ladder with the gap between two side rails being 3 spaces(“   “).

Check the sample output for format of printing the ladder.

CONSTRAINTS:

1<=N<=40

SAMPLE INPUT 
4
SAMPLE OUTPUT 
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *

*/
/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");

        }
        System.out.println("*   *");
        System.out.println("*   *");



    }
}

