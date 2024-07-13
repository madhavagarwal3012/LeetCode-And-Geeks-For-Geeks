class Solution {
    public boolean isGood(int[] nums) {
        int permutationCheck = 2;
        int maximumNumber = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index],1);
                if(maximumNumber < nums[index]){
                    maximumNumber = nums[index];
                }
            }
            else{
                map.put(nums[index],map.get(nums[index])+1);
            }
        }
        if(map.get(maximumNumber) == 2){
            permutationCheck--;
        }
        else{
            return false;
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != maximumNumber){
                if(map.get(nums[index]) > 1){
                    permutationCheck--;
                    if(permutationCheck < 1){
                        return false;
                    }
                }
            }
        }
        if(maximumNumber == map.size()){
            return true;
        }
        else{
            return false;
        }
    }
}