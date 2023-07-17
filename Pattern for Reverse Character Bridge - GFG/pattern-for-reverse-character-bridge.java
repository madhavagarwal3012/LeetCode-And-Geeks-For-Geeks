//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            String[] S = ob.revCharBridge(N);
            
            for(int i=0; i<S.length; i++)
                System.out.println(S[i]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String[] revCharBridge(int N) {
        String[] str = new String[N];
        int i = 0;
        while (i < N) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < N - i) {
                sb.append((char) ('A' + j));
                j++;
            }
            j = 0;
            while (j < 2 * i - 1) {
                sb.append(' ');
                j++;
            }
            if(i != 0){
                j = N - i - 1;
                while (j >= 0) {
                    sb.append((char) ('A' + j));
                    j--;
                }
            } else {
                j = N - i - 2;
                while (j >= 0) {
                    sb.append((char) ('A' + j));
                    j--;
                }
            }
            str[i] = sb.toString();
            i++;
        }
        return str;
    }
}



//     static String[] revCharBridge(int N) {
//         // code here
//         int start = 0;
//         int count=N-1;
//         String[] str = new String[N];
//         char Alphabet = 'A';
//         while (start < N) {
//             StringBuilder sb = new StringBuilder();
//             int j = 0;
//             while (j < N*2-1) {
//                 if (start>0 && j==count+1) {
//                     sb.append(' ');
//                 } 
//                 else {
//                     sb.append(Alphabet);
//                     Alphabet++;
//                 }   
//                 j++;
//             }
//             str[start] = sb.toString();
//             start++;
//             Alphabet='A';
//             count--;
//         }
//         return str;
//     }
// }