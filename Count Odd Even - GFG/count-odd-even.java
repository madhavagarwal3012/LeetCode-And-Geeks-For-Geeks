//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            obj.countOddEven(arr, n);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        int check=2;
        int start=0;
        int odd_count=0;
        int even_count=0;
        int end=arr.length;
        
        while(start<end){
            if(arr[start]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            start++;
        }
        System.out.println(odd_count+" "+even_count);
    }
}