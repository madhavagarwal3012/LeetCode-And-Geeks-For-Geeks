//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

// class Solution {
//     long power(int N, int R) {
        
//         String str[]=new String[2];
//         str[0]="";
//         str[1]="";
        
//         str[0]=Integer.toString(N);
//         int len=str[0].length();
        
//         int start = len-1;
//         while(start>=0){
//             str[1]+=str[0].charAt(start);
//             start--;
//         }
//         R=Integer.parseInt(str[1]);
//         long pow=N;
//         long count_pow = 1;
//         while (count_pow < R) {
            
//             pow = (N*pow)%1000000007;
//             count_pow++;
//             }
//         return pow;
//     }
// }
class Solution {
    static long power(int N,int R)
    {
        long mod = 1000000007;
        long ans = 1;
        while(R!=0)
        {
            if(R%2==1)
            {
                ans = (ans*N)%mod;
            }
            N = (int)(((long)N*(long)N)%mod);
            R/=2;
        }
        return ans;
    }
}


