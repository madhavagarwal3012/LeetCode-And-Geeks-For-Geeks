class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveCount = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] % 2 == 1){
                consecutiveCount++;
                if(consecutiveCount == 3){
                    return true;
                }
            }
            else{
                consecutiveCount = 0;
            }
        }
        return false;
    }
}