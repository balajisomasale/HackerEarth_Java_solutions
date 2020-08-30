
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int num=s.nextInt();

        if(l<=23 && (num>=500 && num<=1000))
        {
            System.out.println("Take Medicine");
        }
        else
        {
             System.out.println("Don't take Medicine");
        }

    }
}
