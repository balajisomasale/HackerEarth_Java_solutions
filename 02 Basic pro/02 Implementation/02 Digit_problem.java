/*
This time your task is simple.

Given two integers X and K, find the largest number that can be formed by changing digits at atmost K places in the number X.

Input:

First line of the input contains two integers X and K separated by a single space.

Output:

Print the largest number formed in a single line.

Constraints:


SAMPLE INPUT 
4483 2
SAMPLE OUTPUT 
9983
Explanation
First two digits of the number are changed to get the required number.

*/




import java.util.*;

import java.lang.*;

class TestClass {

public static void main(String args[] ) throws Exception {


 

Scanner sc=new Scanner(System.in);


 

String str=sc.next();


 

char []w=str.toCharArray();

int k=sc.nextInt();

int j=0;

for(int i=0;i<k;i++){

for(;j<str.length();j++){

if(w[j]!='9'){

w[j]='9';

break;

}

} //for j

 

}//for

String s=String.valueOf(w);

System.out.println(s);


 

}//main

}
