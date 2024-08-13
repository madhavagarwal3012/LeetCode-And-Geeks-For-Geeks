class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sorted = new ArrayList<>();
        String range = "";
        int starting_element = Integer.MIN_VALUE;
        int final_element = Integer.MIN_VALUE;
        for(int index = 0; index < nums.length; index++){
            if(range == ""){
                range += String.valueOf(nums[index]);
                starting_element = nums[index];
                final_element = nums[index];
            }
            else if(final_element + 1 != nums[index]){
                if(Integer.valueOf(starting_element) != final_element){
                    range += "->";
                    range += String.valueOf(final_element);
                }
                final_element = Integer.MIN_VALUE;
                sorted.add(range);
                range = "";
                index--;
            }
            else{
                final_element = nums[index];
                if(index == nums.length - 1){
                    range += "->";
                    range += String.valueOf(final_element);
                }
            }
        }
        if(range != ""){
            sorted.add(range);
        }
        return sorted;
    }
}