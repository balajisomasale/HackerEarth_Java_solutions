/*
Balu hint: set x=0,y=0 and if l then x-- else if r then x++ same for up and down with y

Ankit is in maze. The command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.

maze

For example if he is at (2, 0) and the command is L he will go to (1, 0).

Input:

Input contains a single string.

Output:

Print the final point where he came out.

Constraints:

1 ≤ |S| ≤ 200

SAMPLE INPUT 
LLRDDR
SAMPLE OUTPUT 
0 -2
*/



import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

Scanner s = new Scanner(System.in);

int x=0;
int y=0;


String command = s.nextLine();

char[] ch=command.toCharArray();

for (int i=0;i<ch.length;i++)
{
    if(ch[i]=='L')
    {
        x=x-1;
    }

      else if(ch[i]=='R')
    {
        x=x+1;
    }
  else  if(ch[i]=='D')
    {
        y=y-1;
    }
     else 
    {
        y=y+1;
    }

}
System.out.print(x +" "+ y);



    }
}
