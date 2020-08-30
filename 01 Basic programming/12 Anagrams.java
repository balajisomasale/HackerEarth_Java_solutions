/*
Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.

SAMPLE INPUT 
1
cde
abc
SAMPLE OUTPUT 
4
*/

import java.util.Scanner; 

class TestClass { 
   static int anagram(String st1, String st2){ 
       int[] a=new int[256]; 
       int count=0; 
       for(char c:st1.toCharArray()){ 
           int index=(int) c; 
          //  System.out.println("index =="+index);
           a[index]++; 
        //   System.out.println("a[index]++ =="+a[index]++);
       } 
       for(char c:st2.toCharArray()){ 
           int index=(int) c; 
          //  System.out.println("index =="+index);
           a[index]--; 
          //  System.out.println("a[index]-- =="+a[index]--);
       } 
       for(int i=0;i<256;i++){ 
           count+=Math.abs(a[i]); 
           // System.out.println("count =="+count);
       } 
       return count; 

} 
public static void main(String args[] ) throws Exception { 
       Scanner sc=new Scanner(System.in);         
         int t=sc.nextInt(); 
         sc.nextLine(); 
         while(t>0){ 
         String st1=sc.nextLine(); 
         String st2=sc.nextLine(); 
         int n=anagram(st1,st2); 
         System.out.println(n); 
         t--; 
       } 
       sc.close(); 
   } 
}
