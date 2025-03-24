class Solution {
    public int countOfSubstrings(String word, int k) {
        int substringCount = 0;
        for(int startingIndex = 0; startingIndex < word.length() && word.length() - startingIndex >= 5 + k; startingIndex++){
            int aCount = 1;
            int eCount = 1;
            int iCount = 1;
            int oCount = 1;
            int uCount = 1;
            int consonantCount = k;
            for(int endingIndex = startingIndex; endingIndex < word.length(); endingIndex++){
                if(word.charAt(endingIndex) == 'a'){
                    aCount--;
                }
                else if(word.charAt(endingIndex) == 'e'){
                    eCount--;
                }
                else if(word.charAt(endingIndex) == 'i'){
                    iCount--;
                }
                else if(word.charAt(endingIndex) == 'o'){
                    oCount--;
                }
                else if(word.charAt(endingIndex) == 'u'){
                    uCount--;
                }
                else{
                    consonantCount--;
                    if(consonantCount < 0){
                        break;
                    }
                }
                if(aCount <= 0 && eCount <= 0 && iCount <= 0 && oCount <= 0 && uCount <= 0 && consonantCount == 0){
                    substringCount++;
                }
            }
        }
        return substringCount;
    }
}