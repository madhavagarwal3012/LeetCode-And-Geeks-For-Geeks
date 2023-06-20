class Solution {
    public int thirdMax(int[] nums) {
        
        int start=0;
        int end=nums.length;
        long largest=Long.MIN_VALUE; // use long instead of int
        while(start<end){
            if(nums[start]>largest){
                largest=nums[start];
            }
            start++;
        }
        
        start=0;
        long second_largest=Long.MIN_VALUE; // use long instead of int
        while(start<end){
            if(nums[start]>second_largest && nums[start]<largest){
                second_largest=nums[start];
            }
            start++;
        }
        
        start=0;
        long third_largest=Long.MIN_VALUE; // use long instead of int
        
        while(start<end){
            if(nums[start]>third_largest&&nums[start]<largest &&nums[start]<second_largest){
                third_largest=nums[start];
            }
            start++;
        }
        if(third_largest==Long.MIN_VALUE){ // check if third largest is still Long.MIN_VALUE
            return (int)largest; // cast to int and return largest
        }
        return (int)third_largest; // cast to int and return third largest
    }
}
