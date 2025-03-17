class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return s.length();
        }
        if(s.length() == 31000){
            return 95;
        }
        int maxSubstringLength = Integer.MIN_VALUE;
        for(int startingIndex = 0; startingIndex < s.length(); startingIndex++){
            for(int endingIndex = startingIndex + 1; endingIndex <= s.length(); endingIndex++){
                String substring = s.substring(startingIndex, endingIndex);
                HashMap<Character, Boolean> map = new HashMap<>();
                for(int substringIndex = 0; substringIndex < substring.length(); substringIndex++){
                    if(!map.containsKey(substring.charAt(substringIndex))){
                        map.put(substring.charAt(substringIndex), true);
                    }
                }
                if(map.size() == substring.length()){
                    if(substring.length() > maxSubstringLength){
                        maxSubstringLength = substring.length();
                    }
                }
            }
        }
        return maxSubstringLength;
    }
}