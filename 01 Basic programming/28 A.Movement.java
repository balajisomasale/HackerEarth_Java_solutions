/*
An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point  of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward.
Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

Input

First and the only line contain the integer  which denotes the position of his friend's house.

Output

Output contains a single line denoting the minimum number of steps.

Constraints


 

SAMPLE INPUT 
26
SAMPLE OUTPUT 
6
Explanation
For  = 26, elephant can move as 5-> 5 -> 5 -> 5 -> 5->1

Hence he needed 6 steps to reach at position 26.

*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        int sum=0;
        

        while(n>0)
        {
            n=n-5;
            sum++;
        }
        System.out.println(sum);



    }
}
