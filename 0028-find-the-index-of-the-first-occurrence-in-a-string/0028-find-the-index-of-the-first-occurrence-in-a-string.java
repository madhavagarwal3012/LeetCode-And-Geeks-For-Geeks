class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int firstOccurrenceIndex = -1;
        for(int haystackIndex = 0; haystackIndex < haystack.length(); haystackIndex++){
            firstOccurrenceIndex = haystackIndex;
            int currentIndex = haystackIndex;
            int needleIndex = 0;
            boolean characterMismatch = false;
            if(haystack.length() - currentIndex < needle.length()){
                return -1;
            }
            for(needleIndex = 0; needleIndex < needle.length(); needleIndex++, currentIndex++){
                if(haystack.charAt(currentIndex) != needle.charAt(needleIndex)){
                    characterMismatch = true;
                    break;
                }
            }
            if(!characterMismatch){
                return firstOccurrenceIndex;
            }
        }
        return -1;
    }
}