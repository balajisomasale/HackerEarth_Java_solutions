/*
Max has a string S with length N. He needs to find the number of indices i (1≤i≤N−11≤i≤N−1) such that the i-th character of this string is a consonant and the i+1th character is a vowel. However,she is busy, so she asks for your help.

Note: The letters 'a', 'e', 'i', 'o', 'u' are vowels; all other lowercase English letters are consonants.

Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains a single string S with length N.
Output

For each test case, print a single line containing one integer ― the number of occurrences of a vowel immediately after a consonant

Constraints

1≤T≤1001≤T≤100
1≤N≤1001≤N≤100
SS contains only lowercase English letters
SAMPLE INPUT 
3
6
bazeci
3
abu
1
o
SAMPLE OUTPUT 
3
1
0

*/

    import java.util.*;

    class TestClass {
        public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();

    while(t>0)
    {
            int N=s.nextInt();
            String name = s.next();       
            int count=0;
            char[] ch=name.toCharArray();
            for(int i=0;i<N-1;i++)
            {
            if(!((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')))

    {

    if((ch[i+1]=='a')||(ch[i+1]=='e')||(ch[i+1]=='i')||(ch[i+1]=='o')||(ch[i+1]=='u'))

                                {
                count++;
            }
            
            }



            }


            System.out.println(count);



    t--;
    }
        }
    }