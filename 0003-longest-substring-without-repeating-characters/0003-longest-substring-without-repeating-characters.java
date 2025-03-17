class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = 0;
        for(int startingIndex = 0; startingIndex < s.length(); startingIndex++){
            HashSet<Character> set = new HashSet<>();
            int endingIndex = startingIndex; 
            for(;endingIndex < s.length(); endingIndex++){
                if(!set.contains(s.charAt(endingIndex))){
                    set.add(s.charAt(endingIndex));
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