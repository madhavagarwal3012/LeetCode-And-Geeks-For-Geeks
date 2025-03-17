class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = 0;
        for(int startingIndex = 0; startingIndex < s.length(); startingIndex++){
            HashMap<Character, Boolean> map = new HashMap<>();
            int endingIndex = startingIndex; 
            for(;endingIndex < s.length(); endingIndex++){
                if(!map.containsKey(s.charAt(endingIndex))){
                    map.put(s.charAt(endingIndex), true);
                    if(endingIndex - startingIndex + 1 > maxSubstringLength){
                        maxSubstringLength = endingIndex - startingIndex + 1;
                    }
                }
                else{
                    break;
                }
            }
        }
        return maxSubstringLength;
    }
}