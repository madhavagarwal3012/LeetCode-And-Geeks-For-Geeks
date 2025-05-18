//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] a = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                a[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] b = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(a, b, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int kthCount = 0;
        int aIndex = 0, bIndex = 0;
        while(aIndex < a.length && bIndex < b.length){
            if(a[aIndex] < b[bIndex]){
                kthCount++;
                if(kthCount == k){
                    return a[aIndex];
                }
                aIndex++;
            }
            else{
                kthCount++;
                if(kthCount == k){
                    return b[bIndex];
                }
                bIndex++;
            }
        }
        while(aIndex < a.length){
            kthCount++;
            if(kthCount == k){
                return a[aIndex];
            }
            aIndex++;
        }
        while(bIndex < b.length){
            kthCount++;
            if(kthCount == k){
                return b[bIndex];
            }
            bIndex++;
        }
        return -1;
    }
}