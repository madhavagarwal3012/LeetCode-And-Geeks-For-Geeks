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
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N - i; j++) {
                sb.append((char) ('A' + j));
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                sb.append(' ');
            }
            if(i != 0){
                for (int j = N - i - 1; j >= 0; j--) {
                    sb.append((char) ('A' + j));
                }
            } else {
                for (int j = N - i - 2; j >= 0; j--) {
                    sb.append((char) ('A' + j));
                }
            }
            str[i] = sb.toString();
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