/*
just print the number

*/

import java.util.*; 
class TestClass { 
   public static void main(String args[] ) throws Exception { 
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt(); 
       for(int i=0;i<n;i++){ 
           System.out.print(sc.nextInt()+" "); 
       } 
   } 
} 
