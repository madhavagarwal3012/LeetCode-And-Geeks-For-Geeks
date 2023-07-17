//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int start=n-1;
        int space_count=0;
        while(start>=0){
            int spaces=space_count;
            int stars=n-spaces+start;     //5-4+0=1  //5-3+1=3  //5-2+2=5 //5-1+3=7  //5-0+4=9
            
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }
            while(stars>0){
                System.out.print("*");
                stars--;
            }
            System.out.println();
            start--;
            space_count++;
            
        }
    }
}