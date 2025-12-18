class Solution {
    public static <T> List<T> sortByFrequency(List<T> list, Map<T, Integer> frequencyMap) {
        Collections.sort(list, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                
                int freq1 = frequencyMap.get(o1);
                int freq2 = frequencyMap.get(o2);

                if (freq1 == freq2) {
                    return 0;
                }
                return Integer.compare(freq2, freq1);
            }
        });

        return list;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> elements = new ArrayList<>();
        int[] result = new int[k];
        
        for(int index = 0; index < nums.length; index++){
            if(!frequencyMap.containsKey(nums[index])){
                frequencyMap.put(nums[index], 1);
                elements.add(nums[index]);
            }
            else{
                frequencyMap.put(nums[index], frequencyMap.get(nums[index]) + 1);
            }
        }
        elements = sortByFrequency(elements, frequencyMap);
        for(int index = 0; index < elements.size() && k > 0; index++, k--){
            result[index] = elements.get(index);
        }
        return result;
    }
}