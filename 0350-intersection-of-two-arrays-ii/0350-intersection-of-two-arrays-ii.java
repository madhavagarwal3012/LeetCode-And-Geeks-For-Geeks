class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();
        if(nums1.length < nums2.length){
            for(int index = 0; index < nums1.length; index++){
                if(!map.containsKey(nums1[index])){
                    map.put(nums1[index], 1);
                }
                else{
                    map.put(nums1[index], map.get(nums1[index]) + 1);
                }
            }
            for(int index = 0; index < nums2.length; index++){
                if(map.containsKey(nums2[index]) && map.get(nums2[index]) > 0){
                    intersectionList.add(nums2[index]);
                    map.put(nums2[index], map.get(nums2[index]) - 1);
                }
            }
            int intersectionArray[] = new int[intersectionList.size()];
            for(int index = 0; index < intersectionArray.length; index++){
                intersectionArray[index] = intersectionList.get(index);
            }
            return intersectionArray;
        }
        else{
            for(int index = 0; index < nums2.length; index++){
                if(!map.containsKey(nums2[index])){
                    map.put(nums2[index], 1);
                }
                else{
                    map.put(nums2[index], map.get(nums2[index]) + 1);
                }
            }
            for(int index = 0; index < nums1.length; index++){
                if(map.containsKey(nums1[index]) && map.get(nums1[index]) > 0){
                    intersectionList.add(nums1[index]);
                    map.put(nums1[index], map.get(nums1[index]) - 1);
                }
            }
            int intersectionArray[] = new int[intersectionList.size()];
            for(int index = 0; index < intersectionArray.length; index++){
                intersectionArray[index] = intersectionList.get(index);
            }
            return intersectionArray;
        }
    }
}