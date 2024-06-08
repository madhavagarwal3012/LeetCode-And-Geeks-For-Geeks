class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; // If lengths are different, they cannot be anagrams
        }
        int characterCount = 0;

        for (int index = 0; index < s.length(); index++) {
            for (int subIndex = 0; subIndex < t.length(); subIndex++) {
                if(s.charAt(index) == t.charAt(subIndex)){
                    characterCount++;
                    t = t.substring(0, subIndex) + t.substring(subIndex + 1);
                    break;
                }
            }
            
        }
        return characterCount == s.length();
    }
}
