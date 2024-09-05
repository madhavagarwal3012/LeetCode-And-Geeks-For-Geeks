class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        String sortedFrequency = "";

        for(int index = 0; index < s.length(); index++){
            if(!map.containsKey(s.charAt(index))){
                map.put(s.charAt(index), 1);
                list.add(s.charAt(index));
            }
            else{
                map.put(s.charAt(index), map.get(s.charAt(index)) + 1);
            }
        }
        while(map.size() != 0){
            int maxFrequency = Integer.MIN_VALUE;
            int maxFrequencyIndex = -1;
            for(int index = 0; index < list.size(); index++){
                if(map.get(list.get(index)) > maxFrequency){
                    maxFrequency = map.get(list.get(index));
                    maxFrequencyIndex = index;
                }
            }
            if(maxFrequencyIndex != -1){
                while(map.get(list.get(maxFrequencyIndex)) > 0){
                    sortedFrequency += list.get(maxFrequencyIndex);
                    map.put(list.get(maxFrequencyIndex), map.get(list.get(maxFrequencyIndex)) - 1);
                }
            }
            map.remove(list.get(maxFrequencyIndex));
            list.remove(maxFrequencyIndex);
        }
        return sortedFrequency;
    }
}