/*

In our school days, all of us have enjoyed the Games period. Raghav loves to play cricket and is Captain of his team. He always wanted to win all cricket matches. But only one last Games period is left in school now. After that he will pass out from school.

So, this match is very important to him. He does not want to lose it. So he has done a lot of planning to make sure his teams wins. He is worried about only one opponent - Jatin, who is very good batsman.

Raghav has figured out 3 types of bowling techniques, that could be most beneficial for dismissing Jatin. He has given points to each of the 3 techniques.

You need to tell him which is the maximum point value, so that Raghav can select best technique.

3 numbers are given in input. Output the maximum of these numbers.

Input:

Three space separated integers.

Output:

Maximum integer value


*/

import java.util.*; 
class TestClass { 
   public static void main(String args[] ) throws Exception { 
       Scanner sc=new Scanner(System.in); 
       int a=sc.nextInt(); 
       int b=sc.nextInt(); 
       int c=sc.nextInt(); 
       int max=0; 
       if(a>b && a>c) 
           max=a; 
       else if(b>a && b>c) 
           max=b; 
       else 
           max=c; 
           System.out.println(max); 
   } 
}
