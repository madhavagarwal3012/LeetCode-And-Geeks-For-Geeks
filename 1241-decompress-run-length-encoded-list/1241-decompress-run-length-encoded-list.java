class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressedList = new ArrayList<>();
        int value = 0;
        int frequency = 0;

        for(int index = 0; index < nums.length; index++){
            if(index % 2 == 0){
                frequency = nums[index];
            }
            else{
                value = nums[index];
                while(frequency > 0){
                    decompressedList.add(value);
                    frequency--;
                }
            }
        }
        int decompressedArray[] = new int[decompressedList.size()];
        for(int index = 0; index < decompressedList.size(); index++){
            decompressedArray[index] = decompressedList.get(index);
        }
        return decompressedArray;
    }
}