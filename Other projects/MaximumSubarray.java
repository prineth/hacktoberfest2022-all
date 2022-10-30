import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumSubarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();
    int arr[] = new int[size];
   
    for(int i=0;i<size;i++){
      arr[i]= sc.nextInt();
    }
     int sum=arr[0];
    int maxSum=arr[0];
    for(int i=1;i<size;i++){
      if(sum<0){
        sum = arr[i];
      }else{
        sum=sum+arr[i];
      }
      maxSum = Math.max(sum, maxSum);
    }
    System.out.println(maxSum);
	}
}
