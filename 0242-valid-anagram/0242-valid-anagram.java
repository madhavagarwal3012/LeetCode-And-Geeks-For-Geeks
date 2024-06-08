class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; // If lengths are different, they cannot be anagrams
        }
        String characters = "";

        for (int index = 0; index < s.length(); index++) {
            for (int subIndex = 0; subIndex < t.length(); subIndex++) {
                if(s.charAt(index) == t.charAt(subIndex)){
                    characters+=s.charAt(index);
                    t = t.replaceFirst(Character.toString(t.charAt(subIndex)), "");
                    break;
                }
            }
            
        }
        return characters.length() == s.length();
    }
}
