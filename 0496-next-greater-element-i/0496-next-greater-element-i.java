class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int index1 = 0; index1 < nums1.length; index1++){
            for(int index2 = 0; index2 < nums2.length; index2++){
                if(nums1[index1] == nums2[index2]){
                    index2++;
                    while(index2 < nums2.length){
                        if(nums1[index1] < nums2[index2]){
                            nums1[index1] = nums2[index2];
                            break;
                        }
                        index2++;
                    }
                    if(index2 == nums2.length){
                        nums1[index1] = -1;
                    }
                }
            }
        }
        return nums1;
    }
}