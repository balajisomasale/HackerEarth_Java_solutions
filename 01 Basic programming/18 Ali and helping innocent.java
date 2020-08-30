/*
Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

SAMPLE INPUT 
12X345-67
SAMPLE OUTPUT 
invalid
Explanation
The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).

*



import java.util.Scanner;


 

public class CodeChallenge18_AliHelpingInnocentPeople {


 

    public static void main(String[] args)

    {

        //System.out.println("Enter the string");

        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        if(s.length()==9)

        {

            int sum1=0;

            int sum2=0;

            int sum3=0;

            int sum4=0;

            String s1=s.substring(0,1);

            String s2=s.substring(1,2);

            int a1=Integer.parseInt(s1);

            int a2=Integer.parseInt(s2);

            sum1+=a1+a2;

            

            String s3=s.substring(3,4);

            String s4=s.substring(4,5);

            String s5=s.substring(5,6);

            int a3=Integer.parseInt(s3);

            int a4=Integer.parseInt(s4);

            int a5=Integer.parseInt(s5);

            sum2+=a3+a4;

            sum3+=a4+a5;

            

            String s6=s.substring(7,8);

            String s7=s.substring(s.length()-1);

            int a6=Integer.parseInt(s6);

            int a7=Integer.parseInt(s7);

            sum4+=a6+a7;

            

            char ch=s.charAt(2);

            if((sum1%2==0)&&(sum2%2==0)&&(sum3%2==0)&&(sum4%2==0))

            {

                if(!((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='Y')))

                {

                        System.out.println("valid");

                }

                else

                    System.out.println("invalid");

            }

            else

                System.out.println("invalid");

        }

        sc.close();

    }

}
