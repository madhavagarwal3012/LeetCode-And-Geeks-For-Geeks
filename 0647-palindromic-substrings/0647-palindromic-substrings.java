class Solution {
    public int countSubstrings(String s) {
        int palindromicCount = 0;
        for(int index = 0; index < s.length(); index++){
            StringBuilder substring = new StringBuilder();
            for(int substringIndex = index; substringIndex < s.length(); substringIndex++){
                substring.append(s.charAt(substringIndex));
                int startingIndex = 0;
                int endingIndex = substring.length() - 1;
                while(startingIndex < endingIndex){
                    if(substring.charAt(startingIndex) == substring.charAt(endingIndex)){
                        startingIndex++;
                        endingIndex--;
                    }
                    else{
                        break;
                    }
                }
                if(startingIndex >= endingIndex){
                    palindromicCount++;
                }
            }
        }
        return palindromicCount;
    }
}