import java.util.Scanner;

class ClockwiseArrRotation{
    public void reverse(int[] arr, int start, int end){
        while(start<end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }

   public int[] calc(int[] arr, int n, int K){
   K=K%n;
   reverse(arr,0, n-K-1);
   reverse(arr, n-K, n-1);
   reverse(arr, 0, n-1);
   return arr;
   }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of array: ");
    int N= sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter teh array elements: ");
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the number by which you wanna rotate the array clockwise: ");
    int K=sc.nextInt();

    ClockwiseArrRotation Clock = new ClockwiseArrRotation();
    System.out.println("The rotated array is: ");
    Clock.calc(arr, N, K);
    for(int i=0; i<N;i++){
      System.out.println(arr[i]);
    }
}



}