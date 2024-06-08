class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int index = 0;
        int oddCount = 0;
        
        while(index < arr.length){
            if(arr[index] % 2 == 1){
                oddCount++;
                if(oddCount == 3){
                    return true;
                }
            }
            else{
                oddCount = 0;
            }
            index++;
        }
        return false;
    }
}