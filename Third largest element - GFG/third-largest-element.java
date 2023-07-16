//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int nums[], int end)
    {
        int start=0;
        long largest=Long.MIN_VALUE; // use long instead of int
        while(start<end){
            if(nums[start]>largest){
                largest=nums[start];
            }
            start++;
        }
        
        start=0;
        long second_largest=Long.MIN_VALUE; // use long instead of int
        while(start<end){
            if(nums[start]>second_largest && nums[start]<largest){
                second_largest=nums[start];
            }
            start++;
        }
        
        start=0;
        long third_largest=Long.MIN_VALUE; // use long instead of int
        
        while(start<end){
            if(nums[start]>third_largest&&nums[start]<largest &&nums[start]<second_largest){
                third_largest=nums[start];
            }
            start++;
        }
        if(third_largest==Long.MIN_VALUE){ // check if third largest is still Long.MIN_VALUE
            return (int)largest; // cast to int and return largest
        }
        return (int)third_largest; // cast to int and return third largest
    }
}
