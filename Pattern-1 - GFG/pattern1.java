//{ Driver Code Starts

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
            String[] S = ob.findThePattern(N);
            
            for(int i=0; i<S.length; i++)
                System.out.println(S[i]);
        }
    }
}
// } Driver Code Ends


class Solution {
    //     static String[] findThePattern(int N) {
//         // code here
//         int start=0;
//         String str[]=new String[N];
//         char Alphabet = '@';
//         while(start<N){
//             int j=0;
//             while(j<N){
//                 if(start==0 || start==N-1){
//                     str[start].charAt(j)+=(char)(Alphabhet+1);
//                 }
//                 else if(j==0){
//                     str[start].charAt(0)+=Alphabhet;
//                     str[start].charAt(N-1)+=(char)(Alphabhet+1);
//                     j++;
//                 }
//                 str[start].charAt(j)+='$';
//                 j++;
//             }
//             Syste.out.println();
//             start++;
//         }
//         return str;
//     }

    // static String[] findThePattern(int N) {
    // int start = 0;
    // String[] str = new String[N];
    // char Alphabet = '@';
    // while (start < N) {
    //     StringBuilder sb = new StringBuilder();
    //     int j = 0;
    //     while (j < N) {
    //         if (start == 0 || start == N - 1) {
    //             sb.append((char) (Alphabet + 1));
    //         } 
    //         else if (j == 0) {
    //             sb.append(Alphabet);
    //             sb.append('$');
    //             j++;
    //         }
    //         else if (j == N - 1) {
    //             sb.append((char) (Alphabet + 1));
    //         } 
    //         else {
    //             sb.append('$');
    //         }
    //         j++;
    //     }
    //     str[start] = sb.toString();
    //     start++;
    // }
    // return str;
    // }
    static String[] findThePattern(int N) {
    int start = 0;
    String[] str = new String[N];
    char Alphabet = 'A';
    while (start < N) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < N) {
            if (start == 0 || start == N - 1) {
                sb.append(Alphabet);
                Alphabet++;
            } else if (j == 0 || j == N - 1) {
                sb.append(Alphabet);
                Alphabet++;
            } else {
                sb.append('$');
            }
            j++;
        }
        str[start] = sb.toString();
        start++;
    }
    return str;
}

    
}

