/*Given a non-negative integer array Arr having size N. Each element of the array will carry a different 
value. This means no two elements can have the same values.The candidate has to do this with minimal 
changes in the original value of the elements, making every element as least as much value as it originally 
had.   */

import java.util.Scanner;
class Tcs1{
public int calculate(){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int sum=0;
int[] arr= new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();

if(i>0){
for(int k=i-1;k>=0;k--){
    if(arr[i]==arr[k]){
        arr[i]=arr[i]+1;
    }
}
}

sum=sum+arr[i];
}
return sum;
}

public static void main(String args[]){
    Tcs1 tc=new Tcs1();
    System.out.println("The sum of unique array is"+tc.calculate());
}
}