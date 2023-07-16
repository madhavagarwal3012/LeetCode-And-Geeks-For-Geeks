//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        int start=0;
        int largest=Integer.MIN_VALUE;
        while(start<n){
            if(arr[start]>largest){
                largest=arr[start];
            }
            start++;
        }
        start=0;
        int second_largest=-1;
        while(start<n){
            if(arr[start]>second_largest&&arr[start]<largest){
                second_largest=arr[start];
            }
            start++;
        }
        return second_largest;
    }
}