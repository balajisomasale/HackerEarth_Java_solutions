/*
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 

Note
String S consists of lowercase English Alphabets only.

SAMPLE INPUT 
aba
SAMPLE OUTPUT 
YES
Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
     
 Scanner s = new Scanner(System.in);
        String name = s.nextLine(); 

        char[] ch = name.toCharArray();
//int mid=char.length/2;
Boolean status=false;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==ch[ch.length-i-1])
            {
                status=true;
            }
            else{
status=false;
               // System.out.println("NO");
            }
        }
        // Write your code here
        if(status)
System.out.println("YES");
else System.out.println("NO");
    }
}
