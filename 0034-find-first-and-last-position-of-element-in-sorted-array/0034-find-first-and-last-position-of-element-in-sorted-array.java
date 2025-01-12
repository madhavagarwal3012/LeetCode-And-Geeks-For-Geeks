class Solution {
    public int[] searchRange(int[] nums, int target) {
        int positions[] = new int[2];
        positions[0] = -1;
        positions[1] = -1;

        int startingIndex = 0;
        int endingIndex = nums.length - 1;

        while(startingIndex <= endingIndex){
            int mid = (startingIndex + endingIndex) / 2;
            if(nums[mid] == target){
                int sMid = mid;
                while(sMid > 0 && nums[sMid] == nums[sMid - 1]){
                    sMid--;
                }
                positions[0] = sMid;
                int eMid = mid;
                while(eMid < nums.length - 1 && nums[eMid] == nums[eMid + 1]){
                    eMid++;
                }
                positions[1] = eMid;
                break;
            }
            else if(nums[mid] < target){
                startingIndex = mid + 1;
            }
            else{
                endingIndex = mid - 1;
            }
        }
        return positions;
    }
}