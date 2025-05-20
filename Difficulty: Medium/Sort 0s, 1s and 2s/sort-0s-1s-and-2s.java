class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zeroCount = 0;
        int oneCount = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == 0){
                zeroCount++;
            }
            else if(arr[index] == 1){
                oneCount++;
            }
        }
        int index = 0;
        while(zeroCount > 0){
            arr[index++] = 0;
            zeroCount--;
        }
        while(oneCount > 0){
            arr[index++] = 1;
            oneCount--;
        }
        while(index < arr.length){
            arr[index++] = 2;
        }
    }
}