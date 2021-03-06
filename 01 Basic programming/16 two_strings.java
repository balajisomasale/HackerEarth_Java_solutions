/*
Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :

First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
Output:

For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
Constraints:

1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .

SAMPLE INPUT 
3
sumit mitsu
ambuj jumba
abhi hibb
SAMPLE OUTPUT 
YES
YES
NO
Explanation
For first test case,

mitsu can be rearranged to form sumit .

For second test case,

jumba can be rearranged to form ambuj .

For third test case,

hibb can not be arranged to form abhi.
*/


import java.util.Arrays;

import java.util.Scanner;


 

public class CodeChallenge12_TwoStrings {


 

    public static void main(String[] args)

    {

        //System.out.println("Enter the number of times you want to run test case");

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        if(t>=1&&t<=100)

        {

            for(int i=1;i<=t;i++)

            {

                //System.out.println("Enter the strings");

                String s1=sc.next();

                String s2=sc.next();

                if((s1.length()>=1&&s1.length()<=100000)&&(s2.length()>=1&&s2.length()<=100000))

                {

                    char[] ch1=s1.toCharArray();

                    char[] ch2=s2.toCharArray();

                    Arrays.sort(ch1);

                    Arrays.sort(ch2);

                    String st1=new String(ch1);

                    String st2=new String(ch2);

                    if(st1.equals(st2))

                    {

                        System.out.println("YES");

                    }

                    else

                        System.out.println("NO");

                }

            }

        }

        sc.close();

    }

}
