//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        String num="0";
        int len=str.length();
        int start=0;
        long sum=0;
        while(start<len){
            if(Character.isDigit(str.charAt(start))){
                num+=str.charAt(start);
            }
            else{
                if(num!="0"){
                    sum=sum+Integer.parseInt(num);
                    num="0";
                }
            }
            start++;
        }
        return sum+Integer.parseInt(num);
    }
    
}