class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int index = 0; index < apple.length; index++){
            sum += apple[index];
        }
        int noOfBoxesUsed = 0;
        for(int index = capacity.length - 1; index >= 0; index--){
            if(sum > 0){
                sum -= capacity[index];
                noOfBoxesUsed++;
            }
            else{
                break;
            }
        }
        return noOfBoxesUsed;
    }
}