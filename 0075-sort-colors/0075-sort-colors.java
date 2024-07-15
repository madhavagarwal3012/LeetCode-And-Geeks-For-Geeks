class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        int redFrequency = 0;
        int whiteFrequency = 0;
        int blueFrequency = 0;
        for(int index = 0; index < nums.length;){
            if(map.containsKey(0)){
                redFrequency = map.get(0);
            }
            if(map.containsKey(1)){
                whiteFrequency = map.get(1);
            }
            if(map.containsKey(2)){
                blueFrequency = map.get(2);
            }
            while(redFrequency > 0){
                nums[index] = 0;
                redFrequency--;
                index++;
            }
            while(whiteFrequency > 0){
                nums[index] = 1;
                whiteFrequency--;
                index++;
            }
            while(blueFrequency > 0){
                nums[index] = 2;
                blueFrequency--;
                index++;
            }
        }
    }
}