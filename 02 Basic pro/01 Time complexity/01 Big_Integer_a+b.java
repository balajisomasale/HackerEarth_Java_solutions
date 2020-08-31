/*
Problem Description

Given a series of integer pairs  and , output the sum of  and .

Input Format

Each line contains two integers,  and . One input file may contain several pairs  where .

Output Format

Output a single integer per line - The sum of  and .

Constraints

SAMPLE INPUT 
1 2
2 5
10 14
SAMPLE OUTPUT 
3
7
24

*/
//find a+b



import java.util.*;


 

class TestClass {

public static void main(String args[] ) throws Exception {


 

Scanner s = new Scanner(System.in);

while(s.hasNextLine())

{

System.out.println(s.nextBigInteger().add(s.nextBigInteger()));

}

}

}
