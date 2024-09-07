//Brute Force Approach
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int start=0;
//         int end=nums.length;

//         int arr[]=new int[2];
//         int k=0;
//         while(start<end){
//             int j=start+1;
//             while(j<end){
//                  if(nums[start]+nums[j]==target){
//                     arr[k]=start;
//                     arr[k+1]=j;
//             }
//             j++;
               
//         }
//         start++;
//         }
//         return arr;
//     }
// }


//HashMap Approach (Optimal Approach)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int positions[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < nums.length; index++){
            if(map.containsKey(target - nums[index]) && map.get(target - nums[index]) != index){
                positions[0] = index;
                positions[1] = map.get(target - nums[index]);
                break;
            }
            map.put(nums[index], index);
        }
        return positions;
    }
}