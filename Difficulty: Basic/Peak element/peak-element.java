class Solution {

    public int peakElement(int[] arr) {
        // code here
        for(int index = 1; index < arr.length - 1; index++){
            int peakElement = arr[index];
            if(arr[index - 1] < peakElement && arr[index + 1] < peakElement){
                return index;
            }
        }
        if(arr[0] > arr[arr.length - 1]){
            return 0;
        }
        else{
            return arr.length - 1;
        }
    }
}