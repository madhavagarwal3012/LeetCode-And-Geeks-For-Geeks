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
        int start=1;
        while(start<=n){
            int j=1;
            while(j<=start){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            start++;
        }
        start-=2;
        while(start>0){
            int j=1;
            while(j<=start){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            start--;
        }
    }
}