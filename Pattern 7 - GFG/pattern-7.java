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


class Solution {

    void printTriangle(int n) {
        // code here
        int start=0;
        while(start<n){
            int spaces=n-start-1; 
            int stars=n-spaces+start;
            
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }
            while(stars>0){
                System.out.print("*");
                stars--;
            }
            System.out.println();
            start++;
        }
    }
}