class Solution {
    public int rearrangeCharacters(String s, String target) {
        int output = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int index = 0; index < s.length(); index++){
            if(!map.containsKey(s.charAt(index))){
                map.put(s.charAt(index), 1);
            }
            else{
                map.put(s.charAt(index), map.get(s.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < s.length(); index++){
            int characterCount = 0;
            for(int subIndex = 0; subIndex < target.length(); subIndex++){
                if(map.containsKey(target.charAt(subIndex)) && map.get(target.charAt(subIndex)) > 0){
                    characterCount++;
                    map.put(target.charAt(subIndex), map.get(target.charAt(subIndex)) - 1);
                }
            }
            if(characterCount == target.length()){
                output++;
            }
        }
        return output;
    }
}