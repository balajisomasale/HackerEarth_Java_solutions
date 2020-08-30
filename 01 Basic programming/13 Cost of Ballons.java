/*



You are conducting a contest at your college. This contest consists of two problems and n participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

Input format

First line:  that denotes the number of test cases (1<=T<=10)
For each test case:
First line: Cost of green and purple-colored balloons
Second line:  that denotes the number of participants (1<=N<=10)
Next  lines: Contain the status of users. For example, if the value of the jth  integer in the ith row is 0, then it depicts that the ith participant has not solved the jth  problem. Similarly, if the value of the  integer in the  row is 1 , then it depicts that the participant has solved the  problem.

Output format

For each test case, print the minimum cost that you have to pay to purchase balloons.

Sample Input

2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0

Sample Output

69

14
*/


importjava.util.*;

classTestClass{

    publicstaticvoidmain(Stringargs[])throwsException{

        Scanners=newScanner(System.in);

        intt=s.nextInt();

        

        for(inti=1; i <= t; i++){

           intcost_g=s.nextInt();

           intcost_p=s.nextInt();

           intpar=s.nextInt();

           intx_total_cost=0;

           inty_total_cost=0;

           intmyArray[]=newint[par*2];

           for(intj=0; j< par*2; j++){

               myArray[j]=s.nextInt();

           }

           for(intj=0; j< par*2; j++){

               if(j%2==0&& myArray[j]==1){

                   x_total_cost = x_total_cost + cost_g;

                   y_total_cost = y_total_cost + cost_p;

               }elseif(j%2==1&& myArray[j]==1){

                   x_total_cost = x_total_cost + cost_p;

                   y_total_cost = y_total_cost + cost_g;

               }else{

               }

           }

            System.out.println((x_total_cost>y_total_cost)?y_total_cost:x_total_cost);

        }

        

    }

}

 
