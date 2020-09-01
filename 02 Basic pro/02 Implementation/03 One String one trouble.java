/*
A string  is called a good string if and only if two consecutive letters are not the same. For example,  and   are good while  and  are not.

You are given a string . Among all the good substrings of  ,print the size of the longest one.

Input format

A single line that contains a string  ().

Output format

Print an integer that denotes the size of the longest good substring of .

SAMPLE INPUT 
ab
SAMPLE OUTPUT 
2
*/


import java.io.BufferedReader;

import java.io.InputStreamReader;

class TestClass {

public static void main(String args[] ) throws Exception {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String s = br.readLine();

long count = 0;

long c = 1;

for(int i=1; i<s.length(); i++) {

if(s.charAt(i)==s.charAt(i-1)) {

c = 1;

}

else c++;

count = Math.max(count,c);

}

System.out.println(count);

}

}
