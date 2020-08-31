/*
You are given a string  containing only lowercase alphabets. You can swap two adjacent characters any number of times (including 0).

A string is called anti-palindrome if it is not a palindrome. If it is possible to make a string anti-palindrome, then find the lexicographically smallest anti-palindrome. Otherwise, print .

Input format

The first line contains a single integer  denoting the number of test cases. The description of  test cases follows.
Each line contains a string  of lower case alphabets only.
Output format

For each test case, print the answer in a new line.

Constraints



 contains only lowercase alphabets.

SAMPLE INPUT 
4
bpc
pp
deep
zyx
SAMPLE OUTPUT 
bcp
-1
deep
xyz
Explanation
In the first test case, you can create "bcp" which is not a palindrome and it is a lexicographically-smallest string.
In the second test case, you cannot form any anti palindrome.

*/
import java.util.*;

class TestClass {

public static void main(String args[] ) throws Exception {

 


 

// Write your code here

Scanner s = new Scanner(System.in);

int t=s.nextInt();

String bla=s.nextLine();

while(t-->0)

{

String a=s.nextLine();

StringBuffer sb=new StringBuffer(a);

String rev= sb.reverse().toString();

if(a.equals(rev))

System.out.println("-1");

else

{

 

char ar[]=a.toCharArray();

Arrays.sort(ar);

String temp=String.valueOf(ar);

System.out.println(temp);

}

 

}


 

}

}
