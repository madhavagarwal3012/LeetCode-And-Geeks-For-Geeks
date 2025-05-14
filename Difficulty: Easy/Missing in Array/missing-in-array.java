//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int missingNum(int arr[]) {
        if(arr.length == 0){
            return -1;
        }
        // code here
        HashSet<Integer> set= new HashSet<>();
        int maximum = arr[0];
        int minimum = arr[0];
        set.add(arr[0]);
        
        for(int index = 1; index < arr.length; index++){
            set.add(arr[index]);
            if(arr[index] > maximum){
                maximum = arr[index];
            }
            if(arr[index] < minimum){
                minimum = arr[index];
            }
        }
        for(int start = minimum; start <= maximum; start++){
            if(!set.contains(start)){
                return start;
            }
        }
        if(minimum == 1){
            return maximum + 1;
        }
        else{
            return 1;
        }
    }
}