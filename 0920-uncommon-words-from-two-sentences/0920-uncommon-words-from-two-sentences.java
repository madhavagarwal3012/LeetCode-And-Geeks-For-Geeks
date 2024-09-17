class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        List<String>unique = new ArrayList<>();
        int startingIndex = 0;
        for(int index = 0; index < s1.length(); index++){
            if(s1.charAt(index) == ' '){
                if(!map1.containsKey(s1.substring(startingIndex, index))){
                    map1.put(s1.substring(startingIndex, index), 1);
                }
                else{
                    map1.put(s1.substring(startingIndex, index), map1.get(s1.substring(startingIndex, index)) + 1);
                }
                startingIndex = index + 1;
            }
        }
        if(map1.containsKey(s1.substring(startingIndex, s1.length()))){
            map1.put(s1.substring(startingIndex, s1.length()), map1.get(s1.substring(startingIndex, s1.length())) + 1);
        }
        else{
            map1.put(s1.substring(startingIndex, s1.length()), 1);
        }
        startingIndex = 0;
        for(int index = 0; index < s2.length(); index++){
            if(s2.charAt(index) == ' '){
                if(!map2.containsKey(s2.substring(startingIndex, index))){
                    map2.put(s2.substring(startingIndex, index), 1);
                }
                else{
                    map2.put(s2.substring(startingIndex, index), map2.get(s2.substring(startingIndex, index)) + 1);
                }
                startingIndex = index + 1;
            }
        }
        if(!map2.containsKey(s2.substring(startingIndex, s2.length()))){
            map2.put(s2.substring(startingIndex, s2.length()), 1);
        }
        else{
            map2.put(s2.substring(startingIndex, s2.length()), map2.get(s2.substring(startingIndex, s2.length())) + 1);
        }
        Set<String> keys = map1.keySet();
        for (String key : keys) {
            if(map2.containsKey(key)){
                map2.remove(key);
            }
            else if(map1.get(key) == 1){
                unique.add(key);
            }
        }
        keys = map2.keySet();
        for (String key : keys) {
            if(map2.get(key) == 1){
                unique.add(key);
            }
        }
        String array[] = new String[unique.size()];
        for(int index = 0; index < array.length; index++){
            array[index] = unique.get(index);
        }
        return array;
    }
}