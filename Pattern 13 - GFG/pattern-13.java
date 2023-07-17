//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int start=1;
        int num=1;
        while(start<=n){
            int j=0;
            while(j<start){
                System.out.print(num+" ");
                num++;
                j++;
            }
            System.out.println();
            start++;
        }
    }
}