class Solution {
    public String longestPalindrome(String s) {
        String longestPalindromicSubstring = "";
        for(int startingIndex = 0; startingIndex < s.length(); startingIndex++){
            for(int endingIndex = startingIndex; endingIndex < s.length(); endingIndex++){
                int si = startingIndex, ei = endingIndex;
                while(si < ei){
                    if(s.charAt(si) != s.charAt(ei)){
                        break;
                    }
                    si++;
                    ei--;
                }
                if(si >= ei){
                    if(endingIndex - startingIndex + 1 > longestPalindromicSubstring.length()){
                        longestPalindromicSubstring = s.substring(startingIndex, endingIndex + 1);
                    }
                }
            }
        }
        return longestPalindromicSubstring;
    }
}