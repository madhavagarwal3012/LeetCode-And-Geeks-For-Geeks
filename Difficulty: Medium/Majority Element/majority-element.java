//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        if(arr.length == 1){
            return arr[0];
        }
        // code here
        int majorityElementFrequency = arr.length / 2 + 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int index = 0; index < arr.length; index++){
            if(!map.containsKey(arr[index])){
                map.put(arr[index], 1);
            }
            else{
                map.put(arr[index], map.get(arr[index]) + 1);
                if(map.get(arr[index]) == majorityElementFrequency){
                    return arr[index];
                }
            }
        }
        return -1;
    }
}