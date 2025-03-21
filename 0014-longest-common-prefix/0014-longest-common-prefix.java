class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String commonPrefix = "";
        String firstString = strs[0];
        String secondString = strs[1];

        for(int index = 0; index < firstString.length() && index < secondString.length(); index++){
            if(firstString.charAt(index) != secondString.charAt(index)){
                break;
            }
            commonPrefix+=firstString.charAt(index);
        }
        for(int strsIndex = 2; strsIndex < strs.length; strsIndex++){
            String commonChars = "";
            for(int index = 0; index < commonPrefix.length() && index < strs[strsIndex].length(); index++){
                if(commonPrefix.charAt(index) != strs[strsIndex].charAt(index)){
                    break;
                }
                else{
                    commonChars+=commonPrefix.charAt(index);
                }
            }
            commonPrefix = commonChars;
        }
        return commonPrefix;
    }
}