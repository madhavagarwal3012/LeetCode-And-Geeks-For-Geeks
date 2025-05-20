// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int[] repeatingElements = new int[2];
        int rIndex = 0;
        
        for(int index = 0; index < arr.length; index++){
            if(!set.contains(arr[index])){
                set.add(arr[index]);
            }
            else{
                repeatingElements[rIndex] = arr[index];
                rIndex++;
                if(rIndex == 2){
                    break;
                }
            }
        }
        return repeatingElements;
    }
}