//get the sum of each char : a=1 like that in any given string and sum it up

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);

String name=s.nextLine();


int sum=0;

for(int i=1;i<=name.length();i++)
{
   int num = (name.charAt(i-1))-96;
    sum+=num;
}
System.out.println(sum);

//int num=Integer.parseint(name);




    }
}
