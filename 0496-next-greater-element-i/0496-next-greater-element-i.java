class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums2Map = new HashMap<>();
        Stack<Integer> previousGreaterElementStack = new Stack<>();

        for(int index = nums2.length - 1; index >= 0; index--){
             while(!previousGreaterElementStack.isEmpty() && nums2[index] >= previousGreaterElementStack.peek()){
                previousGreaterElementStack.pop();
            }
            if(!previousGreaterElementStack.isEmpty()){
                nums2Map.put(nums2[index], previousGreaterElementStack.peek());
                
            }
            previousGreaterElementStack.push(nums2[index]);
        }
        for(int index = 0; index < nums1.length; index++){
            if(nums2Map.containsKey(nums1[index])){
                nums1[index] = nums2Map.get(nums1[index]);
            }
            else{
                nums1[index] = -1;
            }
        }
        return nums1;
    }
    
}
