// decoded  the formula and applied directly

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

        double d=s.nextInt();

        double oc=s.nextInt();
        double of=s.nextInt();
        double od=s.nextInt();

        double cs=s.nextInt();
        double cb=s.nextInt();
        double cm=s.nextInt();
        double cd=s.nextInt();

        double result_online;
        double result_classic;


        result_online = oc + (d-of)*od ;
        result_classic= cb + (d/cs)*cm + (d*cd);

        if(result_classic>=result_online)
        {
            System.out.println("Online Taxi");
            System.exit(0);
        }
        else{
            System.out.println("Classic Taxi");
            System.exit(0);
        }


    }
}
