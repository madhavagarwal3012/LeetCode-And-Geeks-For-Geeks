class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productMatrix [] = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(map.containsKey(nums[index])){
                productMatrix[index] = map.get(nums[index]);
            }
            else{
                int product = 1;
                for(int subIndex = 0; subIndex < nums.length; subIndex++){
                    if(subIndex != index){
                        product = product * nums[subIndex];
                    }
                }
                productMatrix[index] = product;
                map.put(nums[index], product);
            }
        }
        return productMatrix;
    }
}