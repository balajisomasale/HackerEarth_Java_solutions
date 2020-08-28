/*
Balu HInt : Here It is given that there are 12 seats and 
seat and opp seat are 1=> 12
2=>11
3=>10
4=>9
5=>8
6=>7


Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one day and they got interested in the seating arrangement of their compartment. The compartment looked something like


So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows :

Window Seat : WS
Middle Seat : MS
Aisle Seat : AS

You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

INPUT
First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.

OUTPUT
For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.

CONSTRAINTS
1<=T<=105
1<=N<=108
SAMPLE INPUT 
2
18
40
SAMPLE OUTPUT 
19 WS
45 AS
*/

import java.util.*;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner s = new Scanner(System.in);

int z = s.nextInt();

 

while(z != 0)

{

int num =s.nextInt();

int val = num % 12;

if (val == 1)

{

System.out.print(num+11+" WS");

}

else if (val == 2)

{

System.out.print(num+9+" MS");

}

else if (val == 3)

{

System.out.print(num+7+" AS");

}

else if (val == 4)

{

System.out.print(num+5+" AS");

}

else if (val == 5)

{

System.out.print(num+3+" MS");

}

else if (val == 6)

{

System.out.print(num+1+" WS");

 

}

else if (val == 7)

{

System.out.print(num-1+" WS");

}

else if (val == 8)

{

System.out.print(num-3+" MS");

}

else if (val == 9)

{

System.out.print(num-5+" AS");

}

else if (val == 10)

{

System.out.print(num-7+" AS");

}

else if (val == 11)

{

System.out.print(num-9+" MS");

}

else if (val == 0)

{

System.out.print(num-11+" WS");

}


 

System.out.print("\n");

z--;

}

}

}
