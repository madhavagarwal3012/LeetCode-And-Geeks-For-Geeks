class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Boolean> numsMap = new HashMap<>();
        List<Integer> uniqueList = new ArrayList<>();
        List<List<Integer>> differenceList = new ArrayList<>();

        for(int index = 0; index < nums2.length; index++){
            if(!map.containsKey(nums2[index])){
                map.put(nums2[index], true);
            }
        }
        for(int index = 0; index < nums1.length; index++){
            if(!map.containsKey(nums1[index])){
                if(!numsMap.containsKey(nums1[index])){
                    numsMap.put(nums1[index], true);
                    uniqueList.add(nums1[index]);
                }
            }
        }
        differenceList.add(uniqueList);

        map = new HashMap<>();
        numsMap = new HashMap<>();
        uniqueList = new ArrayList<>();
        
        for(int index = 0; index < nums1.length; index++){
            if(!map.containsKey(nums1[index])){
                map.put(nums1[index], true);
            }
        }
        for(int index = 0; index < nums2.length; index++){
            if(!map.containsKey(nums2[index])){
                if(!numsMap.containsKey(nums2[index])){
                    numsMap.put(nums2[index], true);
                    uniqueList.add(nums2[index]);
                }
            }
        }
        differenceList.add(uniqueList);

        return differenceList;
    }
}