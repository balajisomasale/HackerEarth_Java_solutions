//Just basic formula

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

        int t=s.nextInt();

        while(t-->0)
        {
             int friends_num=s.nextInt();
            int chocolate=s.nextInt();
           

            if(chocolate % friends_num==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }



        }

    }
}
