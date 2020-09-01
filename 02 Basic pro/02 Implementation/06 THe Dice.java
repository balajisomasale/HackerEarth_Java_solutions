/*
Balu HInt : Write the System.exit(0) to avoid the partially accepted as it goes to infinity in the else part

There are   number of girls and they rolled a dice in turns one after another.

If the number on the dice is , then the dice will be rolled again until she get a number other than .

Since you know the sequence of numbers which the dice shows when rolled each time, you have to find what is the total number of girls or if the sequence is invalid.

Input format

A single line that contains a string   denoting the sequence of numbers the dice rolls on written as string.

Output format

If the sequence is valid print the number of girls  
If the sequence is invalid print 
SAMPLE INPUT 
3662123
SAMPLE OUTPUT 
5
Explanation
The second person rolls the dice  times so the number of people will be .
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int count=0;

        if(name.charAt(name.length()-1)=='6')
        {
            System.out.println("-1");
            System.exit(0);
        }
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)!='6')
            {
                count++;
            }

        }
        
        System.out.println(count);

    }
}
