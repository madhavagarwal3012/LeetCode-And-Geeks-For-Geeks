class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int index = 0; index < arr.length; index++){
            if(arr[index] < arr[index + 1]){
                continue;
            }
            else if(index > 0){
                return index;
            }
        }
        return -1;
    }
}