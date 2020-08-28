/*
You are required to enter a word that consists of  and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if .

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be .
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.

SAMPLE INPUT 
zzzoooooo
SAMPLE OUTPUT 
Yes
Explanation
-
*/

/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.util.*;
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
Scanner s = new Scanner(System.in);
        String name = s.nextLine(); 
        
        char[] ch=name.toCharArray();
        int z_count=0;
        int o_count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='z')
            {
                z_count++;
            }
            else if(ch[i]=='o')
            {
                o_count++;
            }
        }

        if(o_count==(2*z_count))
        {
            System.out.println("Yes");
        }
else{
     System.out.println("No");
}


       // System.out.println("char is "+char);

    }
}
