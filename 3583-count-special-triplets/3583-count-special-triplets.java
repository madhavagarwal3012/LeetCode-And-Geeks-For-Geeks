class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer, List<Integer>> frequencyMap = new HashMap<>();
        long count = 0;
        long mod = 1000000007;
        for(int index = 0; index < nums.length; index++){
            if(!frequencyMap.containsKey(nums[index])){
                List<Integer> indexList = new ArrayList<>();
                indexList.add(index);
                frequencyMap.put(nums[index], indexList);
            }
            else{
                List<Integer> indexList = frequencyMap.get(nums[index]);
                indexList.add(index);
                frequencyMap.put(nums[index], indexList);
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(frequencyMap.containsKey(nums[index] * 2)){
                long prevCount = 0;
                long nextCount = 0;
                List<Integer> indexList = frequencyMap.get(nums[index] * 2);
                int pos = Collections.binarySearch(indexList, index);
                if (pos < 0) pos = -pos - 1;

                prevCount = pos;
                nextCount = indexList.size() - pos;
                if (pos < indexList.size() && indexList.get(pos) == index) {
                    nextCount--;
                }
                count = (count + (prevCount * nextCount) % mod) % mod;
            }
        }
        return (int)count;
    }
}