class Solution {
    public int countSubstrings(String s) {
        int palindromicCount = 0;
        for(int index = 0; index < s.length(); index++){
            for(int substringIndex = index; substringIndex < s.length(); substringIndex++){
                int startingIndex = index;
                int endingIndex = substringIndex;
                while(startingIndex < endingIndex){
                    if(s.charAt(startingIndex) == s.charAt(endingIndex)){
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