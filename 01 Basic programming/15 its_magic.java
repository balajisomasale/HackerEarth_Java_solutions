/*

Sussutu is a world-renowned magician. And recently, he was blessed with the power to remove EXACTLY ONE element from an array.

Given, an array A (index starting from 0) with N elements. Now, Sussutu CAN remove only that element which makes the sum of ALL the remaining elements exactly divisible by 7.

Throughout his life, Sussutu was so busy with magic that he could never get along with maths. Your task is to help Sussutu find the first array index of the smallest element he CAN remove.

 

Input:

The first line contains a single integer N.

Next line contains N space separated integers Ak , 0 < k < N.

 

Output:

Print a single line containing one integer, the first array index of the smallest element he CAN remove, and -1 if there is no such element that he can remove!

 

Constraints:

1 < N < 105

0 < Ak < 109

SAMPLE INPUT 
5
14 7 8 2 4
SAMPLE OUTPUT 
1
Explanation
Both 14 and 7 are valid answers, but since 7 is the smallest, the required array index is 1.
*/



import java.util.*;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int size = sc.nextInt();

long total = 0;

int[] arr = new int[size];

/*

In variable total, I am keeping adding of all numbers then I will subtract each array elements one by one and check whether the result is divisible by 7 or not if yes I

will check whether this element is  less than previously got element if yes then I will update the current element or else not

*/

 

for(int i=0;i<size;i++){

int value = sc.nextInt();

total += value;

arr[i] = value;

}


 

long prevValue = 1000000;

int prevIndex = -1;

for(int i=0;i<size;i++){

long val = total - arr[i];

if((val % 7 ) == 0){

 

if(arr[i] < prevValue){

prevValue = arr[i];

prevIndex = i;

}

}

}

 

if(prevIndex != -1){

System.out.println(prevIndex);

}else{

System.out.println(prevIndex);

}





 

}

}
