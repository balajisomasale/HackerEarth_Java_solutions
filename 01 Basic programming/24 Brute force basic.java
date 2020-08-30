/*
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

SAMPLE INPUT 
1
2
88
42
99
SAMPLE OUTPUT 
1
2
88
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
          Scanner s = new Scanner(System.in);

        int flag=1;

        while(flag==1)
        {
            int num=s.nextInt();

            if(num==42)
            {
                flag=2;
            }
            else{
            System.out.println(num);
            }
        }
    



    }
}
