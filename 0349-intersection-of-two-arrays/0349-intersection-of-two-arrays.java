class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();
        if(nums2.length < nums1.length){
            return intersection(nums2, nums1);
        }
        for(int index = 0; index < nums1.length; index++){
            if(!map.containsKey(nums1[index])){
                map.put(nums1[index], true);
            }
        }
        for(int index = 0; index < nums2.length; index++){
            if(map.containsKey(nums2[index]) && map.get(nums2[index]) != false){
                intersectionList.add(nums2[index]);
                map.put(nums2[index], false);
            }
        }
        int intersectionArray[] = new int[intersectionList.size()];
        for(int index = 0; index < intersectionArray.length; index++){
            intersectionArray[index] = intersectionList.get(index);
        }
        return intersectionArray;
    }
}