class Solution {
    public int maxProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE - 1;

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                if(nums[index] > secondMaximum && nums[index] < maximum){
                    secondMaximum = nums[index];
                }
                else if(nums[index] > maximum){
                    secondMaximum = maximum;
                    maximum = nums[index];
                }
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        int product = 1;
        if(map.containsKey(maximum)){
            if(map.get(maximum) > 1){
                product = product * (maximum - 1) * (maximum - 1);
            }
            else if(map.containsKey(secondMaximum)){
                product = product * (secondMaximum - 1) * (maximum - 1);
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
        return product;
    }
}