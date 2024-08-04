// My First Approach
// class Solution {
//     public double minimumAverage(int[] nums) {
//         int minimumIndex = 0;
//         int maximumIndex = 0;
//         double average = Double.MAX_VALUE;

//         int minimumValue = Integer.MAX_VALUE;
//         int maximumValue = Integer.MIN_VALUE;

//         for(int steps = 0; steps < nums.length/2; steps++){
//             for(int index = 0; index < nums.length; index++){
//                 if(nums[index] > maximumValue && nums[index] != Integer.MAX_VALUE){
//                     maximumValue = nums[index];
//                     maximumIndex = index;
//                 }
//                 if(nums[index] < minimumValue && nums[index] != Integer.MIN_VALUE){
//                     minimumValue = nums[index];
//                     minimumIndex = index;
//                 }
//             }
//             nums[maximumIndex] = Integer.MAX_VALUE;
//             nums[minimumIndex] = Integer.MIN_VALUE;

//             maximumIndex = 0;
//             minimumIndex = 0;
            
//             if((maximumValue + minimumValue) * 1.0 / 2 < average){
//                 average = (maximumValue + minimumValue) * 1.0 / 2;
//             }
            
//             maximumValue = Integer.MIN_VALUE;
//             minimumValue = Integer.MAX_VALUE;
//         }
//         return average;
//     }
// }

// My Second Approach
class Solution {
    public double minimumAverage(int[] nums) {
        double average = Double.MAX_VALUE;
        Arrays.sort(nums);

        for(int index = 0, length = nums.length - 1; index <= length; index++, length--){
            if((nums[index] + nums[length]) * 1.0 / 2 < average){
                average = (nums[index] + nums[length]) * 1.0 / 2;
            }
        }
        return average;
    }
}